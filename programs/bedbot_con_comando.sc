//by judamar

__config()->{
    'stay_loaded' -> true;
};

__command()->(
    run('execute run player BedBot spawn at -1388.5 69.5 1731.5 facing 0 0 in minecraft:overworld'); //cambiar las '~ ~ ~' por las coordenadas del composter, ejemplo '15.5 86.5 -2.5', deben tener el .5
    run('execute run player BedBot sneak');
    run('execute run player BedBot use interval 20');
);

//player = player();

//__on_player_connects(player) -> (
//    run('execute run player BedBot spawn at -1388.5 69.5 1731.5 facing 0 0 in minecraft:overworld'); //cambiar las '~ ~ ~' por las coordenadas del composter, ejemplo '15.5 86.5 -2.5', deben tener el .5
//    sleep(100);
//    run('execute run player BedBot sneak');
//    run('execute run player BedBot use interval 20');
//);

