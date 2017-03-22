package com.tayloristic.nokamod;

public class Refrence {
	public static final String MOD_ID = "nokamod";
	public static final String NAME = "Noka Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.11,1.11.2]";
	
	public static final String CLIENT_PROXY = "com.tayloristic.nokamod.proxy.ClientProxy";
	public static final String SERVER_PROXY = "com.tayloristic.nokamod.proxy.ServerProxy";

	// Create enum Items 
	public static enum NokaModItems {
		CHEESE("cheese", "ItemCheese"),
		ARTICHOKE("artichoke", "ItemArtichoke"),
		ARUGULA("arugula", "ItemArugula"),
		ASPARAGUS("asparagus", "ItemAsparagus"),
		BOK_CHOY("bok_choy", "ItemBokChoy"),
		BROCCOLI("broccoli", "ItemBroccoli"),
		BROCCOLINI("broccolini", "ItemBroccolini"),
		BRUSSEL_SPROUTS("brussel_sprouts", "ItemBrusselSprouts"),
		CABBAGE("cabbage", "ItemCabbage"),
		CAULIFLOWER("cauliflower", "ItemCauliflower"),
		CELERY("celery", "ItemCelery"),
		CHIVES("chives", "ItemChives"),
		CUCUMBER("cucumber", "ItemCucumber"),
		EGGPLANT("eggplant", "ItemEggplant"),
		GARLIC("garlic", "ItemGarlic"),
		GREEN_BELL_PEPPER("green_bell_pepper", "ItemGreenBellPepper"),
		KALE("kale", "ItemKale"),
		LETTUCE("lettuce", "ItemLettuce"),
		MUSTARD("mustard", "ItemMustard"),
		ONION("onion", "ItemOnion"),
		ORANGE_BELL_PEPPER("orange_bell_pepper", "ItemOrangeBellPepper"),
		PEA("pea", "ItemPea"),
		RADISH("radish", "ItemRadish"),
		RED_BELL_PEPPER("red_bell_pepper", "ItemRedBellPepper"),
		SPINACH("spinach", "ItemSpinach"),
		SQUASH("squash", "ItemSquash"),
		SWEET_POTATO("sweet_potato", "ItemSweetPotato"),
		TOMATO("tomato", "ItemTomato"),
		TURNIP("turnip", "ItemTurnip"),
		YAM("yam", "ItemYam"),
		YELLOW_BELL_PEPPER("yellow_bell_pepper", "ItemYellowBellPepper"),
		ZUCCHINI("zucchini", "ItemZucchini"),	
	
		ARUGULA_SEEDS("arugula_seeds", "ItemArugulaSeeds"),
		ARTICHOKE_SEEDS("artichoke_seeds", "ItemArtichokeSeeds"),
		ASPARAGUS_SEEDS("asparagus_seeds", "ItemAsparagusSeeds"),
		BELL_PEPPER_SEEDS("bell_pepper_seeds", "ItemBellPepperSeeds"),
		BOK_CHOY_SEEDS("bok_choy_seeds", "ItemBokChoySeeds"),
		BROCCOLI_SEEDS("broccoli_seeds", "ItemBroccoliSeeds"),
		BROCCOLINI_SEEDS("broccolini_seeds", "ItemBroccoliniSeeds"),
		BRUSSEL_SPROUTS_SEEDS("brussel_sprouts_seeds", "ItemBrusselSproutsSeeds"),
		CABBAGE_SEEDS("cabbage_seeds", "ItemCabbageSeeds"),
		CAULIFLOWER_SEEDS("cauliflower_seeds", "ItemCauliflowerSeeds"),
		CELERY_SEEDS("celery_seeds", "ItemCelerySeeds"),
		CHIVES_SEEDS("chives_seeds", "ItemChivesSeeds"),
		CUCUMBER_SEEDS("cucumber_seeds", "ItemCucumberSeeds"),
		EGGPLANT_SEEDS("eggplant_seeds", "ItemEggplantSeeds"),
		GARLIC_SEEDS("garlic_seeds", "ItemGarlicSeeds"),
		KALE_SEEDS("kale_seeds", "ItemKaleSeeds"),
		LETTUCE_SEEDS("lettuce_seeds", "ItemLettuceSeeds"),
		MUSTARD_SEEDS("mustard_seeds", "ItemMustardSeeds"),
		ONION_SEEDS("onion_seeds", "ItemOnionSeeds"),
		PEA_SEEDS("pea_seeds", "ItemPeaSeeds"),
		RADISH_SEEDS("radish_seeds", "ItemRadishSeeds"),
		SPINACH_SEEDS("spinach_seeds", "ItemSpinachSeeds"),
		SQUASH_SEEDS("squash_seeds", "ItemSquashSeeds"),
		TOMATO_SEEDS("tomato_seeds", "ItemTomatoSeeds"),
		TURNIP_SEEDS("turnip_seeds", "ItemTurnipSeeds"),
		YAM_SEEDS("yam_seeds", "ItemYamSeeds"),
		ZUCCHINI_SEEDS("zucchini_seeds", "ItemZucchiniSeeds");
		
		private String unlocalizedName;
		private String registryName;
		
		NokaModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
	}
	
	// My enum types for blocks.
	public static enum NokaModBlocks {
		
		CHEESE_BLOCK("cheese_block", "BlockCheese"), 
		SQUASH_BLOCK("squash_block", "BlockSquash"),

		ARTICHOKE_BLOCK("artichoke_block", "BlockArtichoke"),
		ARUGULA_BLOCK("arugula_block", "BlockArugula"),
		ASPARAGUS_BLOCK("asparagus_block", "BlockAsparagus"),		
		BELL_PEPPER_BLOCK("bell_pepper_block", "BlockBellPepper"),
		BOK_CHOY_BLOCK("bok_choy_block", "BlockBokChoy"),
		BROCCOLI_BLOCK("broccoli_block", "BlockBroccoli"),
		BROCCOLINI_BLOCK("broccolini_block", "BlockBroccolini"),
		BRUSSEL_SPROUTS_BLOCK("brussel_sprouts_block", "BlockBrusselSprouts"),
		CABBAGE_BLOCK("cabbage_block", "BlockCabbage"),
		CAULIFLOWER_BLOCK("cauliflower_block", "BlockCauliflower"),
		CELERY_BLOCK("celery_block", "BlockCelery"),
		CHIVES_BLOCK("chives_block", "BlockChives"),
		CUCUMBER_BLOCK("cucumber_block", "BlockCucumber"),
		EGGPLANT_BLOCK("eggplant_block", "BlockEggplant"),
		GARLIC_BLOCK("garlic_block", "BlockGarlic"),
		KALE_BLOCK("kale_block", "BlockKale"),
		LETTUCE_BLOCK("lettuce_block", "BlockLettuce"),
		MUSTARD_BLOCK("mustard_block", "BlockMustard"),
		ONION_BLOCK("onion_block", "BlockOnion"),
		PEA_BLOCK("pea_block", "BlockPea"),
		RADISH_BLOCK("radish_block", "BlockRadish"),
		SPINACH_BLOCK("spinach_block", "BlockSpinach"),
		SWEET_POTATO_BLOCK("sweet_potato_block", "BlockSweetPotato"),
		TOMATO_BLOCK("tomato_block", "BlockTomato"),
		TURNIP_BLOCK("turnip_block", "BlockTurnip"),
		YAM_BLOCK("yam_block", "BlockYam"),
		ZUCCHINI_BLOCK("zucchini_block", "BlockZucchini"),
		SQUASH_STEM("squash_stem", "SquashStem");
		
		private String unlocalizedName;
		private String registryName;
		
		NokaModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
	}

	// Enum types for log blocks.
	public static enum NokaModLogs {		
		ALMOND_LOG("almond_log", "almondLog"),
		CHERRY_LOG("cherry_log", "cherryLog");
		
		private String unlocalizedName;
		private String registryName;
	
		NokaModLogs(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	
	}
	
	// Enum types for log blocks.
	public static enum NokaModLeaves {		
			ALMOND_LEAVES("almond_leaves", "almondLeaves");
		
			private String unlocalizedName;
			private String registryName;
		
			NokaModLeaves(String unlocalizedName, String registryName) {
				this.unlocalizedName = unlocalizedName;
				this.registryName = registryName;
			}
			
			public String getRegistryName() {
				return registryName;
			}
			
			public String getUnlocalizedName() {
				return unlocalizedName;
			}
		
		}
}

