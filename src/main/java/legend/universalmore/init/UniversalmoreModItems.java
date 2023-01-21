
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package legend.universalmore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import legend.universalmore.item.UniversalKeyItem;
import legend.universalmore.item.SuperIngotItem;
import legend.universalmore.item.OneLevelCompressedDiamondBlockSwordItem;
import legend.universalmore.item.OneLevelCompressedDiamondBlockShovelItem;
import legend.universalmore.item.OneLevelCompressedDiamondBlockPickaxeItem;
import legend.universalmore.item.OneLevelCompressedDiamondBlockHoeItem;
import legend.universalmore.item.OneLevelCompressedDiamondBlockDimensionItem;
import legend.universalmore.item.OneLevelCompressedDiamondBlockAxeItem;
import legend.universalmore.item.ObsidianStickItem;
import legend.universalmore.UniversalmoreMod;

public class UniversalmoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UniversalmoreMod.MODID);
	public static final RegistryObject<Item> OBSIDIAN_STICK = REGISTRY.register("obsidian_stick", () -> new ObsidianStickItem());
	public static final RegistryObject<Item> ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK = block(UniversalmoreModBlocks.ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK,
			UniversalmoreModTabs.TAB_UNIVERSAL_MORE);
	public static final RegistryObject<Item> SUPER_INGOT = REGISTRY.register("super_ingot", () -> new SuperIngotItem());
	public static final RegistryObject<Item> ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK_DIMENSION = REGISTRY
			.register("one_level_compressed_diamond_block_dimension", () -> new OneLevelCompressedDiamondBlockDimensionItem());
	public static final RegistryObject<Item> UNIVERSAL_KEY = REGISTRY.register("universal_key", () -> new UniversalKeyItem());
	public static final RegistryObject<Item> ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK_PICKAXE = REGISTRY
			.register("one_level_compressed_diamond_block_pickaxe", () -> new OneLevelCompressedDiamondBlockPickaxeItem());
	public static final RegistryObject<Item> ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK_SHOVEL = REGISTRY
			.register("one_level_compressed_diamond_block_shovel", () -> new OneLevelCompressedDiamondBlockShovelItem());
	public static final RegistryObject<Item> ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK_SWORD = REGISTRY.register("one_level_compressed_diamond_block_sword",
			() -> new OneLevelCompressedDiamondBlockSwordItem());
	public static final RegistryObject<Item> ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK_AXE = REGISTRY.register("one_level_compressed_diamond_block_axe",
			() -> new OneLevelCompressedDiamondBlockAxeItem());
	public static final RegistryObject<Item> ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK_HOE = REGISTRY.register("one_level_compressed_diamond_block_hoe",
			() -> new OneLevelCompressedDiamondBlockHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
