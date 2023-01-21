
package legend.universalmore.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import legend.universalmore.init.UniversalmoreModTabs;
import legend.universalmore.init.UniversalmoreModItems;

public class OneLevelCompressedDiamondBlockPickaxeItem extends PickaxeItem {
	public OneLevelCompressedDiamondBlockPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 4f;
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
		}, 1, -2.5f, new Item.Properties().tab(UniversalmoreModTabs.TAB_UNIVERSAL_MORE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
