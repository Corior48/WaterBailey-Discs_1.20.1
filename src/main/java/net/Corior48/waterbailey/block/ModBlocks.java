package net.Corior48.waterbailey.block;

import net.Corior48.waterbailey.Waterbailey;
import net.Corior48.waterbailey.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Waterbailey.MODID);

    public static final RegistryObject<Block> MUSIC_BLOCK = registerBlock("music_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)));



     private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
         RegistryObject<T> toReturn = BLOCKS.register(name, block);
         registerBlockItem(name, toReturn);
         return toReturn;
     }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
         return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


            public static void register(IEventBus eventBus) {
                BLOCKS.register( eventBus );
            }
}
