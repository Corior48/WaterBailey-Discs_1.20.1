package net.Corior48.waterbailey.datagen;

import net.Corior48.waterbailey.Waterbailey;
import net.Corior48.waterbailey.sound.ModSounds;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class ModSoundsProvider extends SoundDefinitionsProvider {

    protected ModSoundsProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, Waterbailey.MODID, helper);
    }

    @Override
    public void registerSounds() {
        add(ModSounds.TEST_DISC.get(), definition()
                .with(sound("waterbailey:test_disc")));
    }
}
