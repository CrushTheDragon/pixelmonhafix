package crushthedragon.com.github.listener;

import com.pixelmonmod.pixelmon.api.events.spawning.PixelmonSpawnerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PokemonSpawnerEventListener {

    @SubscribeEvent
    public void onEntitySpawn(PixelmonSpawnerEvent.Post event) {
        event.getPokemon().setHA(false);
        event.getPokemon().resetAbility();
    }
}
