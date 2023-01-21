
package legend.universalmore.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import legend.universalmore.init.UniversalmoreModTabs;
import legend.universalmore.init.UniversalmoreModItems;

public class OneLevelCompressedDiamondBlockHoeItem extends HoeItem {
	public OneLevelCompressedDiamondBlockHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UniversalmoreModItems.SUPER_INGOT.get()));
			}
		}, 0, -2.5f, new Item.Properties().tab(UniversalmoreModTabs.TAB_UNIVERSAL_MORE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
