package net.Elliot.cosmod.item;

import net.Elliot.cosmod.CosMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COSMITE = registerItem("cosmite", new Item(new FabricItemSettings()));
    public static final Item COSMITE_BAR = registerItem("cosmite_bar", new Item(new FabricItemSettings()));

    public static final Item COSMITE_PICKAXE = registerItem("cosmite_pickaxe",
            new PickaxeItem(ModToolMaterial.COSMITE_BAR, 2, 2f, new FabricItemSettings()));
    public static final Item COSMITE_AXE = registerItem("cosmite_axe",
            new AxeItem(ModToolMaterial.COSMITE_BAR, 3, 1f, new FabricItemSettings()));
    public static final Item COSMITE_SWORD = registerItem("cosmite_sword",
            new SwordItem(ModToolMaterial.COSMITE_BAR, 5, 3f, new FabricItemSettings()));
    public static final Item COSMITE_SHOVEL = registerItem("cosmite_shovel",
            new ShovelItem(ModToolMaterial.COSMITE_BAR, 0, 0f, new FabricItemSettings()));
    public static final Item COSMITE_HOE = registerItem("cosmite_hoe",
            new HoeItem(ModToolMaterial.COSMITE_BAR, 0, 0f, new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(COSMITE);
        entries.add(COSMITE_BAR);
    }

    public  static  void registerModItems() {
        CosMod.LOGGER.info("Registering Mod Items for" + CosMod.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CosMod.MOD_ID, name), item);
    }
}