package net.nevixity.nothingmod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.nevixity.nothingmod.NothingMod;



public class ModSounds {

  public static final SoundEvent AUTUMN_FALLS_DISC = registerSoundEvent("autumn_falls_disc");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier identifier = new Identifier(NothingMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
    public static void registersounds() {
        NothingMod.LOGGER.info("Registering Mod Sounds" + NothingMod.MOD_ID);

    }
}