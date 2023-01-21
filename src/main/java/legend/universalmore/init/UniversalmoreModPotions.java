
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package legend.universalmore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import legend.universalmore.UniversalmoreMod;

public class UniversalmoreModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, UniversalmoreMod.MODID);
	public static final RegistryObject<Potion> SUPER_POTION = REGISTRY.register("super_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.HEAL, 12000, 32, false, false), new MobEffectInstance(MobEffects.JUMP, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.REGENERATION, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.INVISIBILITY, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.ABSORPTION, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.SATURATION, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.LUCK, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.CONDUIT_POWER, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 12000, 32, false, false),
					new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 12000, 32, false, false)));
}
