package net.Corior48.waterbailey.datagen;

import net.Corior48.waterbailey.Waterbailey;
import net.Corior48.waterbailey.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Waterbailey.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.A_MOTHERS_LOVE);
        simpleItem(ModItems.AMONG_US_LOFI);
        simpleItem(ModItems.AMONG_US_REMIX);
        simpleItem(ModItems.ANGEL_HARE_SIDE_A);
        simpleItem(ModItems.ASGORE_RUNS_OVER_DESS);
        simpleItem(ModItems.BLAZING_HEART);
        simpleItem(ModItems.DISCO_EGGMANS_ANNOUCNEMENT);
        simpleItem(ModItems.DONT_MINE_AT_NIGHT);
        simpleItem(ModItems.EMBERFIRE);
        simpleItem(ModItems.ENDLESS_ENCORE);
        simpleItem(ModItems.FURINA_THEME);
        simpleItem(ModItems.GANGNAM_STYLE);
        simpleItem(ModItems.GOD_DEVOURING_MANIA);
        simpleItem(ModItems.INTERSTELLAR_DRIFT);
        simpleItem(ModItems.IRRESISTIBLE_FORCE);
        simpleItem(ModItems.JAKA_JAAN);
        simpleItem(ModItems.JAKA_JAAN_ALTERNATIVE);
        simpleItem(ModItems.KITCHEN_GUN);
        simpleItem(ModItems.KYLES_MOM);
        simpleItem(ModItems.LA_VAGUELETTE);
        simpleItem(ModItems.MAJIN_FOREST_ESCAPE);
        simpleItem(ModItems.MEGALOVANIA_1);
        simpleItem(ModItems.NEVER_GONNA_GIVE_YOU_UP);
        simpleItem(ModItems.NOD_KRAI);
        simpleItem(ModItems.OH_DESPAIR);
        simpleItem(ModItems.PLEASANT_TIPSINESS);
        simpleItem(ModItems.POLUMNIA_OMNIA);
        simpleItem(ModItems.RESULTS_AND_CHILL);
        simpleItem(ModItems.STILL_ALIVE);
        simpleItem(ModItems.WANT_YOU_GONE);
        simpleItem(ModItems.SUMMER_TROPICALA);
        simpleItem(ModItems.TAR_TAR_TAGLIA);
        simpleItem(ModItems.TEST_DISC);
        simpleItem(ModItems.VILLAGER_LULLABY);
        simpleItem(ModItems.VS_SONIC_EXE_RERUN);
        simpleItem(ModItems.WATER_ME_DOWN);
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Waterbailey.MODID,"item/" + item.getId().getPath()));
    }
}
