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
        GameRegistry.registerItem(MCHeliParts.stealthEngine, "stealthEngine");
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
        GameRegistry.registerItem(MCHeliParts.an2sWing, "an2sWing");
        GameRegistry.registerItem(MCHeliParts.t4Fuselage, "t4Fuselage");
        GameRegistry.registerItem(MCHeliParts.t4Tail, "t4Tail");
        GameRegistry.registerItem(MCHeliParts.t4Wing, "t4Wing");
        GameRegistry.registerItem(MCHeliParts.m18Fuselage, "m18Fuselage");
        GameRegistry.registerItem(MCHeliParts.m18Tail, "m18Tail");
        GameRegistry.registerItem(MCHeliParts.m18Wing, "m18Wing");
        GameRegistry.registerItem(MCHeliParts.p180Fuselage, "p180Fuselage");
        GameRegistry.registerItem(MCHeliParts.p180Cockpit, "p180Cockpit");
        GameRegistry.registerItem(MCHeliParts.p180Tail, "p180Tail");
        GameRegistry.registerItem(MCHeliParts.p180Wing, "p180Wing");
        GameRegistry.registerItem(MCHeliParts.md90Fuselage, "md90Fuselage");
        GameRegistry.registerItem(MCHeliParts.md90Cockpit, "md90Cockpit");
        GameRegistry.registerItem(MCHeliParts.md90Tail, "md90Tail");
        GameRegistry.registerItem(MCHeliParts.md90Wing, "md90Wing");
        GameRegistry.registerItem(MCHeliParts.mc72Fuselage, "mc72Fuselage");
        GameRegistry.registerItem(MCHeliParts.mc72Tail, "mc72Tail");
        GameRegistry.registerItem(MCHeliParts.mc72Wing, "mc72Wing");
        GameRegistry.registerItem(MCHeliParts.mc72Floater, "mc72Floater");
        GameRegistry.registerItem(MCHeliParts.m33Fuselage, "m33Fuselage");
        GameRegistry.registerItem(MCHeliParts.m33Tail, "m33Tail");
        GameRegistry.registerItem(MCHeliParts.m33Wing, "m33Wing");
        GameRegistry.registerItem(MCHeliParts.m33Engine, "m33Engine");
        GameRegistry.registerItem(MCHeliParts.cessna172Fuselage, "cessna172Fuselage");
        GameRegistry.registerItem(MCHeliParts.cessna172Tail, "cessna172Tail");
        GameRegistry.registerItem(MCHeliParts.cessna172Floater, "cessna172Floater");
        GameRegistry.registerItem(MCHeliParts.cessna152Fuselage, "cessna152Fuselage");
        GameRegistry.registerItem(MCHeliParts.cessna152Tail, "cessna152Tail");
        GameRegistry.registerItem(MCHeliParts.cessnaWing, "cessnaWing");
        
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
        
        GameRegistry.registerItem(MCHeliParts.smallBullet, "smallBullet");
        GameRegistry.registerItem(MCHeliParts.mediumBullet, "mediumBullet");
        GameRegistry.registerItem(MCHeliParts.largeBullet, "largeBullet");
        GameRegistry.registerItem(MCHeliParts.cannonBullet, "cannonBullet");
        GameRegistry.registerItem(MCHeliParts.blackPowder, "blackPowder");
        GameRegistry.registerItem(MCHeliParts.cartridgePrimer, "cartridgePrimer");
        GameRegistry.registerItem(MCHeliParts.grenadePrimer, "grenadePrimer");
        GameRegistry.registerItem(MCHeliParts.bombPrimer, "bombPrimer");
        GameRegistry.registerItem(MCHeliParts.missilePrimer, "missilePrimer");
        GameRegistry.registerItem(MCHeliParts.missilePlating, "missilePlating");
        GameRegistry.registerItem(MCHeliParts.smallMissileHousing, "smallMissileHousing");
        GameRegistry.registerItem(MCHeliParts.mediumMissileHousing, "mediumMissileHousing");
        GameRegistry.registerItem(MCHeliParts.largeMissileHousing, "largeMissileHousing");
        GameRegistry.registerItem(MCHeliParts.missileExplosiveSmall, "missileExplosiveSmalll");
        GameRegistry.registerItem(MCHeliParts.missileExplosiveMedium, "missileExplosiveMedium");
        GameRegistry.registerItem(MCHeliParts.missileExplosiveLarge, "missileExplosiveLarge");
        GameRegistry.registerItem(MCHeliParts.missileFin, "missileFin");
        GameRegistry.registerItem(MCHeliParts.missileLaserGuidance, "missileLaserGuidance");
        GameRegistry.registerItem(MCHeliParts.missileCamera, "missileCamera");
        GameRegistry.registerItem(MCHeliParts.missilePropellant, "missilePropellant");
        GameRegistry.registerItem(MCHeliParts.missileFuelCell, "missileFuelCell");
        GameRegistry.registerItem(MCHeliParts.shotgunPrimer, "shotgunPrimer");

        GameRegistry.registerItem(MCHeliParts.case5_56mm, "case5_56mm");
        GameRegistry.registerItem(MCHeliParts.case7_62mm, "case7_62mm");
        GameRegistry.registerItem(MCHeliParts.case7_7mm, "case7_7mm");
        GameRegistry.registerItem(MCHeliParts.case7_8mm, "case7_8mm");
        GameRegistry.registerItem(MCHeliParts.case7_9mm, "case7_9mm");
        GameRegistry.registerItem(MCHeliParts.case7_92mm, "case7_92mm");
        GameRegistry.registerItem(MCHeliParts.case9mm, "case9mm");
        GameRegistry.registerItem(MCHeliParts.case10_9mm, "case10_9mm");
        GameRegistry.registerItem(MCHeliParts.case11_43mm, "case11_43mm");
        GameRegistry.registerItem(MCHeliParts.case12_7mm, "case12_7mm");
        GameRegistry.registerItem(MCHeliParts.case12gauge, "case12gauge");

        GameRegistry.registerItem(MCHeliParts.round5_45mm, "round5_45mm");     
        GameRegistry.registerItem(MCHeliParts.round5_56mm, "round5_56mm");
        GameRegistry.registerItem(MCHeliParts.round5_56mm_5x, "round5_56mm_5x");
        GameRegistry.registerItem(MCHeliParts.round5_56mm_30x, "round5_56mm_30x");
        GameRegistry.registerItem(MCHeliParts.round5_56mm_100x, "round5_56mm_100x");
        GameRegistry.registerItem(MCHeliParts.round5_7mm, "round5_7mm");
        GameRegistry.registerItem(MCHeliParts.round7_62mm, "round7_62mm");
        GameRegistry.registerItem(MCHeliParts.round7_62mm_he, "round7_62mm_he");
        GameRegistry.registerItem(MCHeliParts.round7_62mm_tracer, "round7_62mm_tracer");
        GameRegistry.registerItem(MCHeliParts.round7_7mm, "round7_7mm");
        GameRegistry.registerItem(MCHeliParts.round7_92mm, "round7_92mm");
        GameRegistry.registerItem(MCHeliParts.round9mm, "round9mm");
        GameRegistry.registerItem(MCHeliParts.round9mm_poison, "round9mm_poison");
        GameRegistry.registerItem(MCHeliParts.round10_9mm, "round10_9mm");
        GameRegistry.registerItem(MCHeliParts.round11_43mm, "round11_43mm");
        GameRegistry.registerItem(MCHeliParts.round12_7mm, "round12_7mm");
        GameRegistry.registerItem(MCHeliParts.round12_7mm_he, "round12_7mm_he");
        GameRegistry.registerItem(MCHeliParts.round12_7mm_tracer, "round12_7mm_tracer");
        GameRegistry.registerItem(MCHeliParts.round12_7mm_explosive, "round12_7mm_explosive");
        GameRegistry.registerItem(MCHeliParts.round12gauge, "round12gauge");
        GameRegistry.registerItem(MCHeliParts.round12gauge_incendiary, "round12gauge_incendiary");

        GameRegistry.registerItem(MCHeliParts.emptyMagACR, "emptyMagACR");
        GameRegistry.registerItem(MCHeliParts.emptyMagAK74, "emptyMagAK74");
        GameRegistry.registerItem(MCHeliParts.emptyMagAUG, "emptyMagAUG");
        GameRegistry.registerItem(MCHeliParts.emptyMagBarrett, "emptyMagBarrett");
        GameRegistry.registerItem(MCHeliParts.emptyMagBizon, "emptyMagBizon");
        GameRegistry.registerItem(MCHeliParts.emptyMagDesertEagle, "emptyMagDesertEagle");
        GameRegistry.registerItem(MCHeliParts.emptyMagDragonuv, "emptyMagDragonuv");
        GameRegistry.registerItem(MCHeliParts.emptyMagScar, "emptyMagScar");
        GameRegistry.registerItem(MCHeliParts.emptyMagG3, "emptyMagG3");
        GameRegistry.registerItem(MCHeliParts.emptyMagG36, "emptyMagG36");
        GameRegistry.registerItem(MCHeliParts.emptyMagGlock, "emptyMagGlock");
        GameRegistry.registerItem(MCHeliParts.emptyMagGlockHi, "emptyMagGlockHi");
        GameRegistry.registerItem(MCHeliParts.emptyMagL86, "emptyMagL86");
        GameRegistry.registerItem(MCHeliParts.emptyMagL96, "emptyMagL96");
        GameRegistry.registerItem(MCHeliParts.emptyMagM4, "emptyMagM4");
        GameRegistry.registerItem(MCHeliParts.emptyMagM9, "emptyMagM9");
        GameRegistry.registerItem(MCHeliParts.emptyMagM14, "emptyMagM14");
        GameRegistry.registerItem(MCHeliParts.emptyMagM21, "emptyMagM21");
        GameRegistry.registerItem(MCHeliParts.emptyMagM40A3, "emptyMagM40A3");
        GameRegistry.registerItem(MCHeliParts.emptyMagM249, "emptyMagM249");
        GameRegistry.registerItem(MCHeliParts.emptyMagM1911, "emptyMagM1911");
        GameRegistry.registerItem(MCHeliParts.emptyMagMakarov, "emptyMagMakarov");
        GameRegistry.registerItem(MCHeliParts.emptyMagMP5, "emptyMagMP5");
        GameRegistry.registerItem(MCHeliParts.emptyMagMTAR, "emptyMagMTAR");
        GameRegistry.registerItem(MCHeliParts.emptyMagP90, "emptyMagP90");
        GameRegistry.registerItem(MCHeliParts.emptyMagRPD, "emptyMagRPD");
        GameRegistry.registerItem(MCHeliParts.emptyMagSG550, "emptyMagSG550");
        GameRegistry.registerItem(MCHeliParts.emptyMagSIG_P226, "emptyMagSIG_P226");
        GameRegistry.registerItem(MCHeliParts.emptyMagSkorpion, "emptyMagSkorpion");
        GameRegistry.registerItem(MCHeliParts.emptyMagUSP, "emptyMagUSP");
        GameRegistry.registerItem(MCHeliParts.emptyMagUzi, "emptyMagUzi");

        GameRegistry.registerItem(MCHeliParts.barrelSection, "barrelSection");
        GameRegistry.registerItem(MCHeliParts.flashHider, "flashHider");
        GameRegistry.registerItem(MCHeliParts.cheekRest, "cheekRest");
        GameRegistry.registerItem(MCHeliParts.trigger, "trigger");
        GameRegistry.registerItem(MCHeliParts.pistolStyleGrip, "pistolStyleGrip");
        GameRegistry.registerItem(MCHeliParts.magRelease, "magRelease");
        GameRegistry.registerItem(MCHeliParts.fixedStock, "fixedStock");
        GameRegistry.registerItem(MCHeliParts.slidingStock, "slidingStock");
        GameRegistry.registerItem(MCHeliParts.skeletonStock, "skeletonStock");

        GameRegistry.registerItem(MCHeliParts.assaultRifleBarrel, "assaultRifleBarrel");
        GameRegistry.registerItem(MCHeliParts.assaultRifleBolt, "assaultRifleBolt");
        GameRegistry.registerItem(MCHeliParts.assaultRifleMagwell, "assaultRifleMagwell");
        GameRegistry.registerItem(MCHeliParts.assaultRifleFiringPin, "assaultRifleFiringPin");
        GameRegistry.registerItem(MCHeliParts.assaultRifleFireSelectorSSF, "assaultRifleFireSelectorSSF");
        GameRegistry.registerItem(MCHeliParts.assaultRifleFireSelectorSSB, "assaultRifleFireSelectorSSB");
        GameRegistry.registerItem(MCHeliParts.assaultRifleFireSelectorSF, "assaultRifleFireSelectorSF");
        GameRegistry.registerItem(MCHeliParts.assaultRifleRISRail, "assaultRifleRISRail");

        GameRegistry.registerItem(MCHeliParts.assaultRifleACRReciever, "assaultRifleACRReciever");
        GameRegistry.registerItem(MCHeliParts.assaultRifleAUGReciever, "assaultRifleAUGReciever");
        GameRegistry.registerItem(MCHeliParts.assaultRifleScarReciever, "assaultRifleScarReciever");
        GameRegistry.registerItem(MCHeliParts.assaultRifleG36Reciever, "assaultRifleG36Reciever");
        GameRegistry.registerItem(MCHeliParts.assaultRifleL86Reciever, "assaultRifleL86Reciever");
        GameRegistry.registerItem(MCHeliParts.assaultRifleM16Reciever, "assaultRifleM16Reciever");
        GameRegistry.registerItem(MCHeliParts.assaultRifleSG550Reciever, "assaultRifleSG550Reciever");
        GameRegistry.registerItem(MCHeliParts.assaultRifleMTARReciever, "assaultRifleMTARReciever");
        GameRegistry.registerItem(MCHeliParts.assaultRifleG3Reciever, "assaultRifleG3Reciever");

        GameRegistry.registerItem(MCHeliParts.sniperRifleBarrel, "sniperRifleBarrel");
        GameRegistry.registerItem(MCHeliParts.sniperRifleBolt, "sniperRifleBolt");
        GameRegistry.registerItem(MCHeliParts.sniperRifleMagwell, "sniperRifleMagwell");
        GameRegistry.registerItem(MCHeliParts.sniperRifleFiringPin, "sniperRifleFiringPin");
        GameRegistry.registerItem(MCHeliParts.sniperRifle1xScope, "sniperRifle1xScope");
        GameRegistry.registerItem(MCHeliParts.sniperRifleBoltHandle, "sniperRifleBoltHandle");

        GameRegistry.registerItem(MCHeliParts.sniperRifleDragonuvReciever, "sniperRifleDragonuvReciever");
        GameRegistry.registerItem(MCHeliParts.sniperRifleL96Reciever, "sniperRifleL96Reciever");
        GameRegistry.registerItem(MCHeliParts.sniperRifleR700Reciever, "sniperRifleR700Reciever");
        GameRegistry.registerItem(MCHeliParts.sniperRifleM14Reciever, "sniperRifleM14Reciever");
        GameRegistry.registerItem(MCHeliParts.sniperRifleM21Reciever, "sniperRifleM21Reciever");
        GameRegistry.registerItem(MCHeliParts.sniperRifleM40A3Reciever, "sniperRifleM40A3Reciever");
        GameRegistry.registerItem(MCHeliParts.sniperRifleBarrettReciever, "sniperRifleBarrettReciever");
        GameRegistry.registerItem(MCHeliParts.sniperRifleBarrettFlashHider, "sniperRifleBarrettFlashHider");

        GameRegistry.registerItem(MCHeliParts.lmgBarrel, "lmgBarrel");
        GameRegistry.registerItem(MCHeliParts.lmgBolt, "lmgBolt");
        GameRegistry.registerItem(MCHeliParts.lmgFeedSlot, "lmgFeedSlot");
        GameRegistry.registerItem(MCHeliParts.lmgMagwell, "lmgMagwell");
        GameRegistry.registerItem(MCHeliParts.lmgFiringPin, "lmgFiringPin");
        GameRegistry.registerItem(MCHeliParts.lmgBarrelJacket, "lmgBarrelJacket");

        GameRegistry.registerItem(MCHeliParts.lmgM60Reciever, "lmgM60Reciever");
        GameRegistry.registerItem(MCHeliParts.lmgM249Reciever, "lmgM249Reciever");
        GameRegistry.registerItem(MCHeliParts.lmgRPDReciever, "lmgRPDReciever");
        GameRegistry.registerItem(MCHeliParts.lmgMinigunReciever, "lmgMinigunReciever");
        GameRegistry.registerItem(MCHeliParts.lmgMinigunBarrelSet, "lmgMinigunBarrelSet");

        GameRegistry.registerItem(MCHeliParts.smgBarrel, "smgBarrel");
        GameRegistry.registerItem(MCHeliParts.smgMagwell, "smgMagwell");

        GameRegistry.registerItem(MCHeliParts.smgAK74Reciever, "smgAK74Reciever");
        GameRegistry.registerItem(MCHeliParts.smgP90Reciever, "smgP90Reciever");
        GameRegistry.registerItem(MCHeliParts.smgBizonReciever, "smgBizonReciever");
        GameRegistry.registerItem(MCHeliParts.smgMP5Reciever, "smgMP5Reciever");
        GameRegistry.registerItem(MCHeliParts.smgUziReciever, "smgUziReciever");
        GameRegistry.registerItem(MCHeliParts.smgSkorpionReciever, "smgSkorpionReciever");
        GameRegistry.registerItem(MCHeliParts.smgP90Magwell, "smgP90Magwell");

        GameRegistry.registerItem(MCHeliParts.pistolBarrel, "pistolBarrel");
        GameRegistry.registerItem(MCHeliParts.pistolGrip, "pistolGrip");
        GameRegistry.registerItem(MCHeliParts.pistolHammer, "pistolHammer");
        GameRegistry.registerItem(MCHeliParts.pistolSlide, "pistolSlide");

        GameRegistry.registerItem(MCHeliParts.pistolGlockFrame, "pistolGlockFrame");
        GameRegistry.registerItem(MCHeliParts.pistolM9Frame, "pistolM9Frame");
        GameRegistry.registerItem(MCHeliParts.pistolMakarovFrame, "pistolMakarovFrame");
        GameRegistry.registerItem(MCHeliParts.pistolP226Frame, "pistolP226Frame");
        GameRegistry.registerItem(MCHeliParts.pistolUSPFrame, "pistolUSPFrame");
        GameRegistry.registerItem(MCHeliParts.pistolM1911Frame, "pistolM1911Frame");
        GameRegistry.registerItem(MCHeliParts.pistolDesertEagleFrame, "pistolDesertEagleFrame");

        GameRegistry.registerItem(MCHeliParts.shotgunBarrel, "shotgunBarrel");
        GameRegistry.registerItem(MCHeliParts.shotgunShellTube, "shotgunShellTube");
        GameRegistry.registerItem(MCHeliParts.shotgunShellDoor, "shotgunShellDoor");

        GameRegistry.registerItem(MCHeliParts.shotgunM1014Reciever, "shotgunM1014Reciever");
        GameRegistry.registerItem(MCHeliParts.shotgunR870Reciever, "shotgunR870Reciever");
        GameRegistry.registerItem(MCHeliParts.shotgunSPASReciever, "shotgunSPASReciever");
        GameRegistry.registerItem(MCHeliParts.shotgunW1200Reciever, "shotgunW1200Reciever");

        //----------------
        // VEHICLES
        //----------------
        
        //round parts
        GameRegistry.registerItem(MCHeliParts.case20mm, "case20mm");
        GameRegistry.registerItem(MCHeliParts.case23mm, "case23mm");
        GameRegistry.registerItem(MCHeliParts.case25mm, "case25mm");
        GameRegistry.registerItem(MCHeliParts.case30mm, "case30mm");
        GameRegistry.registerItem(MCHeliParts.case37mm, "case37mm");
        GameRegistry.registerItem(MCHeliParts.case40mm, "case40mm");
        GameRegistry.registerItem(MCHeliParts.case47mm, "case47mm");
        GameRegistry.registerItem(MCHeliParts.case76mm, "case76mm");
        GameRegistry.registerItem(MCHeliParts.case105mm, "case105mm");
        GameRegistry.registerItem(MCHeliParts.case125mm, "case125mm");

        GameRegistry.registerItem(MCHeliParts.case12_7cm, "case12_7cm");
        GameRegistry.registerItem(MCHeliParts.case15_5cm, "case15_5cm");
        GameRegistry.registerItem(MCHeliParts.case35_6cm, "case35_6cm");
        GameRegistry.registerItem(MCHeliParts.case46cm, "case45cm");

        GameRegistry.registerItem(MCHeliParts.round12_7cm, "round12_7cm");
        GameRegistry.registerItem(MCHeliParts.round12_7cm_5x, "round12_7cm_5x");
        GameRegistry.registerItem(MCHeliParts.round15_5cm, "round15_5cm");
        GameRegistry.registerItem(MCHeliParts.round15_5cm_5x, "round15_5cm_5x");
        GameRegistry.registerItem(MCHeliParts.round35_6cm, "round35_6cm");
        GameRegistry.registerItem(MCHeliParts.round46cm, "round46cm");

        GameRegistry.registerItem(MCHeliParts.round7_62mm_5x, "round7_62mm_5x");
        GameRegistry.registerItem(MCHeliParts.round7_62mm_25x, "round7_62mm_25x");
        GameRegistry.registerItem(MCHeliParts.round7_7mm_5x, "round7_7mm_5x");
        GameRegistry.registerItem(MCHeliParts.round7_7mm_25x, "round7_7mm_25x");
        GameRegistry.registerItem(MCHeliParts.round7_92_5x, "round7_92mm_5x");
        GameRegistry.registerItem(MCHeliParts.round7_92_25x, "round7_92mm_25x");
        GameRegistry.registerItem(MCHeliParts.round12_7mm_5x, "round12_7mm_5x");
        GameRegistry.registerItem(MCHeliParts.round12_7mm_25x, "round12_7mm_25x");
        GameRegistry.registerItem(MCHeliParts.round20mm, "round20mm");
        GameRegistry.registerItem(MCHeliParts.round20mm_5x, "round20mm_5x");
        GameRegistry.registerItem(MCHeliParts.round20mm_25x, "round20mm_25x");
        GameRegistry.registerItem(MCHeliParts.round23mm, "round23mm");
        GameRegistry.registerItem(MCHeliParts.round23mm_5x, "round23mm_5x");
        GameRegistry.registerItem(MCHeliParts.round23mm_25x, "round23mm_25x");
        GameRegistry.registerItem(MCHeliParts.round25mm, "round25mm");
        GameRegistry.registerItem(MCHeliParts.round25mm_5x, "round25mm_5x");
        GameRegistry.registerItem(MCHeliParts.round25mm_25x, "round25mm_25x");
        GameRegistry.registerItem(MCHeliParts.round30mm, "round30mm");
        GameRegistry.registerItem(MCHeliParts.round30mm_5x, "round30mm_5x");
        GameRegistry.registerItem(MCHeliParts.round30mm_25x, "round30mm_25x");
        GameRegistry.registerItem(MCHeliParts.round37mm, "round37mm");
        GameRegistry.registerItem(MCHeliParts.round37mm_5x, "round37mm_5x");
        GameRegistry.registerItem(MCHeliParts.round37mm_25x, "round37mm_25x");
        GameRegistry.registerItem(MCHeliParts.round40mm, "round40mm");
        GameRegistry.registerItem(MCHeliParts.round40mm_5x, "round40mm_5x");
        GameRegistry.registerItem(MCHeliParts.round40mm_25x, "round40mm_25x");
        GameRegistry.registerItem(MCHeliParts.round40mm_Grenade, "round40mm_Grenade");
        GameRegistry.registerItem(MCHeliParts.round40mm_Grenade_5x, "round40mm_Grenade_5x");
        GameRegistry.registerItem(MCHeliParts.round40mm_Grenade_25x, "round40mm_Grenade_25x");
        GameRegistry.registerItem(MCHeliParts.round47mm, "round47mm");
        GameRegistry.registerItem(MCHeliParts.round47mm_5x, "round47mm_5x");
        GameRegistry.registerItem(MCHeliParts.round47mm_25x, "round47mm_25x");
        GameRegistry.registerItem(MCHeliParts.round76mm, "round76mm");
        GameRegistry.registerItem(MCHeliParts.round76mm_5x, "round76mm_5x");
        GameRegistry.registerItem(MCHeliParts.round76mm_25x, "round76mm_25x");
        GameRegistry.registerItem(MCHeliParts.round105mm, "round105mm"); //APFSDS
        GameRegistry.registerItem(MCHeliParts.round105mm_5x, "round125mm_5x"); 
        GameRegistry.registerItem(MCHeliParts.round125mm, "round125mm"); //APFSDS
        GameRegistry.registerItem(MCHeliParts.round125mm_he, "round125mm_he");
        GameRegistry.registerItem(MCHeliParts.roundMk19Grenade, "roundMk19Grenade");

        GameRegistry.registerItem(MCHeliParts.round120mmOrdnance, "round120mmOrdnance");
        GameRegistry.registerItem(MCHeliParts.round50mmOrdnance, "round50mmOrdnance");
        GameRegistry.registerItem(MCHeliParts.round152mmOrdnance, "round152mmOrdnance");

        GameRegistry.registerItem(MCHeliParts.round5_25in, "round5_25in");
        GameRegistry.registerItem(MCHeliParts.round5_25in_5x, "round5_25in_5x");
        GameRegistry.registerItem(MCHeliParts.round5_25in_25x, "round5_25in_25x");

        GameRegistry.registerItem(MCHeliParts.radioA_10_CAS, "radioA_10_CAS");

        GameRegistry.registerItem(MCHeliParts.missile9M114, "missile9M114");
        GameRegistry.registerItem(MCHeliParts.missile9M114_TV, "missile9M114_TV");
        GameRegistry.registerItem(MCHeliParts.missile40mm, "missile40mm");
        GameRegistry.registerItem(MCHeliParts.missile57mm, "missile57mm");
        GameRegistry.registerItem(MCHeliParts.missile66mm, "missile66mm");
        GameRegistry.registerItem(MCHeliParts.missile68mm, "missile68mm");
        GameRegistry.registerItem(MCHeliParts.missile70mm, "missile70mm");
        GameRegistry.registerItem(MCHeliParts.missile70mm_TV, "missile70mm_TV");
        GameRegistry.registerItem(MCHeliParts.missile80mm, "missile80mm");
        GameRegistry.registerItem(MCHeliParts.missile80mm_thermobaric, "missile80mm_thermobaric");
        GameRegistry.registerItem(MCHeliParts.missile80mm_marker, "missile80mm_marker");
        GameRegistry.registerItem(MCHeliParts.missile84mm, "missile84mm");
   		GameRegistry.registerItem(MCHeliParts.missile149mm, "missile149mm");
        GameRegistry.registerItem(MCHeliParts.missile200mm, "missile200mm");
        GameRegistry.registerItem(MCHeliParts.missileAGM_65_Maverick, "missileAGM_65_Maverick");
        GameRegistry.registerItem(MCHeliParts.missileAGM_84_Harpoon, "missileAGM_84_Harpoon");
        GameRegistry.registerItem(MCHeliParts.missileAGM_114_Hellfire, "missileAGM_114_Hellfire");
        GameRegistry.registerItem(MCHeliParts.missileAGM_114_Hellfire_TV, "missileAGM_114_Hellfire_TV");
        GameRegistry.registerItem(MCHeliParts.missileAGM_119B_Penguin, "missileAGM_119B_Penguin");
        GameRegistry.registerItem(MCHeliParts.missileAGM_130, "missileAGM_130");
        GameRegistry.registerItem(MCHeliParts.missileAGM_154, "missileAGM_154");
        GameRegistry.registerItem(MCHeliParts.missileAGM_158_JASSM, "missileAGM_158_JASSM");
        GameRegistry.registerItem(MCHeliParts.missileAIM_7_Sparrow, "missileAIM_7_Sparrow");
        GameRegistry.registerItem(MCHeliParts.missileAIM_9_Sidewinder, "missileAIM_9_Sidewinder");
        GameRegistry.registerItem(MCHeliParts.missileAIM_9x_Sidewinder, "missileAIM_9x_Sidewinder");
        GameRegistry.registerItem(MCHeliParts.missileAIM_92_Stinger, "missileAIM_92_Stinger");
        GameRegistry.registerItem(MCHeliParts.missileAIM_120_AMRAAM, "missileAIM_120_AMRAAM");
        GameRegistry.registerItem(MCHeliParts.missileMIM_23_HAWK, "missileAIM_23_HAWK");
        GameRegistry.registerItem(MCHeliParts.missileIRIS_T, "missileIRIS_T");
        GameRegistry.registerItem(MCHeliParts.missileSA_2, "missileSA_2");
        GameRegistry.registerItem(MCHeliParts.missileGeneric, "missileGeneric");
        GameRegistry.registerItem(MCHeliParts.missileGenericTV, "missileGenericTV");
        GameRegistry.registerItem(MCHeliParts.missileGenericLaser, "missileGenericLaser");

        GameRegistry.registerItem(MCHeliParts.bomb50kg, "bomb50kg");
        GameRegistry.registerItem(MCHeliParts.bomb250kg, "bomb250kg");
        GameRegistry.registerItem(MCHeliParts.bomb250lb, "bomb250lb");
        GameRegistry.registerItem(MCHeliParts.bomb500lb, "bomb500lb");
        GameRegistry.registerItem(MCHeliParts.bomb540lb, "bomb540lb");
        GameRegistry.registerItem(MCHeliParts.bomb1800kg, "bomb1800kg");
        GameRegistry.registerItem(MCHeliParts.bombAN_M17, "bombAN_M17");
        GameRegistry.registerItem(MCHeliParts.bombCluster, "bombCluster");
        GameRegistry.registerItem(MCHeliParts.bombJDAM, "bombJDAM");
        GameRegistry.registerItem(MCHeliParts.bomb936kgTorpedo, "bomb936kgTorpedo");
        GameRegistry.registerItem(MCHeliParts.bombMk46Torpedo, "bombMk46Torpedo");
        GameRegistry.registerItem(MCHeliParts.bombType91Torpedo, "bombType91Torpedo");
        GameRegistry.registerItem(MCHeliParts.bombType93Torpedo, "bombType93Torpedo");
        GameRegistry.registerItem(MCHeliParts.bombType97, "bombType97");
        GameRegistry.registerItem(MCHeliParts.bombMk62Mine, "bombMk62Mine");
        GameRegistry.registerItem(MCHeliParts.bombPlastic, "bombPlastic");

        //Weapons
        GameRegistry.registerItem(MCHeliParts.weaponSmallCannon, "weaponSmallCannon"); //20-50mm rounds
        GameRegistry.registerItem(MCHeliParts.weaponMediumCannon, "weaponMediumCannon"); //51-100mm rounds
        GameRegistry.registerItem(MCHeliParts.weaponLargeCannon, "weaponLargeCannon"); //101mm-200mm rounds
        GameRegistry.registerItem(MCHeliParts.weaponMissileLauncher, "weaponMissileLauncher");
        GameRegistry.registerItem(MCHeliParts.weaponLaserMissileLauncher, "weaponLaserMissileLauncher");
        GameRegistry.registerItem(MCHeliParts.weaponTVMissileLauncher, "weaponTVMissileLauncher");

        GameRegistry.registerItem(MCHeliParts.weaponAGM_Launcher, "weaponAGM_Launcher");
        GameRegistry.registerItem(MCHeliParts.weaponAIM_Launcher, "weaponAIM_Launcher");

        //Weapons (Guns)
        GameRegistry.registerItem(MCHeliParts.weaponGSh_23_2, "weaponGSh_23_2");
        GameRegistry.registerItem(MCHeliParts.weaponYakB_12_7, "weaponYakB_12_7");
        GameRegistry.registerItem(MCHeliParts.weaponGShG_7_62, "weaponGShG_7_62");
        GameRegistry.registerItem(MCHeliParts.weaponM3M, "weaponM3M");
        GameRegistry.registerItem(MCHeliParts.weaponM60, "weaponM60");
        GameRegistry.registerItem(MCHeliParts.weaponM61A1_Vulcan, "weaponM61A1_Vulcan");
        GameRegistry.registerItem(MCHeliParts.weaponM134, "weaponM134");
        GameRegistry.registerItem(MCHeliParts.weaponM134D, "weaponM134D");
        GameRegistry.registerItem(MCHeliParts.weaponM197, "weaponM197");
        GameRegistry.registerItem(MCHeliParts.weaponM230, "weaponM230");
        GameRegistry.registerItem(MCHeliParts.weaponM240, "weaponM240");
        GameRegistry.registerItem(MCHeliParts.weapon12_7_Machine_Gun, "weapon12_7_Machine_Gun");
        

        
        //Towns
        GameRegistry.registerItem(MCHeliParts.valthraxusToken, "valthraxusToken");
        GameRegistry.registerItem(MCHeliParts.larchToken, "larchToken");
        GameRegistry.registerItem(MCHeliParts.eouToken, "eouToken");
        GameRegistry.registerItem(MCHeliParts.vanguardsPeakToken, "vanguardsPeakToken");		
	}

}