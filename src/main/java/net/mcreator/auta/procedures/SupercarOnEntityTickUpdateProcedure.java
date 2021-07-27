package net.mcreator.auta.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.auta.AutaModElements;
import net.mcreator.auta.AutaMod;

import java.util.Map;

@AutaModElements.ModElement.Tag
public class SupercarOnEntityTickUpdateProcedure extends AutaModElements.ModElement {
	public SupercarOnEntityTickUpdateProcedure(AutaModElements instance) {
		super(instance, 23);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AutaMod.LOGGER.warn("Failed to load dependency x for procedure SupercarOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AutaMod.LOGGER.warn("Failed to load dependency y for procedure SupercarOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AutaMod.LOGGER.warn("Failed to load dependency z for procedure SupercarOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AutaMod.LOGGER.warn("Failed to load dependency world for procedure SupercarOnEntityTickUpdate!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.SMOKE, x, y, z, (int) 60, 0, 1, 0, 0);
		}
	}
}
