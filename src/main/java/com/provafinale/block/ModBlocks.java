package com.provafinale.block;

import com.provafinale.ProvaFinale;
import com.provafinale.block.custom.MagicBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //ISTANZIO I BLOCCHI CHE REGISTRO
    public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHISELED_BOOKSHELF)));



    //Metodi per registrare un blocco
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ProvaFinale.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ProvaFinale.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }



    //AGGIUNGO ALLA CREATIVA
    public static void registerModBlocks() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {;
            entries.add(COMPRESSED_COBBLESTONE);
            entries.add(MAGIC_BLOCK);
        });

    }
}
