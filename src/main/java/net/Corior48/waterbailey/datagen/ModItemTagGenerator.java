package net.Corior48.waterbailey.datagen;

import net.Corior48.waterbailey.Waterbailey;
import net.Corior48.waterbailey.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Waterbailey.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.A_MOTHERS_LOVE.get(),
        ModItems.AMONG_US_LOFI.get(),
        ModItems.AMONG_US_REMIX.get(),
        ModItems.ANGEL_HARE_SIDE_A.get(),
        ModItems.ASGORE_RUNS_OVER_DESS.get(),
        ModItems.BLAZING_HEART.get(),
        ModItems.DISCO_EGGMANS_ANNOUNCEMENT.get(),
        ModItems.DONT_MINE_AT_NIGHT.get(),
        ModItems.EMBERFIRE.get(),
        ModItems.ENDLESS_ENCORE.get(),
        ModItems.FURINA_THEME.get(),
        ModItems.GANGNAM_STYLE.get(),
        ModItems.GOD_DEVOURING_MANIA.get(),
        ModItems.INTERSTELLAR_DRIFT.get(),
        ModItems.IRRESISTIBLE_FORCE.get(),
        ModItems.JAKA_JAAN.get(),
        ModItems.JAKA_JAAN_ALTERNATIVE.get(),
        ModItems.KITCHEN_GUN.get(),
        ModItems.KYLES_MOM.get(),
        ModItems.LA_VAGUELETTE.get(),
        ModItems.MAJIN_FOREST_ESCAPE.get(),
        ModItems.MEGALOVANIA_1.get(),
        ModItems.NEVER_GONNA_GIVE_YOU_UP.get(),
        ModItems.NOD_KRAI.get(),
        ModItems.OH_DESPAIR.get(),
        ModItems.PLEASANT_TIPSINESS.get(),
        ModItems.POLUMNIA_OMNIA.get(),
        ModItems.RESULTS_AND_CHILL.get(),
        ModItems.STILL_ALIVE.get(),
        ModItems.WANT_YOU_GONE.get(),
        ModItems.SUMMER_TROPICALA.get(),
        ModItems.TAR_TAR_TAGLIA.get(),
        ModItems.TEST_DISC.get(),
        ModItems.VILLAGER_LULLABY.get(),
        ModItems.VS_SONIC_EXE_RERUN.get(),
        ModItems.WATER_ME_DOWN.get());

    }
}
