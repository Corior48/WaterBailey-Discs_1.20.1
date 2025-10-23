package net.Corior48.waterbailey.item;

import net.Corior48.waterbailey.Waterbailey;
import net.Corior48.waterbailey.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.Corior48.waterbailey.item.ModItems.*;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB , Waterbailey.MODID);


    public static final RegistryObject<CreativeModeTab> WATERBAILEY_DISCS = CREATIVE_MODE_TABS.register("waterbailey_discs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CREATIVE_DISCS_ICON.get()))
                    .title(Component.translatable("itemGroup.waterbailey.discs"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.MUSIC_BLOCK.get());
                        pOutput.accept(BLANK_DISC.get());
                        pOutput.accept(ANGEL_HARE_SIDE_A.get());
                        pOutput.accept(OH_DESPAIR.get());
                        pOutput.accept(VILLAGER_LULLABY.get());
                        pOutput.accept(MEGALOVANIA_1.get());
                        pOutput.accept(JAKA_JAAN.get());
                        pOutput.accept(JAKA_JAAN_ALTERNATIVE.get());
                        pOutput.accept(AMONG_US_REMIX.get());
                        pOutput.accept(AMONG_US_LOFI.get());
                        pOutput.accept(GANGNAM_STYLE.get());
                        pOutput.accept(A_MOTHERS_LOVE.get());
                        pOutput.accept(BLAZING_HEART.get());
                        pOutput.accept(DISCO_EGGMANS_ANNOUCNEMENT.get());
                        pOutput.accept(DONT_MINE_AT_NIGHT.get());
                        pOutput.accept(EMBERFIRE.get());
                        pOutput.accept(ENDLESS_ENCORE.get());
                        pOutput.accept(FURINA_THEME.get());
                        pOutput.accept(KYLES_MOM.get());
                        pOutput.accept(MAJIN_FOREST_ESCAPE.get());
                        pOutput.accept(NEVER_GONNA_GIVE_YOU_UP.get());
                        pOutput.accept(RESULTS_AND_CHILL.get());
                        pOutput.accept(STILL_ALIVE.get());
                        pOutput.accept(WANT_YOU_GONE.get());
                        pOutput.accept(WATER_ME_DOWN.get());
                        pOutput.accept(VS_SONIC_EXE_RERUN.get());
                        pOutput.accept(GOD_DEVOURING_MANIA.get());
                        pOutput.accept(INTERSTELLAR_DRIFT.get());
                        pOutput.accept(IRRESISTIBLE_FORCE.get());
                        pOutput.accept(KITCHEN_GUN.get());
                        pOutput.accept(LA_VAGUELETTE.get());
                        pOutput.accept(PLEASANT_TIPSINESS.get());
                        pOutput.accept(POLUMNIA_OMNIA.get());
                        pOutput.accept(TAR_TAR_TAGLIA.get());
                        pOutput.accept(ASGORE_RUNS_OVER_DESS.get());
                        pOutput.accept(NOD_KRAI.get());
                        pOutput.accept(SUMMER_TROPICALA.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
         CREATIVE_MODE_TABS.register(eventBus);
    }
}
