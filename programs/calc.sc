__config() -> {'stay_loaded' -> true};

__command()->(
    _calc();
);

_c()->(
    player=player();    
    global_x=query(player,'x');
    global_z=query(player,'z');
    return('')
);

_calc()->(
    _c();
    player=player();
    if(query(player,'dimension')=='overworld',(
        nether_x = global_x/8;
        nether_z = global_z/8;
        run('/say §2OVER§r: §6X§r: '+round(global_x)+', §6Z§r: '+round(global_z));
        run('/say §4NETHER§r: §6X§r: '+round(nether_x)+', §6Z§r: '+round(nether_z));
        ),
        (
        over_x = global_x*8;
        over_z = global_z*8;
        run('/say §4NETHER§r: §6X§r: '+round(global_x)+', §6Z§r: '+round(global_z));
        run('/say §2OVER§r: §6X§r: '+round(over_x)+', §6Z§r: '+round(over_z));
        )      
    );
);
