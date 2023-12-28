package net.Elliot.cosmod.item;

import net.Elliot.cosmod.CosMod;
import net.Elliot.cosmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COSMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CosMod.MOD_ID, "cosmoc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cosmod"))
                    .icon(() -> new ItemStack(ModItems.COSMITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COSMITE);
                        entries.add(ModItems.COSMITE_BAR);

                        entries.add(ModItems.COSMITE_PICKAXE);
                        entries.add(ModItems.COSMITE_AXE);
                        entries.add(ModItems.COSMITE_SWORD);
                        entries.add(ModItems.COSMITE_SHOVEL);
                        entries.add(ModItems.COSMITE_HOE);

                        entries.add(ModBlocks.COSMITE_BLOCK);
                        entries.add(ModBlocks.COSMITE_ORE);
                    }).build());

    public static void registerItemGroups(){
        CosMod.LOGGER.info("Registering Item Groups for " + CosMod.MOD_ID);
    }
}
