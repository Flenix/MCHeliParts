package co.uk.silvania.mcheliparts;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = MCHeliParts.modid, version = MCHeliParts.version)
public class MCHeliParts {
	
	public static final String modid = "mcheliparts";
    public static final String version = "1.0";
    
    @Instance(MCHeliParts.modid)
    public static MCHeliParts instance;
    
    @SidedProxy(clientSide="co.uk.silvania.mcheliparts.client.ClientProxy", serverSide="co.uk.silvania.mcheliparts.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs tabMCHP = new CreativeTabs("tabMCHP") {
    	@Override
    	public Item getTabIconItem() {
    		return new ItemStack(ospreyControlBay, 1, 0).getItem();
    	}
    };
    
    public static Item lowTorqueEngine;
    public static Item mediumTorqueEngine;
    public static Item highTorqueEngine;
    
    public static Item smallNichromeWing;
    public static Item mediumNichromeWing;
    public static Item largeNichromeWing;
    public static Item hugeNichromeWing;
    public static Item smallAluminiumWing;
    public static Item mediumAluminiumWing;
    public static Item largeAluminiumWing;
    public static Item hugeAluminiumWing;
    public static Item smallCompositeWing;
    public static Item mediumCompositeWing;
    public static Item largeCompositeWing;
    public static Item hugeCompositeWing;
    public static Item smallTitaniumWing;
    public static Item mediumTitaniumWing;
    public static Item largeTitaniumWing;
    public static Item hugeTitaniumWing;
    
    public static Item smallNichromeAirframe;
    public static Item mediumNichromeAirframe;
    public static Item largeNichromeAirframe;
    public static Item hugeNichromeAirframe;
    public static Item smallAluminiumAirframe;
    public static Item mediumAluminiumAirframe;
    public static Item largeAluminiumAirframe;
    public static Item hugeAluminiumAirframe;
    public static Item smallCompositeAirframe;
    public static Item mediumCompositeAirframe;
    public static Item largeCompositeAirframe;
    public static Item hugeCompositeAirframe;
    public static Item smallTitaniumAirframe;
    public static Item mediumTitaniumAirframe;
    public static Item largeTitaniumAirframe;
    public static Item hugeTitaniumAirframe;
    
    public static Item smallNichromeFuselage;
    public static Item mediumNichromeFuselage;
    public static Item largeNichromeFuselage;
    public static Item hugeNichromeFuselage;
    public static Item smallAluminiumFuselage;
    public static Item mediumAluminiumFuselage;
    public static Item largeAluminiumFuselage;
    public static Item hugeAluminiumFuselage;
    public static Item smallCompositeFuselage;
    public static Item mediumCompositeFuselage;
    public static Item largeCompositeFuselage;
    public static Item hugeCompositeFuselage;
    public static Item smallTitaniumFuselage;
    public static Item mediumTitaniumFuselage;
    public static Item largeTitaniumFuselage;
    public static Item hugeTitaniumFuselage;
    
    public static Item smallNichromeCockpit;
    public static Item mediumNichromeCockpit;
    public static Item largeNichromeCockpit;
    public static Item hugeNichromeCockpit;
    public static Item smallAluminiumCockpit;
    public static Item mediumAluminiumCockpit;
    public static Item largeAluminiumCockpit;
    public static Item hugeAluminiumCockpit;
    public static Item smallSteelCockpit;
    public static Item mediumSteelCockpit;
    public static Item largeSteelCockpit;
    public static Item hugeSteelCockpit;
    public static Item smallCompositeCockpit;
    public static Item mediumCompositeCockpit;
    public static Item largeCompositeCockpit;
    public static Item hugeCompositeCockpit;
    public static Item smallTitaniumCockpit;
    public static Item mediumTitaniumCockpit;
    public static Item largeTitaniumCockpit;
    public static Item hugeTitaniumCockpit;
    public static Item smallCarbonCockpit;
    public static Item mediumCarbonCockpit;
    public static Item largeCarbonCockpit;
    public static Item hugeCarbonCockpit;
    
    public static Item steelSeat1;
    public static Item steelSeat2;
    public static Item steelSeat3;
    public static Item steelSeat4;
    public static Item steelSeat5;
    
    public static Item fuelTank100;
    public static Item fuelTank200;
    public static Item fuelTank300;
    public static Item fuelTank400;
    public static Item fuelTank500;
    public static Item fuelTank600;
    public static Item fuelTank700;
    public static Item fuelTank800;
    public static Item fuelTank900;
    public static Item fuelTank1000;
    public static Item fuelTank2000;
    public static Item fuelTank3000;
    public static Item fuelTank4000;
    public static Item fuelTank5000;
    public static Item fuelTank10000;
    public static Item fuelTank20000;
    public static Item fuelTank50000;
    
    //Smaller parts
    public static Item reinforcedPiston;
    public static Item titaniumReinforcedPiston;
    
    //Materials
    public static Item compositeMaterialSet;
    public static Item compositeMaterialMixture;
    public static Item compositeMaterialIngot;
    public static Item compositeMaterialPlate;
    public static Item compositeMaterialFuselagePlate;
    
    //Electronics
    public static Item nightVisionSystem;
    
    //Specifics
    
    //Osprey
    public static Item ospreyWing;
    public static Item ospreyEngine;
    public static Item ospreyEngineCasing;
    public static Item ospreyCockpit;
    public static Item ospreyControlBay;
    public static Item ospreyTailPiece;
    public static Item v22Fuselage;
    public static Item mv22Fuselage;
    public static Item v22WeaponsSystem;
    
    //Tokens
    public static Item valthraxusToken;
    public static Item larchToken;
    public static Item eouToken;
    public static Item vanguardsPeakToken;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	lowTorqueEngine = new MCHPItems(8).setUnlocalizedName("lowTorqueEngine");
        mediumTorqueEngine = new MCHPItems(8).setUnlocalizedName("mediumTorqueEngine");
        highTorqueEngine = new MCHPItems(8).setUnlocalizedName("highTorqueEngine");
        
        smallNichromeWing = new MCHPItems(16).setUnlocalizedName("smallNichromeWing");
        mediumNichromeWing = new MCHPItems(16).setUnlocalizedName("mediumNichromeWing");
        largeNichromeWing = new MCHPItems(16).setUnlocalizedName("largeNichromeWing");
        hugeNichromeWing = new MCHPItems(16).setUnlocalizedName("hugeNichromeWing");
        smallAluminiumWing = new MCHPItems(16).setUnlocalizedName("smallAluminiumWing");
        mediumAluminiumWing = new MCHPItems(16).setUnlocalizedName("mediumAluminiumWing");
        largeAluminiumWing = new MCHPItems(16).setUnlocalizedName("largeAluminiumWing");
        hugeAluminiumWing = new MCHPItems(16).setUnlocalizedName("hugeAluminiumWing");
        smallCompositeWing = new MCHPItems(16).setUnlocalizedName("smallCompositeWing");
        mediumCompositeWing = new MCHPItems(16).setUnlocalizedName("mediumCompositeWing");
        largeCompositeWing = new MCHPItems(16).setUnlocalizedName("largeCompositeWing");
        hugeCompositeWing = new MCHPItems(16).setUnlocalizedName("hugeCompositeWing");
        smallTitaniumWing = new MCHPItems(16).setUnlocalizedName("smallTitaniumWing");
        mediumTitaniumWing = new MCHPItems(16).setUnlocalizedName("mediumTitaniumWing");
        largeTitaniumWing = new MCHPItems(16).setUnlocalizedName("largeTitaniumWing");
        hugeTitaniumWing = new MCHPItems(16).setUnlocalizedName("hugeTitaniumWing");
        
        //smallNichromeAirframe = new MCHPItems(4).setUnlocalizedName("smallNichromeAirframe");
        //mediumNichromeAirframe = new MCHPItems(4).setUnlocalizedName("mediumNichromeAirframe");
        largeNichromeAirframe = new MCHPItems(4).setUnlocalizedName("largeNichromeAirframe");
        //hugeNichromeAirframe = new MCHPItems(4).setUnlocalizedName("hugeNichromeAirframe");
        //smallAluminiumAirframe = new MCHPItems(4).setUnlocalizedName("smallAluminiumAirframe");
        //mediumAluminiumAirframe = new MCHPItems(4).setUnlocalizedName("mediumAluminiumAirframe");
        largeAluminiumAirframe = new MCHPItems(4).setUnlocalizedName("largeAluminiumAirframe");
        //hugeAluminiumAirframe = new MCHPItems(4).setUnlocalizedName("hugeAluminiumAirframe");
        //smallCompositeAirframe = new MCHPItems(4).setUnlocalizedName("smallCompositeAirframe");
        //mediumCompositeAirframe = new MCHPItems(4).setUnlocalizedName("mediumCompositeAirframe");
        largeCompositeAirframe = new MCHPItems(4).setUnlocalizedName("largeCompositeAirframe");
        //hugeCompositeAirframe = new MCHPItems(4).setUnlocalizedName("hugeCompositeAirframe");
        //smallTitaniumAirframe = new MCHPItems(4).setUnlocalizedName("smallTitaniumAirframe");
        //mediumTitaniumAirframe = new MCHPItems(4).setUnlocalizedName("mediumTitaniumAirframe");
        largeTitaniumAirframe = new MCHPItems(4).setUnlocalizedName("largeTitaniumAirframe");
        //hugeTitaniumAirframe = new MCHPItems(4).setUnlocalizedName("hugeTitaniumAirframe");
        
        //smallNichromeFuselage = new MCHPItems(1).setUnlocalizedName("smallNichromeFuselage");
        //mediumNichromeFuselage = new MCHPItems(1).setUnlocalizedName("mediumNichromeFuselage");
        largeNichromeFuselage = new MCHPItems(1).setUnlocalizedName("largeNichromeFuselage");
        //hugeNichromeFuselage = new MCHPItems(1).setUnlocalizedName("hugeNichromeFuselage");
        //smallAluminiumFuselage = new MCHPItems(1).setUnlocalizedName("smallAluminiumFuselage");
        //mediumAluminiumFuselage = new MCHPItems(1).setUnlocalizedName("mediumAluminiumFuselage");
        largeAluminiumFuselage = new MCHPItems(1).setUnlocalizedName("largeAluminiumFuselage");
        //hugeAluminiumFuselage = new MCHPItems(1).setUnlocalizedName("hugeAluminiumFuselage");
        //smallCompositeFuselage = new MCHPItems(1).setUnlocalizedName("smallCompositeFuselage");
        //mediumCompositeFuselage = new MCHPItems(1).setUnlocalizedName("mediumCompositeFuselage");
        largeCompositeFuselage = new MCHPItems(1).setUnlocalizedName("largeCompositeFuselage");
        //hugeCompositeFuselage = new MCHPItems(1).setUnlocalizedName("hugeCompositeFuselage");
        //smallTitaniumFuselage = new MCHPItems(1).setUnlocalizedName("smallTitaniumFuselage");
        //mediumTitaniumFuselage = new MCHPItems(1).setUnlocalizedName("mediumTitaniumFuselage");
        largeTitaniumFuselage = new MCHPItems(1).setUnlocalizedName("largeTitaniumFuselage");
        //hugeTitaniumFuselage = new MCHPItems(1).setUnlocalizedName("hugeTitaniumFuselage");
        
        //smallNichromeCockpit = new MCHPItems(1).setUnlocalizedName("smallNichromeCockpit");
        //mediumNichromeCockpit = new MCHPItems(1).setUnlocalizedName("mediumNichromeCockpit");
        largeNichromeCockpit = new MCHPItems(1).setUnlocalizedName("largeNichromeCockpit");
        //hugeNichromeCockpit = new MCHPItems(1).setUnlocalizedName("hugeNichromeCockpit");
        //smallAluminiumCockpit = new MCHPItems(1).setUnlocalizedName("smallAluminiumCockpit");
        //mediumAluminiumCockpit = new MCHPItems(1).setUnlocalizedName("mediumAluminiumCockpit");
        largeAluminiumCockpit = new MCHPItems(1).setUnlocalizedName("largeAluminiumCockpit");
        //hugeAluminiumCockpit = new MCHPItems(1).setUnlocalizedName("hugeAluminiumCockpit");
        //smallCompositeCockpit = new MCHPItems(1).setUnlocalizedName("smallCompositeCockpit");
        //mediumCompositeCockpit = new MCHPItems(1).setUnlocalizedName("mediumCompositeCockpit");
        largeCompositeCockpit = new MCHPItems(1).setUnlocalizedName("largeCompositeCockpit");
        //hugeCompositeCockpit = new MCHPItems(1).setUnlocalizedName("hugeCompositeCockpit");
        //smallTitaniumCockpit = new MCHPItems(1).setUnlocalizedName("smallTitaniumCockpit");
        //mediumTitaniumCockpit = new MCHPItems(1).setUnlocalizedName("mediumTitaniumCockpit");
        largeTitaniumCockpit = new MCHPItems(1).setUnlocalizedName("largeTitaniumCockpit");
        //hugeTitaniumCockpit = new MCHPItems(1).setUnlocalizedName("hugeTitaniumCockpit");
        
        steelSeat1 = new MCHPLoreItem("1x Config", 1, "steelSeat1").setUnlocalizedName("steelSeat1");
        steelSeat2 = new MCHPLoreItem("2x Config", 2, "steelSeat2").setUnlocalizedName("steelSeat2");
        steelSeat3 = new MCHPLoreItem("3x Config", 3, "steelSeat3").setUnlocalizedName("steelSeat3");
        steelSeat4 = new MCHPLoreItem("4x Config", 4, "steelSeat4").setUnlocalizedName("steelSeat4");
        steelSeat5 = new MCHPLoreItem("5x Config", 5, "steelSeat5").setUnlocalizedName("steelSeat5");
        
        fuelTank100 = new MCHPLoreItem("100 B", 100, "fuelTank").setUnlocalizedName("fuelTank100");
        fuelTank200 = new MCHPLoreItem("200 B", 200, "fuelTank").setUnlocalizedName("fuelTank200");
        fuelTank300 = new MCHPLoreItem("300 B", 300, "fuelTank").setUnlocalizedName("fuelTank300");
        fuelTank400 = new MCHPLoreItem("400 B", 400, "fuelTank").setUnlocalizedName("fuelTank400");
        fuelTank500 = new MCHPLoreItem("500 B", 500, "fuelTank").setUnlocalizedName("fuelTank500");
        fuelTank600 = new MCHPLoreItem("600 B", 600, "fuelTank").setUnlocalizedName("fuelTank600");
        fuelTank700 = new MCHPLoreItem("700 B", 700, "fuelTank").setUnlocalizedName("fuelTank700");
        fuelTank800 = new MCHPLoreItem("800 B", 800, "fuelTank").setUnlocalizedName("fuelTank800");
        fuelTank900 = new MCHPLoreItem("900 B", 900, "fuelTank").setUnlocalizedName("fuelTank900");
        fuelTank1000 = new MCHPLoreItem("1000 B", 1000, "fuelTank").setUnlocalizedName("fuelTank1000");
        fuelTank2000 = new MCHPLoreItem("2000 B", 2000, "fuelTank").setUnlocalizedName("fuelTank2000");
        fuelTank3000 = new MCHPLoreItem("3000 B", 3000, "fuelTank").setUnlocalizedName("fuelTank3000");
        fuelTank4000 = new MCHPLoreItem("4000 B", 4000, "fuelTank").setUnlocalizedName("fuelTank4000");
        fuelTank5000 = new MCHPLoreItem("5000 B", 5000, "fuelTank").setUnlocalizedName("fuelTank5000");
        fuelTank10000 = new MCHPLoreItem("10000 B", 10000, "fuelTank").setUnlocalizedName("fuelTank10000");
        fuelTank20000 = new MCHPLoreItem("20000 B", 20000, "fuelTank").setUnlocalizedName("fuelTank20000");
        fuelTank50000 = new MCHPLoreItem("50000 B", 50000, "fuelTank").setUnlocalizedName("fuelTank50000");
        
        reinforcedPiston = new MCHPItems(64).setUnlocalizedName("reinforcedPiston");
        titaniumReinforcedPiston = new MCHPItems(64).setUnlocalizedName("titaniumReinforcedPiston");
        
        compositeMaterialSet = new MCHPItems(64).setUnlocalizedName("compositeMaterialSet");
        compositeMaterialMixture = new MCHPItems(64).setUnlocalizedName("compositeMaterialMixture");
        compositeMaterialIngot = new MCHPItems(64).setUnlocalizedName("compositeMaterialIngot");
        compositeMaterialPlate = new MCHPItems(64).setUnlocalizedName("compositeMaterialPlate");
        compositeMaterialFuselagePlate = new MCHPItems(64).setUnlocalizedName("compositeMaterialFuselagePlate");
        
        //Electronics
        nightVisionSystem = new MCHPItems(64).setUnlocalizedName("nightVisionSystem");
        
        //Specifics
        
        //Osprey
        ospreyWing = new MCHPItems(64).setUnlocalizedName("ospreyWing");
        ospreyEngine = new MCHPItems(64).setUnlocalizedName("ospreyEngine");
        ospreyEngineCasing = new MCHPItems(64).setUnlocalizedName("ospreyEngineCasing");
        ospreyCockpit = new MCHPItems(64).setUnlocalizedName("ospreyCockpit");
        ospreyControlBay = new MCHPItems(64).setUnlocalizedName("ospreyControlBay");
        ospreyTailPiece = new MCHPItems(64).setUnlocalizedName("ospreyTailPiece");
        v22Fuselage = new MCHPItems(64).setUnlocalizedName("v22Fuselage");
        mv22Fuselage = new MCHPItems(64).setUnlocalizedName("mv22Fuselage");
        v22WeaponsSystem = new MCHPItems(64).setUnlocalizedName("v22WeaponsSystem");
        
        //Towns
        valthraxusToken = new TokenItem().setUnlocalizedName("valthraxusToken");
        larchToken = new TokenItem().setUnlocalizedName("larchToken");
        eouToken = new TokenItem().setUnlocalizedName("eouToken");
    	vanguardsPeakToken = new TokenItem().setUnlocalizedName("vanguardsPeakToken");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.registerItems();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }

}
