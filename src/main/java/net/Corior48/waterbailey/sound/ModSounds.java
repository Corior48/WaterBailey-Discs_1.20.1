package net.Corior48.waterbailey.sound;

import net.Corior48.waterbailey.Waterbailey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Waterbailey.MODID);


    public static final RegistryObject<SoundEvent> TEST_DISC = registerSoundEvents("test_disc");
    public static final RegistryObject<SoundEvent> MEGALOVANIA_1 = registerSoundEvents("megalovania_1");
    public static final RegistryObject<SoundEvent> ANGEL_HARE_SIDE_A = registerSoundEvents("angel_hare_side_a");
    public static final RegistryObject<SoundEvent> OH_DESPAIR = registerSoundEvents("oh_despair");
    public static final RegistryObject<SoundEvent> VILLAGER_LULLABY = registerSoundEvents("villager_lullaby");
    public static final RegistryObject<SoundEvent> JAKA_JAAN = registerSoundEvents("jaka_jaan");
    public static final RegistryObject<SoundEvent> JAKA_JAAN_ALTERNATIVE = registerSoundEvents("jaka_jaan_alternative");
    public static final RegistryObject<SoundEvent> AMONG_US_REMIX = registerSoundEvents("among_us_remix");
    public static final RegistryObject<SoundEvent> GANGNAM_STYLE = registerSoundEvents("gangnam_style");
    public static final RegistryObject<SoundEvent> A_MOTHERS_LOVE = registerSoundEvents("a_mothers_love");
    public static final RegistryObject<SoundEvent> BLAZING_HEART = registerSoundEvents("blazing_heart");
    public static final RegistryObject<SoundEvent> DISCO_EGGMANS_ANNOUNCEMENT = registerSoundEvents("disco_eggmans_announcement");
    public static final RegistryObject<SoundEvent> DONT_MINE_AT_NIGHT = registerSoundEvents("dont_mine_at_night");
    public static final RegistryObject<SoundEvent> EMBERFIRE = registerSoundEvents("emberfire");
    public static final RegistryObject<SoundEvent> ENDLESS_ENCORE = registerSoundEvents("endless_encore");
    public static final RegistryObject<SoundEvent> FURINA_THEME = registerSoundEvents("furina_theme");
    public static final RegistryObject<SoundEvent> KYLES_MOM = registerSoundEvents("kyles_mom");
    public static final RegistryObject<SoundEvent> MAJIN_FOREST_ESCAPE = registerSoundEvents("majin_forest_escape");
    public static final RegistryObject<SoundEvent> NEVER_GONNA_GIVE_YOU_UP = registerSoundEvents("never_gonna_give_you_up");
    public static final RegistryObject<SoundEvent> RESULTS_AND_CHILL = registerSoundEvents("results_and_chill");
    public static final RegistryObject<SoundEvent> STILL_ALIVE = registerSoundEvents("still_alive");
    public static final RegistryObject<SoundEvent> WANT_YOU_GONE = registerSoundEvents("want_you_gone");
    public static final RegistryObject<SoundEvent> WATER_ME_DOWN = registerSoundEvents("water_me_down");
    public static final RegistryObject<SoundEvent> AMONG_US_LOFI = registerSoundEvents("among_us_lofi");
    public static final RegistryObject<SoundEvent> VS_SONIC_EXE_RERUN = registerSoundEvents("vs_sonic_exe_rerun");
    public static final RegistryObject<SoundEvent> GOD_DEVOURING_MANIA = registerSoundEvents("god_devouring_mania");
    public static final RegistryObject<SoundEvent> INTERSTELLAR_DRIFT = registerSoundEvents("interstellar_drift");
    public static final RegistryObject<SoundEvent> IRRESISTIBLE_FORCE = registerSoundEvents("irresistible_force");
    public static final RegistryObject<SoundEvent> KITCHEN_GUN = registerSoundEvents("kitchen_gun");
    public static final RegistryObject<SoundEvent> LA_VAGUELETTE = registerSoundEvents("la_vaguelette");
    public static final RegistryObject<SoundEvent> PLEASANT_TIPSINESS = registerSoundEvents("pleasant_tipsiness");
    public static final RegistryObject<SoundEvent> POLUMNIA_OMNIA = registerSoundEvents("polumnia_omnia");
    public static final RegistryObject<SoundEvent> TAR_TAR_TAGLIA = registerSoundEvents("tar_tar_taglia");
    public static final RegistryObject<SoundEvent> ASGORE_RUNS_OVER_DESS = registerSoundEvents("asgore_runs_over_dess");
    public static final RegistryObject<SoundEvent> NOD_KRAI = registerSoundEvents("nod_krai");
    public static final RegistryObject<SoundEvent> SUMMER_TROPICALA = registerSoundEvents("summer_tropicala");


    public static final RegistryObject<SoundEvent> MUSICIAN_USE = registerSoundEvents("musician_use");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Waterbailey.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
