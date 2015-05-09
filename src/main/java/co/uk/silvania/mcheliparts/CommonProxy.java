package co.uk.silvania.mcheliparts;

import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	@Instance
	public static MCHeliParts instance;
	
	public void registerItems() {
		GameRegistry.registerItem(MCHeliParts.lowTorqueEngine, "lowTorqueEngine");
		GameRegistry.registerItem(MCHeliParts.mediumTorqueEngine, "highTorqueEngine");
		GameRegistry.registerItem(MCHeliParts.highTorqueEngine, "highTorqueEngine");
		
		GameRegistry.registerItem(MCHeliParts.smallNichromeWing, "smallNichromeWing");
		GameRegistry.registerItem(MCHeliParts.mediumNichromeWing, "mediumNichromeWing");
		GameRegistry.registerItem(MCHeliParts.largeNichromeWing, "largeNichromeWing");
		GameRegistry.registerItem(MCHeliParts.hugeNichromeWing, "hugeNichromeWing");
		GameRegistry.registerItem(MCHeliParts.smallAluminiumWing, "smallAluminiumWing");
		GameRegistry.registerItem(MCHeliParts.mediumAluminiumWing, "mediumAluminiumWing");
		GameRegistry.registerItem(MCHeliParts.largeAluminiumWing, "largeAluminiumWing");
		GameRegistry.registerItem(MCHeliParts.hugeAluminiumWing, "hugeAluminiumWing");
		GameRegistry.registerItem(MCHeliParts.smallCompositeWing, "smallCompositeWing");
		GameRegistry.registerItem(MCHeliParts.mediumCompositeWing, "mediumCompositeWing");
		GameRegistry.registerItem(MCHeliParts.largeCompositeWing, "largeCompositeWing");
		GameRegistry.registerItem(MCHeliParts.hugeCompositeWing, "hugeCompositeWing");
		GameRegistry.registerItem(MCHeliParts.smallTitaniumWing, "smallTitaniumWing");
		GameRegistry.registerItem(MCHeliParts.mediumTitaniumWing, "mediumTitaniumWing");
		GameRegistry.registerItem(MCHeliParts.largeTitaniumWing, "largeTitaniumWing");
		GameRegistry.registerItem(MCHeliParts.hugeTitaniumWing, "hugeTitaniumWing");
		
		//GameRegistry.registerItem(MCHeliParts.smallNichromeAirframe, "smallNichromeAirframe");
        //GameRegistry.registerItem(MCHeliParts.mediumNichromeAirframe, "mediumNichromeAirframe");
		GameRegistry.registerItem(MCHeliParts.largeNichromeAirframe, "largeNichromeAirframe");
        //GameRegistry.registerItem(MCHeliParts.hugeNichromeAirframe, "hugeNichromeAirframe");
        //GameRegistry.registerItem(MCHeliParts.smallAluminiumAirframe, "smallAluminiumAirframe");
        //GameRegistry.registerItem(MCHeliParts.mediumAluminiumAirframe, "mediumAluminiumAirframe");
		GameRegistry.registerItem(MCHeliParts.largeAluminiumAirframe, "largeAluminiumAirframe");
        //GameRegistry.registerItem(MCHeliParts.hugeAluminiumAirframe, "hugeAluminiumAirframe");
        //GameRegistry.registerItem(MCHeliParts.smallCompositeAirframe, "smallCompositeAirframe");
        //GameRegistry.registerItem(MCHeliParts.mediumCompositeAirframe, "mediumCompositeAirframe");
		GameRegistry.registerItem(MCHeliParts.largeCompositeAirframe, "largeCompositeAirframe");
        //GameRegistry.registerItem(MCHeliParts.hugeCompositeAirframe, "hugeCompositeAirframe");
        //GameRegistry.registerItem(MCHeliParts.smallTitaniumAirframe, "smallTitaniumAirframe");
        //GameRegistry.registerItem(MCHeliParts.mediumTitaniumAirframe, "mediumTitaniumAirframe");
		GameRegistry.registerItem(MCHeliParts.largeTitaniumAirframe, "largeTitaniumAirframe");
        //GameRegistry.registerItem(MCHeliParts.hugeTitaniumAirframe, "hugeTitaniumAirframe");
        
        //GameRegistry.registerItem(MCHeliParts.smallNichromeFuselage, "smallNichromeFuselage");
        //GameRegistry.registerItem(MCHeliParts.mediumNichromeFuselage, "mediumNichromeFuselage");
		GameRegistry.registerItem(MCHeliParts.largeNichromeFuselage, "largeNichromeFuselage");
        //GameRegistry.registerItem(MCHeliParts.hugeNichromeFuselage, "hugeNichromeFuselage");
        //GameRegistry.registerItem(MCHeliParts.smallAluminiumFuselage, "smallAluminiumFuselage");
        //GameRegistry.registerItem(MCHeliParts.mediumAluminiumFuselage, "mediumAluminiumFuselage");
		GameRegistry.registerItem(MCHeliParts.largeAluminiumFuselage, "largeAluminiumFuselage");
        //GameRegistry.registerItem(MCHeliParts.hugeAluminiumFuselage, "hugeAluminiumFuselage");
        //GameRegistry.registerItem(MCHeliParts.smallCompositeFuselage, "smallCompositeFuselage");
        //GameRegistry.registerItem(MCHeliParts.mediumCompositeFuselage, "mediumCompositeFuselage");
		GameRegistry.registerItem(MCHeliParts.largeCompositeFuselage, "largeCompositeFuselage");
        //GameRegistry.registerItem(MCHeliParts.hugeCompositeFuselage, "hugeCompositeFuselage");
        //GameRegistry.registerItem(MCHeliParts.smallTitaniumFuselage, "smallTitaniumFuselage");
        //GameRegistry.registerItem(MCHeliParts.mediumTitaniumFuselage, "mediumTitaniumFuselage");
		GameRegistry.registerItem(MCHeliParts.largeTitaniumFuselage, "largeTitaniumFuselage");
        //GameRegistry.registerItem(MCHeliParts.hugeTitaniumFuselage, "hugeTitaniumFuselage");
        
        //GameRegistry.registerItem(MCHeliParts.smallNichromeCockpit, "smallNichromeCockpit");
        //GameRegistry.registerItem(MCHeliParts.mediumNichromeCockpit, "mediumNichromeCockpit");
		GameRegistry.registerItem(MCHeliParts.largeNichromeCockpit, "largeNichromeCockpit");
        //GameRegistry.registerItem(MCHeliParts.hugeNichromeCockpit, "hugeNichromeCockpit");
        //GameRegistry.registerItem(MCHeliParts.smallAluminiumCockpit, "smallAluminiumCockpit");
        //GameRegistry.registerItem(MCHeliParts.mediumAluminiumCockpit, "mediumAluminiumCockpit");
		GameRegistry.registerItem(MCHeliParts.largeAluminiumCockpit, "largeAluminiumCockpit");
        //GameRegistry.registerItem(MCHeliParts.hugeAluminiumCockpit, "hugeAluminiumCockpit");
        //GameRegistry.registerItem(MCHeliParts.smallCompositeCockpit, "smallCompositeCockpit");
        //GameRegistry.registerItem(MCHeliParts.mediumCompositeCockpit, "mediumCompositeCockpit");
		GameRegistry.registerItem(MCHeliParts.largeCompositeCockpit, "largeCompositeCockpit");
        //GameRegistry.registerItem(MCHeliParts.hugeCompositeCockpit, "hugeCompositeCockpit");
        //GameRegistry.registerItem(MCHeliParts.smallTitaniumCockpit, "smallTitaniumCockpit");
        //GameRegistry.registerItem(MCHeliParts.mediumTitaniumCockpit, "mediumTitaniumCockpit");
		GameRegistry.registerItem(MCHeliParts.largeTitaniumCockpit, "largeTitaniumCockpit");
        //GameRegistry.registerItem(MCHeliParts.hugeTitaniumCockpit, "hugeTitaniumCockpit");
		
		GameRegistry.registerItem(MCHeliParts.steelSeat1, "steelSeat1");
		GameRegistry.registerItem(MCHeliParts.steelSeat2, "steelSeat2");
		GameRegistry.registerItem(MCHeliParts.steelSeat3, "steelSeat3");
		GameRegistry.registerItem(MCHeliParts.steelSeat4, "steelSeat4");
		GameRegistry.registerItem(MCHeliParts.steelSeat5, "steelSeat5");
        
		GameRegistry.registerItem(MCHeliParts.fuelTank100, "fuelTank100");
		GameRegistry.registerItem(MCHeliParts.fuelTank200, "fuelTank200");
		GameRegistry.registerItem(MCHeliParts.fuelTank300, "fuelTank300");
        GameRegistry.registerItem(MCHeliParts.fuelTank400, "fuelTank400");
        GameRegistry.registerItem(MCHeliParts.fuelTank500, "fuelTank500");
        GameRegistry.registerItem(MCHeliParts.fuelTank600, "fuelTank600");
        GameRegistry.registerItem(MCHeliParts.fuelTank700, "fuelTank700");
        GameRegistry.registerItem(MCHeliParts.fuelTank800, "fuelTank800");
        GameRegistry.registerItem(MCHeliParts.fuelTank900, "fuelTank900");
        GameRegistry.registerItem(MCHeliParts.fuelTank1000, "fuelTank1000");
        GameRegistry.registerItem(MCHeliParts.fuelTank2000, "fuelTank2000");
        GameRegistry.registerItem(MCHeliParts.fuelTank3000, "fuelTank3000");
        GameRegistry.registerItem(MCHeliParts.fuelTank4000, "fuelTank4000");
        GameRegistry.registerItem(MCHeliParts.fuelTank5000, "fuelTank5000");
        GameRegistry.registerItem(MCHeliParts.fuelTank10000, "fuelTank10000");
        GameRegistry.registerItem(MCHeliParts.fuelTank20000, "fuelTank20000");
        GameRegistry.registerItem(MCHeliParts.fuelTank50000, "fuelTank50000");
        
        GameRegistry.registerItem(MCHeliParts.reinforcedPiston, "reinforcedPiston");
        GameRegistry.registerItem(MCHeliParts.titaniumReinforcedPiston, "titaniumReinforcedPiston");
        
        GameRegistry.registerItem(MCHeliParts.compositeMaterialSet, "compositeMaterialSet");
        GameRegistry.registerItem(MCHeliParts.compositeMaterialMixture, "compositeMaterialMixture");
        GameRegistry.registerItem(MCHeliParts.compositeMaterialIngot, "compositeMaterialIngot");
        GameRegistry.registerItem(MCHeliParts.compositeMaterialPlate, "compositeMaterialPlate");
        GameRegistry.registerItem(MCHeliParts.compositeMaterialFuselagePlate, "compositeMaterialFuselagePlate");
        
        //Electronics
        GameRegistry.registerItem(MCHeliParts.nightVisionSystem, "nightVisionSystem");
        
        //Specifics
        
        //Osprey
        GameRegistry.registerItem(MCHeliParts.ospreyWing, "ospreyWing");
        GameRegistry.registerItem(MCHeliParts.ospreyEngine, "ospreyEngine");
        GameRegistry.registerItem(MCHeliParts.ospreyEngineCasing, "ospreyEngineCasing");
        GameRegistry.registerItem(MCHeliParts.ospreyCockpit, "ospreyCockpit");
        GameRegistry.registerItem(MCHeliParts.ospreyControlBay, "ospreyControlBay");
        GameRegistry.registerItem(MCHeliParts.ospreyTailPiece, "ospreyTailPiece");
        GameRegistry.registerItem(MCHeliParts.v22Fuselage, "v22Fuselage");
        GameRegistry.registerItem(MCHeliParts.mv22Fuselage, "mv22Fuselage");
        GameRegistry.registerItem(MCHeliParts.v22WeaponsSystem, "v22WeaponsSystem");
        
        //Towns
        GameRegistry.registerItem(MCHeliParts.valthraxusToken, "valthraxusToken");
        GameRegistry.registerItem(MCHeliParts.larchToken, "larchToken");
        GameRegistry.registerItem(MCHeliParts.eouToken, "eouToken");
        GameRegistry.registerItem(MCHeliParts.vanguardsPeakToken, "vanguardsPeakToken");
		
		
		
		
		
		
		
		
		
		
	}

}
