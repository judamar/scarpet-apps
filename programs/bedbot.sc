//by judamar

__config()->{
    'stay_loaded' -> true;
};

player = player();

__on_player_connects(player) -> (
    sleep(1000);
    run('execute run player BedBot spawn at ~ ~ ~ facing ~ ~ in minecraft:overworld'); 
    //cambiar las '~ ~ ~' del spawn at por las coordenadas Targeted Block del composter, ejemplo '15.5 86.5 -2.5', deben tener el .5

    //modificar las '~ ~' del facing dependiendo de hacia donde esté apuntando la cama: (north: [180 0]; south: [0 0]; east: [-90 0]; west: [90 0])
    sleep(1000);
    run('execute run player BedBot sneak');
    sleep(1000);
    run('execute run player BedBot use interval 20');
);