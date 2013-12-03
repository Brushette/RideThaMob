package de.MiniDigger.RideThaMob.Entity;

import net.minecraft.server.v1_7_R1.EntityBat;
import net.minecraft.server.v1_7_R1.EntityBlaze;
import net.minecraft.server.v1_7_R1.EntityCaveSpider;
import net.minecraft.server.v1_7_R1.EntityChicken;
import net.minecraft.server.v1_7_R1.EntityCow;
import net.minecraft.server.v1_7_R1.EntityCreeper;
import net.minecraft.server.v1_7_R1.EntityEnderDragon;
import net.minecraft.server.v1_7_R1.EntityEnderman;
import net.minecraft.server.v1_7_R1.EntityGhast;
import net.minecraft.server.v1_7_R1.EntityGiantZombie;
import net.minecraft.server.v1_7_R1.EntityHorse;
import net.minecraft.server.v1_7_R1.EntityInsentient;
import net.minecraft.server.v1_7_R1.EntityIronGolem;
import net.minecraft.server.v1_7_R1.EntityMagmaCube;
import net.minecraft.server.v1_7_R1.EntityMushroomCow;
import net.minecraft.server.v1_7_R1.EntityOcelot;
import net.minecraft.server.v1_7_R1.EntityPig;
import net.minecraft.server.v1_7_R1.EntityPigZombie;
import net.minecraft.server.v1_7_R1.EntitySheep;
import net.minecraft.server.v1_7_R1.EntitySilverfish;
import net.minecraft.server.v1_7_R1.EntitySkeleton;
import net.minecraft.server.v1_7_R1.EntitySlime;
import net.minecraft.server.v1_7_R1.EntitySnowman;
import net.minecraft.server.v1_7_R1.EntitySpider;
import net.minecraft.server.v1_7_R1.EntitySquid;
import net.minecraft.server.v1_7_R1.EntityVillager;
import net.minecraft.server.v1_7_R1.EntityWitch;
import net.minecraft.server.v1_7_R1.EntityWither;
import net.minecraft.server.v1_7_R1.EntityZombie;

import org.bukkit.entity.EntityType;

public enum RideAbleEntityType {
	BAT("Bat", 65, EntityType.BAT, EntityBat.class, RideAbleBat.class), //
	BLAZE("Blaze", 61, EntityType.BLAZE, EntityBlaze.class, RideAbleBlaze.class), //
	// TODO BOAT?
	CAVE_SPIDER("Cave Spider", 59, EntityType.CAVE_SPIDER,
			EntityCaveSpider.class, RideAbleCaveSpider.class), //
	CHICKEN("Chicken", 93, EntityType.CHICKEN, EntityChicken.class,
			RideAbleChicken.class), //
	COW("Cow", 92, EntityType.COW, EntityCow.class, RideAbleCow.class), //
	CREEPER("Creeper", 50, EntityType.CREEPER, EntityCreeper.class,
			RideAbleCreeper.class), //
	ENDER_DRAGON("Enderdragon", 63, EntityType.ENDER_DRAGON,
			EntityEnderDragon.class, RideAbleEnderDragon.class), //
	ENDERMAN("Enderman", 58, EntityType.ENDERMAN, EntityEnderman.class,
			RideAbleEnderman.class), //
	GHAST("Ghast", 56, EntityType.GHAST, EntityGhast.class, RideAbleGhast.class), //
	GIANT("Giant", 53, EntityType.GIANT, EntityGiantZombie.class,
			RideAbleGiant.class), //
	HORSE("Horse", 100, EntityType.HORSE, EntityHorse.class,
			RideAbleHorse.class), //
	IRON_GOLEM("Iron Golem", 99, EntityType.IRON_GOLEM, EntityIronGolem.class,
			RideAbleIronGolem.class), //
	MAGMA_CUBE("Magma Cube", 62, EntityType.MAGMA_CUBE, EntityMagmaCube.class,
			RideAbleMagmaCube.class), //
	// TODO Minecart?
	MUSHROOM_COW("Mushroom Cow", 96, EntityType.MUSHROOM_COW,
			EntityMushroomCow.class, RideAbleMushroomCow.class), //
	OCELOT("Ocelot", 98, EntityType.OCELOT, EntityOcelot.class,
			RideAbleOcelot.class), //
	PIG("Pig", 90, EntityType.PIG, EntityPig.class, RideAblePig.class), //
	PIG_ZOMBIE("Pig Zombie", 57, EntityType.PIG_ZOMBIE, EntityPigZombie.class,
			RideAblePigZombie.class), //
	// PLAYER("Player", 1, EntityType.PLAYER, EntityHuman.class,
	// RideAblePlayer.class), //
	SHEEP("Sheep", 91, EntityType.SHEEP, EntitySheep.class, RideAbleSheep.class), //
	SILVERFISH("Silverfish", 60, EntityType.SILVERFISH, EntitySilverfish.class,
			RideAbleSilverfish.class), //
	SKELETON("Skeleton", 51, EntityType.SKELETON, EntitySkeleton.class,
			RideAbleSkeleton.class), //
	SLIME("Slime", 55, EntityType.SLIME, EntitySlime.class, RideAbleSlime.class), //
	SNOW_MAN("Snowman", 97, EntityType.SNOWMAN, EntitySnowman.class,
			RideAbleSnowman.class), //
	SPIDER("Spider", 52, EntityType.SPIDER, EntitySpider.class,
			RideAbleSpider.class), //
	SQUID("Squid", 94, EntityType.SQUID, EntitySquid.class, RideAbleSquid.class), //
	VILLAGER("Villager", 120, EntityType.VILLAGER, EntityVillager.class,
			RideAbleVillager.class), //
	WITCH("Witch", 66, EntityType.WITCH, EntityWitch.class, RideAbleWitch.class), //
	WITHER("Wither", 64, EntityType.WITHER, EntityWither.class,
			RideAbleWither.class), //
	// WOLF("Wolf", 95, EntityWolf.class, RideAbleWolf.class), //
	ZOMBIE("Zombie", 54, EntityType.ZOMBIE, EntityZombie.class,
			RideAbleZombie.class);

	private String name;
	private int id;
	private EntityType entityType;
	private Class<? extends EntityInsentient> nmsClass;
	private Class<? extends EntityInsentient> customClass;

	private RideAbleEntityType(String name, int id, EntityType entityType,
			Class<? extends EntityInsentient> nmsClass,
			Class<? extends EntityInsentient> customClass) {
		this.name = name;
		this.id = id;
		this.entityType = entityType;
		this.nmsClass = nmsClass;
		this.customClass = customClass;
	}

	public String getName() {
		return this.name;
	}

	public int getID() {
		return this.id;
	}

	public EntityType getEntityType() {
		return this.entityType;
	}

	public Class<? extends EntityInsentient> getNMSClass() {
		return this.nmsClass;
	}

	public Class<? extends EntityInsentient> getCustomClass() {
		return this.customClass;
	}

}