package co.uk.silvania.mcheliparts;

import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	@Instance
	public static MCHeliParts instance;
	
	public void registerRenderers() {
		
	}
	
	public void registerItems() {
		GameRegistry.registerItem(MCHeliParts.lowTorqueEngine, "lowTorqueEngine");
		GameRegistry.registerItem(MCHeliParts.mediumTorqueEngine, "mediumTorqueEngine");
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
		
		GameRegistry.registerItem(MCHeliParts.smallNichromeAirframe, "smallNichromeAirframe");
        GameRegistry.registerItem(MCHeliParts.mediumNichromeAirframe, "mediumNichromeAirframe");
		GameRegistry.registerItem(MCHeliParts.largeNichromeAirframe, "largeNichromeAirframe");
        GameRegistry.registerItem(MCHeliParts.hugeNichromeAirframe, "hugeNichromeAirframe");
        GameRegistry.registerItem(MCHeliParts.smallAluminiumAirframe, "smallAluminiumAirframe");
        GameRegistry.registerItem(MCHeliParts.mediumAluminiumAirframe, "mediumAluminiumAirframe");
		GameRegistry.registerItem(MCHeliParts.largeAluminiumAirframe, "largeAluminiumAirframe");
        GameRegistry.registerItem(MCHeliParts.hugeAluminiumAirframe, "hugeAluminiumAirframe");
        GameRegistry.registerItem(MCHeliParts.smallCompositeAirframe, "smallCompositeAirframe");
        GameRegistry.registerItem(MCHeliParts.mediumCompositeAirframe, "mediumCompositeAirframe");
		GameRegistry.registerItem(MCHeliParts.largeCompositeAirframe, "largeCompositeAirframe");
        GameRegistry.registerItem(MCHeliParts.hugeCompositeAirframe, "hugeCompositeAirframe");
        GameRegistry.registerItem(MCHeliParts.smallTitaniumAirframe, "smallTitaniumAirframe");
        GameRegistry.registerItem(MCHeliParts.mediumTitaniumAirframe, "mediumTitaniumAirframe");
		GameRegistry.registerItem(MCHeliParts.largeTitaniumAirframe, "largeTitaniumAirframe");
        GameRegistry.registerItem(MCHeliParts.hugeTitaniumAirframe, "hugeTitaniumAirframe");
        
        GameRegistry.registerItem(MCHeliParts.smallNichromeFuselage, "smallNichromeFuselage");
        GameRegistry.registerItem(MCHeliParts.mediumNichromeFuselage, "mediumNichromeFuselage");
		GameRegistry.registerItem(MCHeliParts.largeNichromeFuselage, "largeNichromeFuselage");
        GameRegistry.registerItem(MCHeliParts.hugeNichromeFuselage, "hugeNichromeFuselage");
        GameRegistry.registerItem(MCHeliParts.smallAluminiumFuselage, "smallAluminiumFuselage");
        GameRegistry.registerItem(MCHeliParts.mediumAluminiumFuselage, "mediumAluminiumFuselage");
		GameRegistry.registerItem(MCHeliParts.largeAluminiumFuselage, "largeAluminiumFuselage");
        GameRegistry.registerItem(MCHeliParts.hugeAluminiumFuselage, "hugeAluminiumFuselage");
        GameRegistry.registerItem(MCHeliParts.smallCompositeFuselage, "smallCompositeFuselage");
        GameRegistry.registerItem(MCHeliParts.mediumCompositeFuselage, "mediumCompositeFuselage");
		GameRegistry.registerItem(MCHeliParts.largeCompositeFuselage, "largeCompositeFuselage");
        GameRegistry.registerItem(MCHeliParts.hugeCompositeFuselage, "hugeCompositeFuselage");
        GameRegistry.registerItem(MCHeliParts.smallTitaniumFuselage, "smallTitaniumFuselage");
        GameRegistry.registerItem(MCHeliParts.mediumTitaniumFuselage, "mediumTitaniumFuselage");
		GameRegistry.registerItem(MCHeliParts.largeTitaniumFuselage, "largeTitaniumFuselage");
        GameRegistry.registerItem(MCHeliParts.hugeTitaniumFuselage, "hugeTitaniumFuselage");
        
        GameRegistry.registerItem(MCHeliParts.smallNichromeCockpit, "smallNichromeCockpit");
        GameRegistry.registerItem(MCHeliParts.mediumNichromeCockpit, "mediumNichromeCockpit");
		GameRegistry.registerItem(MCHeliParts.largeNichromeCockpit, "largeNichromeCockpit");
        GameRegistry.registerItem(MCHeliParts.hugeNichromeCockpit, "hugeNichromeCockpit");
        GameRegistry.registerItem(MCHeliParts.smallAluminiumCockpit, "smallAluminiumCockpit");
        GameRegistry.registerItem(MCHeliParts.mediumAluminiumCockpit, "mediumAluminiumCockpit");
		GameRegistry.registerItem(MCHeliParts.largeAluminiumCockpit, "largeAluminiumCockpit");
        GameRegistry.registerItem(MCHeliParts.hugeAluminiumCockpit, "hugeAluminiumCockpit");
        GameRegistry.registerItem(MCHeliParts.smallCompositeCockpit, "smallCompositeCockpit");
        GameRegistry.registerItem(MCHeliParts.mediumCompositeCockpit, "mediumCompositeCockpit");
		GameRegistry.registerItem(MCHeliParts.largeCompositeCockpit, "largeCompositeCockpit");
        GameRegistry.registerItem(MCHeliParts.hugeCompositeCockpit, "hugeCompositeCockpit");
        GameRegistry.registerItem(MCHeliParts.smallTitaniumCockpit, "smallTitaniumCockpit");
        GameRegistry.registerItem(MCHeliParts.mediumTitaniumCockpit, "mediumTitaniumCockpit");
		GameRegistry.registerItem(MCHeliParts.largeTitaniumCockpit, "largeTitaniumCockpit");
        GameRegistry.registerItem(MCHeliParts.hugeTitaniumCockpit, "hugeTitaniumCockpit");
		
		GameRegistry.registerItem(MCHeliParts.smallAluminiumSupportBeam, "smallAluminiumSupportBeam");
		GameRegistry.registerItem(MCHeliParts.mediumAluminiumSupportBeam, "mediumAluminiumSupportBeam");
		GameRegistry.registerItem(MCHeliParts.largeAluminiumSupportBeam, "largeAluminiumSupportBeam");
		GameRegistry.registerItem(MCHeliParts.hugeAluminiumSupportBeam, "hugeAluminiumSupportBeam");
		GameRegistry.registerItem(MCHeliParts.smallTitaniumSupportBeam, "smallTitaniumSupportBeam");
		GameRegistry.registerItem(MCHeliParts.mediumTitaniumSupportBeam, "mediumTitaniumSupportBeam");
		GameRegistry.registerItem(MCHeliParts.largeTitaniumSupportBeam, "largeTitaniumSupportBeam");
		GameRegistry.registerItem(MCHeliParts.hugeTitaniumSupportBeam, "hugeTitaniumSupportBeam");
		GameRegistry.registerItem(MCHeliParts.smallNichromeSupportBeam, "smallNichromeSupportBeam");
		GameRegistry.registerItem(MCHeliParts.mediumNichromeSupportBeam, "mediumNichromeSupportBeam");
		GameRegistry.registerItem(MCHeliParts.largeNichromeSupportBeam, "largeNichromeSupportBeam");
		GameRegistry.registerItem(MCHeliParts.hugeNichromeSupportBeam, "hugeNichromeSupportBeam");
		GameRegistry.registerItem(MCHeliParts.smallCompositeSupportBeam, "smallCompositeSupportBeam");
		GameRegistry.registerItem(MCHeliParts.mediumCompositeSupportBeam, "mediumCompositeSupportBeam");
		GameRegistry.registerItem(MCHeliParts.largeCompositeSupportBeam, "largeCompositeSupportBeam");
		GameRegistry.registerItem(MCHeliParts.hugeCompositeSupportBeam, "hugeCompositeSupportBeam");
		
		GameRegistry.registerItem(MCHeliParts.ironSeatFrame, "ironSeatFrame");
		GameRegistry.registerItem(MCHeliParts.steelSeat1, "steelSeat1");
		GameRegistry.registerItem(MCHeliParts.steelSeat2, "steelSeat2");
		GameRegistry.registerItem(MCHeliParts.steelSeat3, "steelSeat3");
		GameRegistry.registerItem(MCHeliParts.steelSeat4, "steelSeat4");
		GameRegistry.registerItem(MCHeliParts.steelSeat5, "steelSeat5");
		GameRegistry.registerItem(MCHeliParts.leatherSeat1, "leatherSeat1");
		GameRegistry.registerItem(MCHeliParts.leatherSeat2, "leatherSeat2");
		GameRegistry.registerItem(MCHeliParts.leatherSeat3, "leatherSeat3");
		GameRegistry.registerItem(MCHeliParts.leatherSeat4, "leatherSeat4");
		GameRegistry.registerItem(MCHeliParts.leatherSeat5, "leatherSeat5");
		GameRegistry.registerItem(MCHeliParts.paddedSeat1, "paddedSeat1");
		GameRegistry.registerItem(MCHeliParts.paddedSeat2, "paddedSeat2");
		GameRegistry.registerItem(MCHeliParts.paddedSeat3, "paddedSeat3");
		GameRegistry.registerItem(MCHeliParts.paddedSeat4, "paddedSeat4");
		GameRegistry.registerItem(MCHeliParts.paddedSeat5, "paddedSeat5");
		GameRegistry.registerItem(MCHeliParts.airlinerSeat1, "airlinerSeat1");
		GameRegistry.registerItem(MCHeliParts.airlinerSeat2, "airlinerSeat2");
		GameRegistry.registerItem(MCHeliParts.airlinerSeat3, "airlinerSeat3");
		GameRegistry.registerItem(MCHeliParts.airlinerSeat4, "airlinerSeat4");
		GameRegistry.registerItem(MCHeliParts.airlinerSeat5, "airlinerSeat5");
		GameRegistry.registerItem(MCHeliParts.airlinerSeat10, "airlinerSeat10");
		GameRegistry.registerItem(MCHeliParts.airlinerSeat50, "airlinerSeat50");
		GameRegistry.registerItem(MCHeliParts.foldingTray, "foldingTray");
        
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
        GameRegistry.registerItem(MCHeliParts.propellorBlade, "propellorBlade");
        GameRegistry.registerItem(MCHeliParts.twoBladePropellor, "twoBladePropellor");
        GameRegistry.registerItem(MCHeliParts.threeBladePropellor, "threeBladePropellor");
        GameRegistry.registerItem(MCHeliParts.fourBladePropellor, "fourBladePropellor");
        GameRegistry.registerItem(MCHeliParts.fiveBladePropellor, "fiveBladePropellor");
        GameRegistry.registerItem(MCHeliParts.smallWheel, "smallWheel");
        GameRegistry.registerItem(MCHeliParts.mediumWheel, "mediumWheel");
        GameRegistry.registerItem(MCHeliParts.largeWheel, "largeWheel");
        GameRegistry.registerItem(MCHeliParts.smallDoubleWheel, "smallDoubleWheel");
        GameRegistry.registerItem(MCHeliParts.mediumDoubleWheel, "mediumDoubleWheel");
        GameRegistry.registerItem(MCHeliParts.largeDoubleWheel, "largeDoubleWheel");
        GameRegistry.registerItem(MCHeliParts.smallFloat, "smallFloat");
        GameRegistry.registerItem(MCHeliParts.mediumFloat, "mediumFloat");
        GameRegistry.registerItem(MCHeliParts.largeFloat, "largeFloat");
        GameRegistry.registerItem(MCHeliParts.lowTorquePropEngine, "lowTorquePropEngine");
        GameRegistry.registerItem(MCHeliParts.medTorquePropEngine, "medTorquePropEngine");
        GameRegistry.registerItem(MCHeliParts.highTorquePropEngine, "highTorquePropEngine");
        GameRegistry.registerItem(MCHeliParts.lowTorqueJetEngine, "lowTorqueJetEngine");
        GameRegistry.registerItem(MCHeliParts.medTorqueJetEngine, "medTorqueJetEngine");
        GameRegistry.registerItem(MCHeliParts.highTorqueJetEngine, "highTorqueJetEngine");
        GameRegistry.registerItem(MCHeliParts.lowTorqueLPJetEngine, "lowTorqueLPJetEngine");
        GameRegistry.registerItem(MCHeliParts.medTorqueLPJetEngine, "medTorqueLPJetEngine");
        GameRegistry.registerItem(MCHeliParts.highTorqueLPJetEngine, "highTorqueLPJetEngine");
        GameRegistry.registerItem(MCHeliParts.stealthEngine, "stealthEngine");
        GameRegistry.registerItem(MCHeliParts.lowTorqueIonThruster, "lowTorqueIonThruster");
        GameRegistry.registerItem(MCHeliParts.medTorqueIonThruster, "medTorqueIonThruster");
        GameRegistry.registerItem(MCHeliParts.highTorqueIonThruster, "highTorqueIonThruster");
        GameRegistry.registerItem(MCHeliParts.pressurizedCabinGlass, "pressurizedCabinGlass");
        GameRegistry.registerItem(MCHeliParts.rawPressurizedCabinGlass, "rawPressurizedCabinGlass");
        GameRegistry.registerItem(MCHeliParts.oxygenMaskSet, "oxygenMaskSet");
        GameRegistry.registerItem(MCHeliParts.oxygenMask, "oxygenMask");
        
        GameRegistry.registerItem(MCHeliParts.compositeMaterialSet, "compositeMaterialSet");
        GameRegistry.registerItem(MCHeliParts.compositeMaterialMixture, "compositeMaterialMixture");
        GameRegistry.registerItem(MCHeliParts.compositeMaterialIngot, "compositeMaterialIngot");
        GameRegistry.registerItem(MCHeliParts.compositeMaterialPlate, "compositeMaterialPlate");
        GameRegistry.registerItem(MCHeliParts.compositeMaterialFuselagePlate, "compositeMaterialFuselagePlate");
        
        //Electronics
        GameRegistry.registerItem(MCHeliParts.nightVisionSystem, "nightVisionSystem");
        GameRegistry.registerItem(MCHeliParts.stealthSystem, "stealthSystem");
        
        //Heli parts
        GameRegistry.registerItem(MCHeliParts.heliRunners, "heliRunners");
        GameRegistry.registerItem(MCHeliParts.heliFloatRunners, "heliFloatRunners");
        GameRegistry.registerItem(MCHeliParts.heliRotorBlade, "heliRotorBlade");
        GameRegistry.registerItem(MCHeliParts.twoBladeRotor, "twoBladeRotor");
        GameRegistry.registerItem(MCHeliParts.threeBladeRotor, "threeBladeRotor");
        GameRegistry.registerItem(MCHeliParts.fourBladeRotor, "fourBladeRotor");
        GameRegistry.registerItem(MCHeliParts.fiveBladeRotor, "fiveBladeRotor");
        GameRegistry.registerItem(MCHeliParts.sixBladeRotor, "sixBladeRotor");
        GameRegistry.registerItem(MCHeliParts.lowTorqueHeliEngine, "lowTorqueHeliEngine");
        GameRegistry.registerItem(MCHeliParts.medTorqueHeliEngine, "medTorqueHeliEngine");
        GameRegistry.registerItem(MCHeliParts.highTorqueHeliEngine, "highTorqueHeliEngine");
        
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
        
        //Civillian Helis
        GameRegistry.registerItem(MCHeliParts.longRangerFuselage, "longRangerFuselage");
        GameRegistry.registerItem(MCHeliParts.longRangerTail, "longRangerTail");
        GameRegistry.registerItem(MCHeliParts.fl282Fuselage, "fl282Fuselage");
        GameRegistry.registerItem(MCHeliParts.fl282Tail, "fl282Tail");
        GameRegistry.registerItem(MCHeliParts.bell47gFuselage, "bell47gFuselage");
        GameRegistry.registerItem(MCHeliParts.bell47gTail, "bell47GTail");
        GameRegistry.registerItem(MCHeliParts.bell47gWeaponSystem, "bell47GWeaponSystem");
        GameRegistry.registerItem(MCHeliParts.robinsonFuselage, "robinsonFuselage");
        GameRegistry.registerItem(MCHeliParts.robinsonTail, "robinsonTail");
        GameRegistry.registerItem(MCHeliParts.s76Fuselage, "s76Fuselage");
        GameRegistry.registerItem(MCHeliParts.s76Tail, "s76Tail");
        GameRegistry.registerItem(MCHeliParts.s76FancyShit, "s76FancyShit");
        
        
        //Civillian Planes
        GameRegistry.registerItem(MCHeliParts.an2sFuselage, "an2sFuselage");
        GameRegistry.registerItem(MCHeliParts.an2sTail, "an2sTail");
        GameRegistry.registerItem(MCHeliParts.an2sEngine, "an2sEngine");
        GameRegistry.registerItem(MCHeliParts.an2sWing, "an2sWing");
        GameRegistry.registerItem(MCHeliParts.t4Fuselage, "t4Fuselage");
        GameRegistry.registerItem(MCHeliParts.t4Tail, "t4Tail");
        GameRegistry.registerItem(MCHeliParts.t4Engine, "t4Engine");
        GameRegistry.registerItem(MCHeliParts.t4Wing, "t4Wing");
        GameRegistry.registerItem(MCHeliParts.m18Fuselage, "m18Fuselage");
        GameRegistry.registerItem(MCHeliParts.m18Tail, "m18Tail");
        GameRegistry.registerItem(MCHeliParts.m18Engine, "m18Engine");
        GameRegistry.registerItem(MCHeliParts.m18Wing, "m18Wing");
        GameRegistry.registerItem(MCHeliParts.p180Fuselage, "p180Fuselage");
        GameRegistry.registerItem(MCHeliParts.p180Cockpit, "p180Cockpit");
        GameRegistry.registerItem(MCHeliParts.p180Tail, "p180Tail");
        GameRegistry.registerItem(MCHeliParts.p180Engine, "p180Engine");
        GameRegistry.registerItem(MCHeliParts.p180Wing, "p180Wing");
        GameRegistry.registerItem(MCHeliParts.md90Fuselage, "md90Fuselage");
        GameRegistry.registerItem(MCHeliParts.md90Cockpit, "md90Cockpit");
        GameRegistry.registerItem(MCHeliParts.md90Tail, "md90Tail");
        GameRegistry.registerItem(MCHeliParts.md90Engine, "md90Engine");
        GameRegistry.registerItem(MCHeliParts.md90Wing, "md90Wing");
        GameRegistry.registerItem(MCHeliParts.mc72Fuselage, "mc72Fuselage");
        GameRegistry.registerItem(MCHeliParts.mc72Tail, "mc72Tail");
        GameRegistry.registerItem(MCHeliParts.mc72Engine, "mc72Engine");
        GameRegistry.registerItem(MCHeliParts.mc72Wing, "mc72Wing");
        GameRegistry.registerItem(MCHeliParts.mc72Floater, "mc72Floater");
        GameRegistry.registerItem(MCHeliParts.m33Fuselage, "m33Fuselage");
        GameRegistry.registerItem(MCHeliParts.m33Tail, "m33Tail");
        GameRegistry.registerItem(MCHeliParts.m33Engine, "m33Engine");
        GameRegistry.registerItem(MCHeliParts.m33Wing, "m33Wing");
        GameRegistry.registerItem(MCHeliParts.m33Floater, "m33Floater");
        GameRegistry.registerItem(MCHeliParts.cessna172Fuselage, "cessna172Fuselage");
        GameRegistry.registerItem(MCHeliParts.cessna172Tail, "cessna172Tail");
        GameRegistry.registerItem(MCHeliParts.cessna172Engine, "cessna172Engine");
        GameRegistry.registerItem(MCHeliParts.cessna172Wing, "cessna172Wing");
        GameRegistry.registerItem(MCHeliParts.cessna172Floater, "cessna172Floater");
        GameRegistry.registerItem(MCHeliParts.cessna152Fuselage, "cessna152Fuselage");
        GameRegistry.registerItem(MCHeliParts.cessna152Tail, "cessna152Tail");
        GameRegistry.registerItem(MCHeliParts.cessna152Engine, "cessna152Engine");
        GameRegistry.registerItem(MCHeliParts.cessna152Wing, "cessna152Wing");
        
        //Halo
        GameRegistry.registerItem(MCHeliParts.hornetFuselage, "hornetFuselage");
        GameRegistry.registerItem(MCHeliParts.hornetEngine, "hornetEngine");
        GameRegistry.registerItem(MCHeliParts.hornetWing, "hornetWing");
        GameRegistry.registerItem(MCHeliParts.hornetStandWing, "hornetStandWing");
        GameRegistry.registerItem(MCHeliParts.hornetControlSystem, "hornetControlSystem");
        GameRegistry.registerItem(MCHeliParts.hornetWeaponSystem, "hornetWeaponSystem");
        GameRegistry.registerItem(MCHeliParts.ghostFuselage, "ghostFuselage");
        GameRegistry.registerItem(MCHeliParts.ghostControlSystem, "ghostControlSystem");
        GameRegistry.registerItem(MCHeliParts.ghostEngine, "ghostEngine");
        GameRegistry.registerItem(MCHeliParts.ghostExhaust, "ghostExhaust");
        GameRegistry.registerItem(MCHeliParts.ghostWeaponSystem, "ghostWeaponSystem");
        GameRegistry.registerItem(MCHeliParts.bansheeLowerFuselage, "bansheeLowerFuselage");
        GameRegistry.registerItem(MCHeliParts.bansheeUpperFuselage, "bansheeUpperFuselage");
        GameRegistry.registerItem(MCHeliParts.bansheeControlSystem, "bansheeControlSystem");
        GameRegistry.registerItem(MCHeliParts.bansheeWing, "bansheeWing");
        GameRegistry.registerItem(MCHeliParts.bansheeEngine, "bansheeEngine");
        GameRegistry.registerItem(MCHeliParts.bansheeWeaponSystem, "bansheeWeaponSystem");
        
        GameRegistry.registerItem(MCHeliParts.unscVulcan, "unscVulcan");
        GameRegistry.registerItem(MCHeliParts.unscVulcanRounds, "unscVulcanRounds");
        GameRegistry.registerItem(MCHeliParts.unscRocketLauncher, "unscRocketLauncher");
        GameRegistry.registerItem(MCHeliParts.unscRocket, "unscRocket");
        GameRegistry.registerItem(MCHeliParts.covenantPlasmaCannon, "covenantPlasmaCannon");
        GameRegistry.registerItem(MCHeliParts.covenantPlasmaCharger, "covenantPlasmaCharger");
        GameRegistry.registerItem(MCHeliParts.covenantFuelRodCannon, "covenantFuelRodCannon");
        GameRegistry.registerItem(MCHeliParts.covenantFuelRod, "covenantFuelRod");
        
        GameRegistry.registerItem(MCHeliParts.round5_56mm, "round5_56mm");
        GameRegistry.registerItem(MCHeliParts.round5_56mm_5x, "round5_56mm_5x");
        GameRegistry.registerItem(MCHeliParts.round5_56mm_30x, "round5_56mm_30x");
        GameRegistry.registerItem(MCHeliParts.round5_56mm_100x, "round5_56mm_100x");
        
        //Towns
        GameRegistry.registerItem(MCHeliParts.valthraxusToken, "valthraxusToken");
        GameRegistry.registerItem(MCHeliParts.larchToken, "larchToken");
        GameRegistry.registerItem(MCHeliParts.eouToken, "eouToken");
        GameRegistry.registerItem(MCHeliParts.vanguardsPeakToken, "vanguardsPeakToken");		
	}

}
