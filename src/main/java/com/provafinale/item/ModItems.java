package com.provafinale.item;

import com.provafinale.ProvaFinale;
import com.provafinale.item.custom.ChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems   {

    //Creazione degli oggetti
    public static final Item PINK_SUBSTANCE = registerItem("pink_substance", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(80)));

    public static final Item GOLDEN_BREAD = registerItem("golden_bread", new Item(new Item.Settings().food(ModFoodComponent.GOLDENBREAD)));

    public static final Item SGORBIO = registerItem("sgorbio", new Item(new Item.Settings()));


    //Metodo per registrare un blocco
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ProvaFinale.MOD_ID, name), item);
    }


    //AGGIUNGO ALLA CREATIVA
    public static void registerModItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {;
            entries.add(PINK_SUBSTANCE);
            entries.add(CHISEL);
            entries.add(GOLDEN_BREAD);
            entries.add(SGORBIO);
        });

    }

}
