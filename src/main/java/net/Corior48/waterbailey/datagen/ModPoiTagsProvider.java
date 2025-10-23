package net.Corior48.waterbailey.datagen;

import net.Corior48.waterbailey.Waterbailey;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PoiTypeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PoiTypeTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModPoiTagsProvider extends PoiTypeTagsProvider {
    public ModPoiTagsProvider(PackOutput p_256012_, CompletableFuture<HolderLookup.Provider> p_256617_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_256012_, p_256617_, Waterbailey.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256206_) {
        tag(PoiTypeTags.ACQUIRABLE_JOB_SITE)
                .addOptional(new ResourceLocation(Waterbailey.MODID, "matt_poi_type"));
    }
}
