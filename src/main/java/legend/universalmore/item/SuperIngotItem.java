
package legend.universalmore.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import legend.universalmore.init.UniversalmoreModTabs;

public class SuperIngotItem extends Item {
	public SuperIngotItem() {
		super(new Item.Properties().tab(UniversalmoreModTabs.TAB_UNIVERSAL_MORE).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
