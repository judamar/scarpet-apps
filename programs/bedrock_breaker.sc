//by judamar
//inspired in instamine_deepslate.sc = https://github.com/gnembon/scarpet/blob/master/programs/survival/instamine_deepslate.sc

//pa romper la bedrock con pico de netherite o diamante con eficiencia 5 y haste 2

__config() -> {
  'stay_loaded' -> true,
};

global_instamine_blocks = [
  'bedrock'
];


global_required_pickaxes = [ //tools requi
  'diamond_pickaxe',
  'netherite_pickaxe'
];

__on_player_clicks_block(player, block, face) -> (
  held_item = player ~ 'holds';
  if(held_item != null,
    if(global_instamine_blocks~ str(block) != null && global_required_pickaxes ~ (held_item:0) != null,
      if(__has_haste_2(player) && __has_efficiency_5(held_item:2),
        destroy(block);
      );
    );
  );
);

__has_haste_2(player) -> (
  haste_effect = query(player, 'effect', 'haste');
  haste_effect != null && haste_effect:0 >= 1;
);

__has_efficiency_5(nbt) -> (
  enchants_list = parse_nbt(nbt):'Enchantments';
  if(enchants_list != null,
    first(enchants_list,
      _:'id' == 'minecraft:efficiency' && _:'lvl' >= 5;
    ) != null,
    false
  );
);