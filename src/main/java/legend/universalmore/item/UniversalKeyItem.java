
package legend.universalmore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class UniversalKeyItem extends Item {
	public UniversalKeyItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
