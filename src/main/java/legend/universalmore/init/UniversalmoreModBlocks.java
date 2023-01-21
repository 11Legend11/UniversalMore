
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package legend.universalmore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import legend.universalmore.block.OneLevelCompressedDiamondBlockDimensionPortalBlock;
import legend.universalmore.block.OneLevelCompressedDiamondBlockBlock;
import legend.universalmore.UniversalmoreMod;

public class UniversalmoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UniversalmoreMod.MODID);
	public static final RegistryObject<Block> ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK = REGISTRY.register("one_level_compressed_diamond_block",
			() -> new OneLevelCompressedDiamondBlockBlock());
	public static final RegistryObject<Block> ONE_LEVEL_COMPRESSED_DIAMOND_BLOCK_DIMENSION_PORTAL = REGISTRY
			.register("one_level_compressed_diamond_block_dimension_portal", () -> new OneLevelCompressedDiamondBlockDimensionPortalBlock());
}
