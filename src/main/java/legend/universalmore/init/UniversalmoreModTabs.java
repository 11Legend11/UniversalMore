
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package legend.universalmore.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class UniversalmoreModTabs {
	public static CreativeModeTab TAB_UNIVERSAL_MORE;

	public static void load() {
		TAB_UNIVERSAL_MORE = new CreativeModeTab("tabuniversal_more") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.SLIME_BLOCK);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
