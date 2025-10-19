package net.Corior48.waterbailey.item;

import net.Corior48.waterbailey.Waterbailey;
import net.Corior48.waterbailey.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Waterbailey.MODID);

    public static final RegistryObject<Item> CREATIVE_DISCS_ICON = ITEMS.register("creative_discs_icon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_DISC = ITEMS.register("blank_disc",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TEST_DISC = ITEMS.register("test_disc",
            () -> new RecordItem(15, ModSounds.TEST_DISC, new Item.Properties().stacksTo(1), 6000));
    public static final RegistryObject<Item> MEGALOVANIA_1 = ITEMS.register("megalovania_1",
            () -> new RecordItem(15, ModSounds.MEGALOVANIA_1, new Item.Properties().stacksTo(1), 4000));
    public static final RegistryObject<Item> ANGEL_HARE_SIDE_A = ITEMS.register("angel_hare_side_a",
            () -> new RecordItem(15, ModSounds.ANGEL_HARE_SIDE_A, new Item.Properties().stacksTo(1), 24180));
    public static final RegistryObject<Item> OH_DESPAIR = ITEMS.register("oh_despair",
            () -> new RecordItem(15, ModSounds.OH_DESPAIR, new Item.Properties().stacksTo(1), 3040));
    public static final RegistryObject<Item> VILLAGER_LULLABY = ITEMS.register("villager_lullaby",
            () -> new RecordItem(15, ModSounds.VILLAGER_LULLABY, new Item.Properties().stacksTo(1), 3300));
    public static final RegistryObject<Item> JAKA_JAAN = ITEMS.register("jaka_jaan",
            () -> new RecordItem(15, ModSounds.JAKA_JAAN, new Item.Properties().stacksTo(1), 1840));
    public static final RegistryObject<Item> JAKA_JAAN_ALTERNATIVE = ITEMS.register("jaka_jaan_alternative",
            () -> new RecordItem(15, ModSounds.JAKA_JAAN_ALTERNATIVE, new Item.Properties().stacksTo(1), 4280));
    public static final RegistryObject<Item> AMONG_US_REMIX = ITEMS.register("among_us_remix",
            () -> new RecordItem(15, ModSounds.AMONG_US_REMIX, new Item.Properties().stacksTo(1), 1460));
    public static final RegistryObject<Item> GANGNAM_STYLE = ITEMS.register("gangnam_style",
            () -> new RecordItem(15, ModSounds.GANGNAM_STYLE, new Item.Properties().stacksTo(1), 4380));
    public static final RegistryObject<Item> A_MOTHERS_LOVE = ITEMS.register("a_mothers_love",
            () -> new RecordItem(15, ModSounds.A_MOTHERS_LOVE, new Item.Properties().stacksTo(1), 5700));
    public static final RegistryObject<Item> BLAZING_HEART = ITEMS.register("blazing_heart",
            () -> new RecordItem(15, ModSounds.BLAZING_HEART, new Item.Properties().stacksTo(1), 3540));
    public static final RegistryObject<Item> DISCO_EGGMANS_ANNOUNCEMENT = ITEMS.register("disco_eggmans_announcement",
            () -> new RecordItem(15, ModSounds.DISCO_EGGMANS_ANNOUNCEMENT, new Item.Properties().stacksTo(1), 3380));
    public static final RegistryObject<Item> DONT_MINE_AT_NIGHT = ITEMS.register("dont_mine_at_night",
            () -> new RecordItem(15, ModSounds.DONT_MINE_AT_NIGHT, new Item.Properties().stacksTo(1), 4560));
    public static final RegistryObject<Item> EMBERFIRE = ITEMS.register("emberfire",
            () -> new RecordItem(15, ModSounds.EMBERFIRE, new Item.Properties().stacksTo(1), 3400));
    public static final RegistryObject<Item> ENDLESS_ENCORE = ITEMS.register("endless_encore",
            () -> new RecordItem(15, ModSounds.ENDLESS_ENCORE, new Item.Properties().stacksTo(1), 3120));
    public static final RegistryObject<Item> FURINA_THEME = ITEMS.register("furina_theme",
            () -> new RecordItem(15, ModSounds.FURINA_THEME, new Item.Properties().stacksTo(1), 3660));
    public static final RegistryObject<Item> KYLES_MOM = ITEMS.register("kyles_mom",
            () -> new RecordItem(15, ModSounds.KYLES_MOM, new Item.Properties().stacksTo(1), 1980));
    public static final RegistryObject<Item> MAJIN_FOREST_ESCAPE = ITEMS.register("majin_forest_escape",
            () -> new RecordItem(15, ModSounds.MAJIN_FOREST_ESCAPE, new Item.Properties().stacksTo(1), 3620));
    public static final RegistryObject<Item> NEVER_GONNA_GIVE_YOU_UP = ITEMS.register("never_gonna_give_you",
            () -> new RecordItem(15, ModSounds.NEVER_GONNA_GIVE_YOU_UP, new Item.Properties().stacksTo(1), 4260));
    public static final RegistryObject<Item> RESULTS_AND_CHILL = ITEMS.register("results_and_chill",
            () -> new RecordItem(15, ModSounds.RESULTS_AND_CHILL, new Item.Properties().stacksTo(1), 3760));
    public static final RegistryObject<Item> STILL_ALIVE = ITEMS.register("still_alive",
            () -> new RecordItem(15, ModSounds.STILL_ALIVE, new Item.Properties().stacksTo(1), 3680));
    public static final RegistryObject<Item> WANT_YOU_GONE = ITEMS.register("want_you_gone",
            () -> new RecordItem(15, ModSounds.WANT_YOU_GONE, new Item.Properties().stacksTo(1), 2860));
    public static final RegistryObject<Item> WATER_ME_DOWN = ITEMS.register("water_me_down",
            () -> new RecordItem(15, ModSounds.WATER_ME_DOWN, new Item.Properties().stacksTo(1), 3400));
    public static final RegistryObject<Item> AMONG_US_LOFI = ITEMS.register("among_us_lofi",
            () -> new RecordItem(15, ModSounds.AMONG_US_LOFI, new Item.Properties().stacksTo(1), 2740));
    public static final RegistryObject<Item> VS_SONIC_EXE_RERUN = ITEMS.register("vs_sonic_exe_rerun",
            () -> new RecordItem(15, ModSounds.VS_SONIC_EXE_RERUN, new Item.Properties().stacksTo(1), 4680));
    public static final RegistryObject<Item> GOD_DEVOURING_MANIA = ITEMS.register("god_devouring_mania",
            () -> new RecordItem(15, ModSounds.GOD_DEVOURING_MANIA, new Item.Properties().stacksTo(1), 4360));
    public static final RegistryObject<Item> IRRESISTIBLE_FORCE = ITEMS.register("irresistible_force",
            () -> new RecordItem(15, ModSounds.IRRESISTIBLE_FORCE, new Item.Properties().stacksTo(1), 4980));
    public static final RegistryObject<Item> INTERSTELLAR_DRIFT = ITEMS.register("interstellar_drift",
            () -> new RecordItem(15, ModSounds.INTERSTELLAR_DRIFT, new Item.Properties().stacksTo(1), 1860));
    public static final RegistryObject<Item> KITCHEN_GUN = ITEMS.register("kitchen_gun",
            () -> new RecordItem(15, ModSounds.KITCHEN_GUN, new Item.Properties().stacksTo(1), 3700));
    public static final RegistryObject<Item> LA_VAGUELETTE = ITEMS.register("la_vaguelette",
            () -> new RecordItem(15, ModSounds.LA_VAGUELETTE, new Item.Properties().stacksTo(1), 4980));
    public static final RegistryObject<Item> PLEASANT_TIPSINESS = ITEMS.register("pleasant_tipsiness",
            () -> new RecordItem(15, ModSounds.PLEASANT_TIPSINESS, new Item.Properties().stacksTo(1), 1940));
    public static final RegistryObject<Item> POLUMNIA_OMNIA = ITEMS.register("polumnia_omnia",
            () -> new RecordItem(15, ModSounds.POLUMNIA_OMNIA, new Item.Properties().stacksTo(1), 4000));
    public static final RegistryObject<Item> TAR_TAR_TAGLIA = ITEMS.register("tar_tar_taglia",
            () -> new RecordItem(15, ModSounds.TAR_TAR_TAGLIA, new Item.Properties().stacksTo(1), 1400));
    public static final RegistryObject<Item> ASGORE_RUNS_OVER_DESS = ITEMS.register("asgore_runs_over_dess",
            () -> new RecordItem(15, ModSounds.ASGORE_RUNS_OVER_DESS, new Item.Properties().stacksTo(1), 3100));
    public static final RegistryObject<Item> NOD_KRAI = ITEMS.register("nod_krai",
            () -> new RecordItem(15, ModSounds.NOD_KRAI, new Item.Properties().stacksTo(1), 4260));
    public static final RegistryObject<Item> SUMMER_TROPICALA = ITEMS.register("summer_tropicala",
            () -> new RecordItem(15, ModSounds.SUMMER_TROPICALA, new Item.Properties().stacksTo(1), 4260));

    public static final RegistryObject<Item> MUSICIAN_USE = ITEMS.register("musician_use",
            () -> new RecordItem(15, ModSounds.MUSICIAN_USE, new Item.Properties().stacksTo(1), 300));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
