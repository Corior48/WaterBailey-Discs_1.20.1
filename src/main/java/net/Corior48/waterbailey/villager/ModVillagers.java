package net.Corior48.waterbailey.villager;

import com.google.common.collect.ImmutableSet;
import net.Corior48.waterbailey.Waterbailey;
import net.Corior48.waterbailey.block.ModBlocks;
import net.Corior48.waterbailey.sound.ModSounds;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, Waterbailey.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, Waterbailey.MODID);

    public static final RegistryObject<PoiType> MATT_POI_TYPE = POI_TYPES.register("matt_poi_type",
            () -> new PoiType(
                    ImmutableSet.copyOf(ModBlocks.MUSIC_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1, 1
            )
    );

    public static final RegistryObject<VillagerProfession> MUSICIAN =
        VILLAGER_PROFESSIONS.register("musician", () -> new VillagerProfession("musician", holder -> holder.get() == MATT_POI_TYPE.get(), holder -> holder.get() == MATT_POI_TYPE.get(),
                ImmutableSet.of(), ImmutableSet.of(), ModSounds.MUSICIAN_USE.get()));



    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

}
