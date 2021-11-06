package com.kwpugh.resourceful_tools.init;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.foods.FoodList;
import com.kwpugh.resourceful_tools.items.*;

import com.kwpugh.resourceful_tools.materials.CopperToolMaterial;
import com.kwpugh.resourceful_tools.materials.IronToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit
{
	static int ironHammerDurability = ResourcefulTools.CONFIG.GENERAL.ironHammerDurability;
	static int diamondHammerDurability = ResourcefulTools.CONFIG.GENERAL.diamondHammerDurability;

	static int ironDurability = ResourcefulTools.CONFIG.GENERAL.ironDurability;
	static int copperDurability = ResourcefulTools.CONFIG.GENERAL.copperDurability;

	static boolean enableHookKnife = ResourcefulTools.CONFIG.GENERAL.enableHookKnife;
	static boolean enableTreeTrimmer = ResourcefulTools.CONFIG.GENERAL.enableTreeTrimmer;
	static boolean enableHandTiller = ResourcefulTools.CONFIG.GENERAL.enableHandTiller;
	static boolean enableHandPick = ResourcefulTools.CONFIG.GENERAL.enableHandPick;
	static boolean enableCrackHammer = ResourcefulTools.CONFIG.GENERAL.enableCrackHammer;
	static boolean enableClamDigger = ResourcefulTools.CONFIG.GENERAL.enableClamDigger;
	static boolean enableGlassPlacer = ResourcefulTools.CONFIG.GENERAL.enableGlassPlacer;
	static boolean enableTrashCan = ResourcefulTools.CONFIG.GENERAL.enableTrashCan;

	public static final ToolMaterial IRON_TOOL_MATERIAL = new IronToolMaterial();
	public static final ToolMaterial COPPER_TOOL_MATERIAL = new CopperToolMaterial();

	public static final Item HOOK_KNIFE = new HookKnife(new Item.Settings().maxDamage(ironDurability).group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item HOOK_KNIFE_COPPER = new HookKnife(new Item.Settings().maxDamage(copperDurability).group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item TREE_TRIMMER = new TreeTrimmer(IRON_TOOL_MATERIAL, 0, -2.8F, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item TREE_TRIMMER_COPPER = new TreeTrimmer(COPPER_TOOL_MATERIAL, 0, -2.8F, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item HAND_TILLER = new HandTiller(IRON_TOOL_MATERIAL, 0.0F, -2.8F, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item CLAIM_DIGGER = new ClamDigger(IRON_TOOL_MATERIAL, 0.0F, -2.8F, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item HAND_PICK = new HandPick(IRON_TOOL_MATERIAL, 0, -2.8F, new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item GLASS_PLACER = new GlassPlacer(new Item.Settings().maxCount(1).maxDamage(64).group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item TRASH_CAN = new TrashCan(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
 
	public static final Item CRACK_HAMMER = new CrackHammer(new Item.Settings().maxDamage(ironHammerDurability).group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item DIAMOND_CRACK_HAMMER = new CrackHammer(new Item.Settings().maxDamage(diamondHammerDurability).group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item COPPER_NUGGET = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_IRON = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_CARBON = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_GOLD = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_EMERALD = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_DIAMOND = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_NETHERITE = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_COPPER = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_TIN = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_STEEL = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));

	public static final Item POWDER_SALTPETER = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item POWDER_SULFUR = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item BONE_FRAGMENT = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item SMALL_BLAZE_POWDER = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item PEARL_FRAGMENT = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item GHAST_TEAR_FRAGMENT = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item NETHER_STAR_FRAGMENT = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item NETHERITE_FRAGMENT = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
 
	public static final Item BAMBOO_SHEET = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item LARGE_BAMBOO_SHEET = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));

	public static final Item JERKY = new Item(new Item.Settings().food(FoodList.jerky).group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item REAM_OF_PAPER = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item CLAM = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item RAW_CLAM = new Item(new Item.Settings().group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	public static final Item COOKED_CLAM = new Item(new Item.Settings().food(FoodList.cooked_clam).group(ResourcefulTools.RESOURCEFUL_TOOLS_GROUP));
	 
	public static void registerItems()
	{
		if(enableHookKnife)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hook_knife"), HOOK_KNIFE);
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hook_knife_copper"), HOOK_KNIFE_COPPER);
		}

		if(enableTreeTrimmer)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "tree_trimmer"), TREE_TRIMMER);
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "tree_trimmer_copper"), TREE_TRIMMER_COPPER);
		}

		if(enableHandTiller)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hand_tiller"), HAND_TILLER);
		}

		if(enableClamDigger)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "clam_digger"), CLAIM_DIGGER);
		}

		if(enableHandPick)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "hand_pick"), HAND_PICK);
		}

		if(enableGlassPlacer)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "glass_placer"), GLASS_PLACER);
		}

		if(enableCrackHammer)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "diamond_crack_hammer"), DIAMOND_CRACK_HAMMER);
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "crack_hammer"), CRACK_HAMMER);
		}

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "copper_nugget"), COPPER_NUGGET);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_carbon"), POWDER_CARBON);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_iron"), POWDER_IRON);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_gold"), POWDER_GOLD);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_emerald"), POWDER_EMERALD);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_diamond"), POWDER_DIAMOND);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_netherite"), POWDER_NETHERITE);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_copper"), POWDER_COPPER);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_tin"), POWDER_TIN);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_steel"), POWDER_STEEL);

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_saltpeter"), POWDER_SALTPETER);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "powder_sulfur"), POWDER_SULFUR);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "bone_fragment"), BONE_FRAGMENT);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "small_blaze_powder"), SMALL_BLAZE_POWDER);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "pearl_fragment"), PEARL_FRAGMENT);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "ghast_tear_fragment"), GHAST_TEAR_FRAGMENT);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "nether_star_fragment"), NETHER_STAR_FRAGMENT);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "netherite_fragment"), NETHERITE_FRAGMENT);
	 
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "bamboo_sheet"), BAMBOO_SHEET);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "large_bamboo_sheet"), LARGE_BAMBOO_SHEET);

		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "jerky"), JERKY);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "clam"), CLAM);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "raw_clam"), RAW_CLAM);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "cooked_clam"), COOKED_CLAM);
		Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "ream_of_paper"), REAM_OF_PAPER);

		if(enableTrashCan)
		{
			Registry.register(Registry.ITEM, new Identifier(ResourcefulTools.MOD_ID, "trash_can"), TRASH_CAN);
		}
	} 
}
