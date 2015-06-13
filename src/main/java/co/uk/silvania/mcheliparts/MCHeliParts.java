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
import cpw.mods.fml.common.registry.GameRegistry;


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
    
    //Ranking from cheap to expensive: Aluminium, Titanium, Nichrome, Composite
    public static Item smallAluminiumWing;
    public static Item mediumAluminiumWing;
    public static Item largeAluminiumWing;
    public static Item hugeAluminiumWing;
    public static Item smallTitaniumWing;
    public static Item mediumTitaniumWing;
    public static Item largeTitaniumWing;
    public static Item hugeTitaniumWing;
    public static Item smallNichromeWing;
    public static Item mediumNichromeWing;
    public static Item largeNichromeWing;
    public static Item hugeNichromeWing;
    public static Item smallCompositeWing;
    public static Item mediumCompositeWing;
    public static Item largeCompositeWing;
    public static Item hugeCompositeWing;
    
    public static Item smallAluminiumAirframe;
    public static Item mediumAluminiumAirframe;
    public static Item largeAluminiumAirframe;
    public static Item hugeAluminiumAirframe;
    public static Item smallTitaniumAirframe;
    public static Item mediumTitaniumAirframe;
    public static Item largeTitaniumAirframe;
    public static Item hugeTitaniumAirframe;
    public static Item smallNichromeAirframe;
    public static Item mediumNichromeAirframe;
    public static Item largeNichromeAirframe;
    public static Item hugeNichromeAirframe;
    public static Item smallCompositeAirframe;
    public static Item mediumCompositeAirframe;
    public static Item largeCompositeAirframe;
    public static Item hugeCompositeAirframe;
    
    public static Item smallAluminiumFuselage;
    public static Item mediumAluminiumFuselage;
    public static Item largeAluminiumFuselage;
    public static Item hugeAluminiumFuselage;
    public static Item smallTitaniumFuselage;
    public static Item mediumTitaniumFuselage;
    public static Item largeTitaniumFuselage;
    public static Item hugeTitaniumFuselage;
    public static Item smallNichromeFuselage;
    public static Item mediumNichromeFuselage;
    public static Item largeNichromeFuselage;
    public static Item hugeNichromeFuselage;
    public static Item smallCompositeFuselage;
    public static Item mediumCompositeFuselage;
    public static Item largeCompositeFuselage;
    public static Item hugeCompositeFuselage;
    
    public static Item smallAluminiumCockpit;
    public static Item mediumAluminiumCockpit;
    public static Item largeAluminiumCockpit;
    public static Item hugeAluminiumCockpit;
    public static Item smallTitaniumCockpit;
    public static Item mediumTitaniumCockpit;
    public static Item largeTitaniumCockpit;
    public static Item hugeTitaniumCockpit;
    public static Item smallNichromeCockpit;
    public static Item mediumNichromeCockpit;
    public static Item largeNichromeCockpit;
    public static Item hugeNichromeCockpit;
    public static Item smallCompositeCockpit;
    public static Item mediumCompositeCockpit;
    public static Item largeCompositeCockpit;
    public static Item hugeCompositeCockpit;
    
    public static Item smallAluminiumSupportBeam;
    public static Item mediumAluminiumSupportBeam;
    public static Item largeAluminiumSupportBeam;
    public static Item hugeAluminiumSupportBeam;
    public static Item smallTitaniumSupportBeam;
    public static Item mediumTitaniumSupportBeam;
    public static Item largeTitaniumSupportBeam;
    public static Item hugeTitaniumSupportBeam;
    public static Item smallNichromeSupportBeam;
    public static Item mediumNichromeSupportBeam;
    public static Item largeNichromeSupportBeam;
    public static Item hugeNichromeSupportBeam;
    public static Item smallCompositeSupportBeam;
    public static Item mediumCompositeSupportBeam;
    public static Item largeCompositeSupportBeam;
    public static Item hugeCompositeSupportBeam;
    
    public static Item ironSeatFrame;
    public static Item steelSeat1;
    public static Item steelSeat2;
    public static Item steelSeat3;
    public static Item steelSeat4;
    public static Item steelSeat5;
    public static Item leatherSeat1;
    public static Item leatherSeat2;
    public static Item leatherSeat3;
    public static Item leatherSeat4;
    public static Item leatherSeat5;
    public static Item paddedSeat1;
    public static Item paddedSeat2;
    public static Item paddedSeat3;
    public static Item paddedSeat4;
    public static Item paddedSeat5;
    public static Item airlinerSeat1;
    public static Item airlinerSeat2;
    public static Item airlinerSeat3;
    public static Item airlinerSeat4;
    public static Item airlinerSeat5;
    public static Item airlinerSeat10;
    public static Item airlinerSeat50;
    public static Item foldingTray;
    
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
    
    //Materials
    public static Item compositeMaterialSet;
    public static Item compositeMaterialMixture;
    public static Item compositeMaterialIngot;
    public static Item compositeMaterialPlate;
    public static Item compositeMaterialFuselagePlate;
    
    //Electronics
    public static Item nightVisionSystem;
    public static Item stealthSystem;
    
    //Smaller parts
    public static Item lowTorqueEngine;
    public static Item mediumTorqueEngine;
    public static Item highTorqueEngine;
    public static Item reinforcedPiston;
    public static Item titaniumReinforcedPiston;
    public static Item propellorBlade;
    public static Item twoBladePropellor;
    public static Item threeBladePropellor;
    public static Item fourBladePropellor;
    public static Item fiveBladePropellor;
    public static Item smallWheel;
    public static Item mediumWheel;
    public static Item largeWheel;
    public static Item smallDoubleWheel;
    public static Item mediumDoubleWheel;
    public static Item largeDoubleWheel;
    public static Item smallFloat;
    public static Item mediumFloat;
    public static Item largeFloat;
    public static Item lowTorquePropEngine;
    public static Item medTorquePropEngine;
    public static Item highTorquePropEngine;
    public static Item lowTorqueJetEngine;
    public static Item medTorqueJetEngine;
    public static Item highTorqueJetEngine;
    public static Item stealthEngine;
    public static Item pressurizedCabinGlass;
    public static Item rawPressurizedCabinGlass;
    public static Item oxygenMaskSet;
    public static Item oxygenMask;
    
    //Helicopter Parts
    public static Item heliRunners;
    public static Item heliFloatRunners;
    public static Item heliRotorBlade;
    public static Item twoBladeRotor;
    public static Item threeBladeRotor;
    public static Item fourBladeRotor;
    public static Item fiveBladeRotor;
    public static Item sixBladeRotor;
    public static Item lowTorqueHeliEngine;
    public static Item medTorqueHeliEngine;
    public static Item highTorqueHeliEngine;
    
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
    
    //Civillian Helicopters
    public static Item longRangerFuselage;
    public static Item longRangerTail;
    public static Item fl282Fuselage;
    public static Item fl282Tail;
    public static Item bell47gFuselage;
    public static Item bell47gTail;
    public static Item bell47gWeaponSystem;
    public static Item robinsonFuselage;
    public static Item robinsonTail;
    public static Item s76Fuselage;
    public static Item s76Tail;
    public static Item s76FancyShit;
    
    
    //Civillian Planes
    public static Item an2sFuselage;
    public static Item an2sTail;
    public static Item an2sWing;
    public static Item t4Fuselage;
    public static Item t4Tail;
    public static Item t4Wing;
    public static Item m18Fuselage;//
    public static Item m18Tail;//
    public static Item m18Wing;//
    public static Item p180Fuselage;
    public static Item p180Cockpit;
    public static Item p180Tail;
    public static Item p180Wing;
    public static Item md90Fuselage;
    public static Item md90Cockpit;
    public static Item md90Tail;
    public static Item md90Wing;
    public static Item mc72Fuselage;
    public static Item mc72Tail;
    public static Item mc72Wing;
    public static Item mc72Floater;
    public static Item m33Fuselage;
    public static Item m33Tail;
    public static Item m33Wing;
    public static Item m33Engine;
    public static Item cessna172Fuselage;
    public static Item cessna172Tail;
    public static Item cessna172Floater;
    public static Item cessna152Fuselage;
    public static Item cessna152Tail;
    public static Item cessnaWing;
    
    //Halo items
    public static Item hornetFuselage;
    public static Item hornetEngine;
    public static Item hornetWing;
    public static Item hornetStandWing;
    //TODO Texture from here!
    public static Item hornetControlSystem;
    public static Item hornetWeaponSystem;
    public static Item ghostFuselage;
    public static Item ghostControlSystem;
    public static Item ghostEngine;
    public static Item ghostExhaust;
    public static Item ghostWeaponSystem;
    public static Item bansheeFuselage;
    public static Item bansheeControlSystem;
    public static Item bansheeWing;
    public static Item bansheeEngine;
    public static Item bansheeWeaponSystem;
    
    public static Item unscVulcan;
    public static Item unscRocketLauncher;
    public static Item covenantPlasmaCannon;
    public static Item covenantPlasmaCharger;
    public static Item covenantFuelRodCannon;
    public static Item covenantFuelRod;
    
    
    //Weapon Parts
    
    //Ammunition Parts
    public static Item smallBullet;
    public static Item mediumBullet;
    public static Item largeBullet;
    public static Item cannonBullet;
    public static Item blackPowder;
    public static Item cartridgePrimer;
    public static Item grenadePrimer;
    public static Item bombPrimer;
    public static Item missilePrimer;
    public static Item missilePlating;
    public static Item smallMissileHousing;
    public static Item mediumMissileHousing;
    public static Item largeMissileHousing;
    public static Item missileExplosiveSmall;
    public static Item missileExplosiveMedium;
    public static Item missileExplosiveLarge;
    public static Item missileFin;
    public static Item missileLaserGuidance;
    public static Item missileCamera;
    public static Item missilePropellant;
    public static Item missileFuelCell;
    public static Item shotgunPrimer;
    
    public static Item case5_56mm;
    public static Item case7_62mm;
    public static Item case7_7mm;
    public static Item case7_92mm;
    public static Item case9mm;
    public static Item case10_9mm;
    public static Item case11_43mm;
    public static Item case12_7mm;
    public static Item case12gauge;
    
    public static Item case5_56mm_Filled;
    public static Item case7_62mm_Filled;
    public static Item case7_7mm_Filled;
    public static Item case7_92mm_Filled;
    public static Item case9mm_Filled;
    public static Item case10_9mm_Filled;
    public static Item case11_43mm_Filled;
    public static Item case12_7mm_Filled;
    public static Item case12gauge_Filled;
    
    public static Item case5_56mm_Cast;
    public static Item case7_62mm_Cast;
    public static Item case7_7mm_Cast;
    public static Item case7_92mm_Cast;
    public static Item case9mm_Cast;
    public static Item case10_9mm_Cast;
    public static Item case11_43mm_Cast;
    public static Item case12_7mm_Cast;
    public static Item case12gauge_Cast;
    
    public static Item ammo5_56mm;
    public static Item ammo5_56mm_5x;
    public static Item ammo5_56mm_30x;
    public static Item ammo5_56mm_100x;
    public static Item ammo7_62mm;
    public static Item ammo7_62mm_he;
    public static Item ammo7_62mm_tracer;
    public static Item ammo7_62mm_5x;
    public static Item ammo7_62mm_25x;
    public static Item ammo7_7mm;
    public static Item ammo7_7mm_5x;
    public static Item ammo7_7mm_25x;
    public static Item ammo7_92mm;
    public static Item ammo7_92_5x;
    public static Item ammo7_92_25x;
    public static Item ammo9mm;
    public static Item ammo9mm_poison;
    public static Item ammo10_9mm;
    public static Item ammo11_43mm;
    public static Item ammo12_7mm;
    public static Item ammo12_7mm_he;
    public static Item ammo12_7mm_tracer;
    public static Item ammo12_7mm_explosive;
    public static Item ammo12_7mm_5x;
    public static Item ammo12_7mm_25x;
    public static Item ammo12gauge;
    public static Item ammo12gauge_incendiary;
    
    public static Item emptyMagACR;
    public static Item emptyMagAK74;
    public static Item emptyMagAUG;
    public static Item emptyMagBarrett;
    public static Item emptyMagBizon;
    public static Item emptyMagDesertEagle;
    public static Item emptyMagDragonuv;
    public static Item emptyMagScar;
    public static Item emptyMagG3;
    public static Item emptyMagG36;
    public static Item emptyMagGlock;
    public static Item emptyMagGlockHi;
    public static Item emptyMagL86;
    public static Item emptyMagL96;
    public static Item emptyMagM4;
    public static Item emptyMagM9;
    public static Item emptyMagM14;
    public static Item emptyMagM21;
    public static Item emptyMagM249;
    public static Item emptyMagM1911;
    public static Item emptyMagMakarov;
    public static Item emptyMagMP5;
    public static Item emptyMagMTAR;
    public static Item emptyMagP90;
    public static Item emptyMagRPD;
    public static Item emptyMagSG550;
    public static Item emptyMagSIG_P226;
    public static Item emptyMagSkorpion;
    public static Item emptyMagUSP;
    public static Item emptyMagUzi;
    
    public static Item barrelSection;
    public static Item flashHider;
    public static Item trigger;
    public static Item pistolStyleGrip;
    public static Item fixedStock;
    public static Item slidingStock;
    public static Item skeletonStock;
    
    public static Item assaultRifleBarrel;
    public static Item assaultRifleBolt;
    public static Item assaultRifleMagwell;
    public static Item assaultRifleFiringPin;
    public static Item assaultRifleFireSelectorSSF;
    public static Item assaultRifleFireSelectorSSB;
    public static Item assaultRifleFireSelectorSF;
    public static Item assaultRifleRISRail;
    
    public static Item assaultRifleACRReciever;
    public static Item assaultRifleAUGReciever;
    public static Item assaultRifleScarReciever;
    public static Item assaultRifleG36Reciever;
    public static Item assaultRifleL86Reciever;
    public static Item assaultRifleM16Reciever;
    public static Item assaultRifleSG550Reciever;
    public static Item assaultRifleMTARReciever;
    public static Item assaultRifleG3Reciever;
    
    public static Item sniperRifleBarrel;
    public static Item sniperRifleBolt;
    public static Item sniperRifleMagwell;
    public static Item sniperRifleFiringPin;
    public static Item sniperRifle1xScope;
    public static Item sniperRifleBoltHandle;
    
    public static Item sniperRifleDragonuvReciever;
    public static Item sniperRifleL96Reciever;
    public static Item sniperRifleR700Reciever;
    public static Item sniperRifleM14Reciever;
    public static Item sniperRifleM21Reciever;
    public static Item sniperRifleM40A3Reciever;
    public static Item sniperRifleBarrettReciever;
    public static Item sniperRifleBarrettFlashHider;
    
    public static Item lmgBarrel;
    public static Item lmgBolt;
    public static Item lmgFeedSlot;
    public static Item lmgMagwell;
    public static Item lmgFiringPin;
    public static Item lmgBarrelJacket;
    
    public static Item lmgM60Reciever;
    public static Item lmgM249Reciever;
    public static Item lmgRPDReciever;
    public static Item lmgMinigunReciever;
    public static Item lmgMinigunBarrelSet;
    
    public static Item smgBarrel;
    public static Item smgMagwell;
    
    public static Item smgAK74Reciever;
    public static Item smgP90Reciever;
    public static Item smgBizonReciever;
    public static Item smgMP5Reciever;
    public static Item smgUziReciever;
    public static Item smgSkorpionReciever;
    public static Item smgP90Magwell;
    
    public static Item pistolBarrel;
    public static Item pistolGrip;
    public static Item pistolHammer;
    public static Item pistolSlide;
    
    public static Item pistolGlockFrame;
    public static Item pistolM9Frame;
    public static Item pistolMakarovFrame;
    public static Item pistolP226Frame;
    public static Item pistolUSPFrame;
    public static Item pistolM1911Frame;
    public static Item pistolDesertEagleFrame;
    
    public static Item shotgunBarrel;
    public static Item shotgunShellTube;
    public static Item shotgunShellDoor;

    public static Item shotgunM1014Reciever;
    public static Item shotgunR870Reciever;
    public static Item shotgunSPASReciever;
    public static Item shotgunW1200Reciever;
    
    
    
    
    //----------------
    // VEHICLES
    //----------------
    
    //ammo parts
    public static Item case20mm;
    public static Item case23mm;
    public static Item case25mm;
    public static Item case30mm;
    public static Item case37mm;
    public static Item case40mm;
    public static Item case47mm;
    public static Item case76mm;
    public static Item case105mm;
    public static Item case125mm;
    public static Item case12_7cm;
    public static Item case15_5cm;
    public static Item case35_6cm;
    public static Item case46cm;
    public static Item case120mm;
    public static Item case50mm;
    public static Item case152mm;
    public static Item case5_25in;
    
    public static Item case20mm_Filled;
    public static Item case23mm_Filled;
    public static Item case25mm_Filled;
    public static Item case30mm_Filled;
    public static Item case37mm_Filled;
    public static Item case40mm_Filled;
    public static Item case47mm_Filled;
    public static Item case76mm_Filled;
    public static Item case105mm_Filled;
    public static Item case125mm_Filled;
    public static Item case12_7cm_Filled;
    public static Item case15_5cm_Filled;
    public static Item case35_6cm_Filled;
    public static Item case46cm_Filled;
    public static Item case120mm_Filled;
    public static Item case50mm_Filled;
    public static Item case152mm_Filled;
    public static Item case5_25in_Filled;
    
    public static Item case20mm_Cast;
    public static Item case23mm_Cast;
    public static Item case25mm_Cast;
    public static Item case30mm_Cast;
    public static Item case37mm_Cast;
    public static Item case40mm_Cast;
    public static Item case47mm_Cast;
    public static Item case76mm_Cast;
    public static Item case105mm_Cast;
    public static Item case125mm_Cast;
    public static Item case12_7cm_Cast;
    public static Item case15_5cm_Cast;
    public static Item case35_6cm_Cast;
    public static Item case46cm_Cast;
    public static Item case120mm_Cast;
    public static Item case50mm_Cast;
    public static Item case152mm_Cast;
    public static Item case5_25in_Cast;
    
    public static Item ammo20mm;
    public static Item ammo20mm_5x;
    public static Item ammo20mm_25x;
    public static Item ammo23mm;
    public static Item ammo23mm_5x;
    public static Item ammo23mm_25x;
    public static Item ammo25mm;
    public static Item ammo25mm_5x;
    public static Item ammo25mm_25x;
    public static Item ammo30mm;
    public static Item ammo30mm_5x;
    public static Item ammo30mm_25x;
    public static Item ammo37mm;
    public static Item ammo37mm_5x;
    public static Item ammo37mm_25x;
    public static Item ammo40mm;
    public static Item ammo40mm_5x;
    public static Item ammo40mm_25x;
    public static Item ammo40mm_Grenade;
    public static Item ammo40mm_Grenade_5x;
    public static Item ammo40mm_Grenade_25x;
    public static Item ammo47mm;
    public static Item ammo47mm_5x;
    public static Item ammo47mm_25x;
    public static Item ammo76mm;
    public static Item ammo76mm_5x;
    public static Item ammo76mm_25x;
    public static Item ammo105mm; //APFSDS
    public static Item ammo105mm_5x; 
    public static Item ammo125mm; //APFSDS
    public static Item ammo125mm_he;
    public static Item ammoMk19Grenade;
    public static Item ammo12_7cm;
    public static Item ammo12_7cm_5x;
    public static Item ammo15_5cm;
    public static Item ammo15_5cm_5x;
    public static Item ammo35_6cm;
    public static Item ammo46cm;
    public static Item ammo120mmOrdnance;
    public static Item ammo50mmOrdnance;
    public static Item ammo152mmOrdnance;
    public static Item ammo5_25in;
    public static Item ammo5_25in_5x;
    public static Item ammo5_25in_25x;
    
    public static Item radioA_10_CAS;
    
    public static Item missile9M114;
    public static Item missile9M114_TV;
    public static Item missile40mm;
    public static Item missile57mm;
    public static Item missile66mm;
    public static Item missile68mm;
    public static Item missile70mm;
    public static Item missile70mm_TV;
    public static Item missile80mm;
    public static Item missile80mm_thermobaric;
    public static Item missile80mm_marker;
    public static Item missile84mm;
    public static Item missile149mm;
    public static Item missile200mm;
    public static Item missileAGM_65_Maverick;
    public static Item missileAGM_84_Harpoon;
    public static Item missileAGM_114_Hellfire;
    public static Item missileAGM_114_Hellfire_TV;
    public static Item missileAGM_119B_Penguin;
    public static Item missileAGM_130;
    public static Item missileAGM_154;
    public static Item missileAGM_158_JASSM;
    public static Item missileAIM_7_Sparrow;
    public static Item missileAIM_9_Sidewinder;
    public static Item missileAIM_9x_Sidewinder;
    public static Item missileAIM_92_Stinger;
    public static Item missileAIM_120_AMRAAM;
    public static Item missileMIM_23_HAWK;
    public static Item missileIRIS_T;
    public static Item missileSA_2;
    public static Item missileGeneric;
    public static Item missileGenericTV;
    public static Item missileGenericLaser;
    
    public static Item bomb50kg;
    public static Item bomb250kg;
    public static Item bomb250lb;
    public static Item bomb500lb;
    public static Item bomb540lb;
    public static Item bomb1800kg;
    public static Item bombAN_M17;
    public static Item bombBanshee;
    public static Item bombCluster;
    public static Item bombJDAM;
    public static Item bomb936kgTorpedo;
    public static Item bombMk46Torpedo;
    public static Item bombType91Torpedo;
    public static Item bombType93Torpedo;
    public static Item bombType97;
    public static Item bombMk62Mine;
    public static Item bombPlastic;
    
    //Weapons
    public static Item weaponSmallCannon; //20-50mm ammos
    public static Item weaponMediumCannon; //51-100mm ammos
    public static Item weaponLargeCannon; //101mm-200mm ammos
    public static Item weaponMissileLauncher;
    public static Item weaponLaserMissileLauncher;
    public static Item weaponTVMissileLauncher;
    
    public static Item weaponAGM_Launcher;
    public static Item weaponAIM_Launcher;
    
    //Weapons (Guns)
    public static Item weaponGSh_23_2;
    public static Item weaponYakB_12_7;
    public static Item weaponGShG_7_62;
    public static Item weaponM3M;
    public static Item weaponM60;
    public static Item weaponM61A1_Vulcan;
    public static Item weaponM134;
    public static Item weaponM134D;
    public static Item weaponM197;
    public static Item weaponM230;
    public static Item weaponM240;
    public static Item weapon12_7_Machine_Gun;

    
    
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
        
        smallNichromeAirframe = new MCHPItems(4).setUnlocalizedName("smallNichromeAirframe");
        mediumNichromeAirframe = new MCHPItems(4).setUnlocalizedName("mediumNichromeAirframe");
        largeNichromeAirframe = new MCHPItems(4).setUnlocalizedName("largeNichromeAirframe");
        hugeNichromeAirframe = new MCHPItems(4).setUnlocalizedName("hugeNichromeAirframe");
        smallAluminiumAirframe = new MCHPItems(4).setUnlocalizedName("smallAluminiumAirframe");
        mediumAluminiumAirframe = new MCHPItems(4).setUnlocalizedName("mediumAluminiumAirframe");
        largeAluminiumAirframe = new MCHPItems(4).setUnlocalizedName("largeAluminiumAirframe");
        hugeAluminiumAirframe = new MCHPItems(4).setUnlocalizedName("hugeAluminiumAirframe");
        smallCompositeAirframe = new MCHPItems(4).setUnlocalizedName("smallCompositeAirframe");
        mediumCompositeAirframe = new MCHPItems(4).setUnlocalizedName("mediumCompositeAirframe");
        largeCompositeAirframe = new MCHPItems(4).setUnlocalizedName("largeCompositeAirframe");
        hugeCompositeAirframe = new MCHPItems(4).setUnlocalizedName("hugeCompositeAirframe");
        smallTitaniumAirframe = new MCHPItems(4).setUnlocalizedName("smallTitaniumAirframe");
        mediumTitaniumAirframe = new MCHPItems(4).setUnlocalizedName("mediumTitaniumAirframe");
        largeTitaniumAirframe = new MCHPItems(4).setUnlocalizedName("largeTitaniumAirframe");
        hugeTitaniumAirframe = new MCHPItems(4).setUnlocalizedName("hugeTitaniumAirframe");
        
        smallNichromeFuselage = new MCHPItems(1).setUnlocalizedName("smallNichromeFuselage");
        mediumNichromeFuselage = new MCHPItems(1).setUnlocalizedName("mediumNichromeFuselage");
        largeNichromeFuselage = new MCHPItems(1).setUnlocalizedName("largeNichromeFuselage");
        hugeNichromeFuselage = new MCHPItems(1).setUnlocalizedName("hugeNichromeFuselage");
        smallAluminiumFuselage = new MCHPItems(1).setUnlocalizedName("smallAluminiumFuselage");
        mediumAluminiumFuselage = new MCHPItems(1).setUnlocalizedName("mediumAluminiumFuselage");
        largeAluminiumFuselage = new MCHPItems(1).setUnlocalizedName("largeAluminiumFuselage");
        hugeAluminiumFuselage = new MCHPItems(1).setUnlocalizedName("hugeAluminiumFuselage");
        smallCompositeFuselage = new MCHPItems(1).setUnlocalizedName("smallCompositeFuselage");
        mediumCompositeFuselage = new MCHPItems(1).setUnlocalizedName("mediumCompositeFuselage");
        largeCompositeFuselage = new MCHPItems(1).setUnlocalizedName("largeCompositeFuselage");
        hugeCompositeFuselage = new MCHPItems(1).setUnlocalizedName("hugeCompositeFuselage");
        smallTitaniumFuselage = new MCHPItems(1).setUnlocalizedName("smallTitaniumFuselage");
        mediumTitaniumFuselage = new MCHPItems(1).setUnlocalizedName("mediumTitaniumFuselage");
        largeTitaniumFuselage = new MCHPItems(1).setUnlocalizedName("largeTitaniumFuselage");
        hugeTitaniumFuselage = new MCHPItems(1).setUnlocalizedName("hugeTitaniumFuselage");
        
        smallNichromeCockpit = new MCHPItems(1).setUnlocalizedName("smallNichromeCockpit");
        mediumNichromeCockpit = new MCHPItems(1).setUnlocalizedName("mediumNichromeCockpit");
        largeNichromeCockpit = new MCHPItems(1).setUnlocalizedName("largeNichromeCockpit");
        hugeNichromeCockpit = new MCHPItems(1).setUnlocalizedName("hugeNichromeCockpit");
        smallAluminiumCockpit = new MCHPItems(1).setUnlocalizedName("smallAluminiumCockpit");
        mediumAluminiumCockpit = new MCHPItems(1).setUnlocalizedName("mediumAluminiumCockpit");
        largeAluminiumCockpit = new MCHPItems(1).setUnlocalizedName("largeAluminiumCockpit");
        hugeAluminiumCockpit = new MCHPItems(1).setUnlocalizedName("hugeAluminiumCockpit");
        smallCompositeCockpit = new MCHPItems(1).setUnlocalizedName("smallCompositeCockpit");
        mediumCompositeCockpit = new MCHPItems(1).setUnlocalizedName("mediumCompositeCockpit");
        largeCompositeCockpit = new MCHPItems(1).setUnlocalizedName("largeCompositeCockpit");
        hugeCompositeCockpit = new MCHPItems(1).setUnlocalizedName("hugeCompositeCockpit");
        smallTitaniumCockpit = new MCHPItems(1).setUnlocalizedName("smallTitaniumCockpit");
        mediumTitaniumCockpit = new MCHPItems(1).setUnlocalizedName("mediumTitaniumCockpit");
        largeTitaniumCockpit = new MCHPItems(1).setUnlocalizedName("largeTitaniumCockpit");
        hugeTitaniumCockpit = new MCHPItems(1).setUnlocalizedName("hugeTitaniumCockpit");
        
        smallAluminiumSupportBeam = new MCHPItems(16).setUnlocalizedName("smallAluminiumSupportBeam");
        mediumAluminiumSupportBeam = new MCHPItems(16).setUnlocalizedName("mediumAluminiumSupportBeam");
        largeAluminiumSupportBeam = new MCHPItems(16).setUnlocalizedName("largeAluminiumSupportBeam");
        hugeAluminiumSupportBeam = new MCHPItems(16).setUnlocalizedName("hugeAluminiumSupportBeam");
        smallTitaniumSupportBeam = new MCHPItems(16).setUnlocalizedName("smallTitaniumSupportBeam");
        mediumTitaniumSupportBeam = new MCHPItems(16).setUnlocalizedName("mediumTitaniumSupportBeam");
        largeTitaniumSupportBeam = new MCHPItems(16).setUnlocalizedName("largeTitaniumSupportBeam");
        hugeTitaniumSupportBeam = new MCHPItems(16).setUnlocalizedName("hugeTitaniumSupportBeam");
        smallNichromeSupportBeam = new MCHPItems(16).setUnlocalizedName("smallNichromeSupportBeam");
        mediumNichromeSupportBeam = new MCHPItems(16).setUnlocalizedName("mediumNichromeSupportBeam");
        largeNichromeSupportBeam = new MCHPItems(16).setUnlocalizedName("largeNichromeSupportBeam");
        hugeNichromeSupportBeam = new MCHPItems(16).setUnlocalizedName("hugeNichromeSupportBeam");
        smallCompositeSupportBeam = new MCHPItems(16).setUnlocalizedName("smallCompositeSupportBeam");
        mediumCompositeSupportBeam = new MCHPItems(16).setUnlocalizedName("mediumCompositeSupportBeam");
        largeCompositeSupportBeam = new MCHPItems(16).setUnlocalizedName("largeCompositeSupportBeam");
        hugeCompositeSupportBeam = new MCHPItems(16).setUnlocalizedName("hugeCompositeSupportBeam");
        
        ironSeatFrame = new MCHPItems(64).setUnlocalizedName("ironSeatFrame");
        steelSeat1 = new MCHPLoreItem("1x Config", 1, "steelSeat1").setUnlocalizedName("steelSeat1");
        steelSeat2 = new MCHPLoreItem("2x Config", 2, "steelSeat2").setUnlocalizedName("steelSeat2");
        steelSeat3 = new MCHPLoreItem("3x Config", 3, "steelSeat3").setUnlocalizedName("steelSeat3");
        steelSeat4 = new MCHPLoreItem("4x Config", 4, "steelSeat4").setUnlocalizedName("steelSeat4");
        steelSeat5 = new MCHPLoreItem("5x Config", 5, "steelSeat5").setUnlocalizedName("steelSeat5");
        leatherSeat1 = new MCHPLoreItem("1x Config", 1, "leatherSeat1").setUnlocalizedName("leatherSeat1");
        leatherSeat2 = new MCHPLoreItem("2x Config", 2, "leatherSeat2").setUnlocalizedName("leatherSeat2");
        leatherSeat3 = new MCHPLoreItem("3x Config", 3, "leatherSeat3").setUnlocalizedName("leatherSeat3");
        leatherSeat4 = new MCHPLoreItem("4x Config", 4, "leatherSeat4").setUnlocalizedName("leatherSeat4");
        leatherSeat5 = new MCHPLoreItem("5x Config", 5, "leatherSeat5").setUnlocalizedName("leatherSeat5");
        paddedSeat1 = new MCHPLoreItem("1x Config", 1, "paddedSeat1").setUnlocalizedName("paddedSeat1");
        paddedSeat2 = new MCHPLoreItem("2x Config", 2, "paddedSeat2").setUnlocalizedName("paddedSeat2");
        paddedSeat3 = new MCHPLoreItem("3x Config", 3, "paddedSeat3").setUnlocalizedName("paddedSeat3");
        paddedSeat4 = new MCHPLoreItem("4x Config", 4, "paddedSeat4").setUnlocalizedName("paddedSeat4");
        paddedSeat5 = new MCHPLoreItem("5x Config", 5, "paddedSeat5").setUnlocalizedName("paddedSeat5");
        airlinerSeat1 = new MCHPLoreItem("1x Config", 1, "airlinerSeat1").setUnlocalizedName("airlinerSeat1");
        airlinerSeat2 = new MCHPLoreItem("2x Config", 2, "airlinerSeat2").setUnlocalizedName("airlinerSeat2");
        airlinerSeat3 = new MCHPLoreItem("3x Config", 3, "airlinerSeat3").setUnlocalizedName("airlinerSeat3");
        airlinerSeat4 = new MCHPLoreItem("4x Config", 4, "airlinerSeat4").setUnlocalizedName("airlinerSeat4");
        airlinerSeat5 = new MCHPLoreItem("5x Config", 5, "airlinerSeat5").setUnlocalizedName("airlinerSeat5");
        airlinerSeat10 = new MCHPLoreItem("10x Config", 10, "airlinerSeat10").setUnlocalizedName("airlinerSeat10");
        airlinerSeat50 = new MCHPLoreItem("50x Config", 50, "airlinerSeat50").setUnlocalizedName("airlinerSeat50");
        foldingTray = new MCHPItems(64).setUnlocalizedName("foldingTray");
        
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
        propellorBlade = new MCHPItems(64).setUnlocalizedName("propellorBlade");
        twoBladePropellor = new MCHPItems(64).setUnlocalizedName("twoBladePropellor");
        threeBladePropellor = new MCHPItems(64).setUnlocalizedName("threeBladePropellor");
        fourBladePropellor = new MCHPItems(64).setUnlocalizedName("fourBladePropellor");
        fiveBladePropellor = new MCHPItems(64).setUnlocalizedName("fiveBladePropellor");
        smallWheel = new MCHPItems(64).setUnlocalizedName("smallWheel");
        mediumWheel = new MCHPItems(64).setUnlocalizedName("mediumWheel");
        largeWheel = new MCHPItems(64).setUnlocalizedName("largeWheel");
        smallDoubleWheel = new MCHPItems(64).setUnlocalizedName("smallDoubleWheel");
        mediumDoubleWheel = new MCHPItems(64).setUnlocalizedName("mediumDoubleWheel");
        largeDoubleWheel = new MCHPItems(64).setUnlocalizedName("largeDoubleWheel");
        smallFloat = new MCHPItems(64).setUnlocalizedName("smallFloat");
        mediumFloat = new MCHPItems(64).setUnlocalizedName("mediumFloat");
        largeFloat = new MCHPItems(64).setUnlocalizedName("largeFloat");
        lowTorquePropEngine = new MCHPItems(64).setUnlocalizedName("lowTorquePropEngine");
        medTorquePropEngine = new MCHPItems(64).setUnlocalizedName("medTorquePropEngine");
        highTorquePropEngine = new MCHPItems(64).setUnlocalizedName("highTorquePropEngine");
        lowTorqueJetEngine = new MCHPItems(64).setUnlocalizedName("lowTorqueJetEngine");
        medTorqueJetEngine = new MCHPItems(64).setUnlocalizedName("medTorqueJetEngine");
        highTorqueJetEngine = new MCHPItems(64).setUnlocalizedName("highTorqueJetEngine");
        stealthEngine = new MCHPItems(64).setUnlocalizedName("stealthEngine");
        pressurizedCabinGlass = new MCHPItems(64).setUnlocalizedName("pressurizedCabinGlass");
        rawPressurizedCabinGlass = new MCHPItems(64).setUnlocalizedName("rawPressurizedCabinGlass");
        oxygenMaskSet = new MCHPItems(64).setUnlocalizedName("oxygenMaskSet");
        oxygenMask = new MCHPItems(64).setUnlocalizedName("oxygenMask");
        
        compositeMaterialSet = new MCHPItems(64).setUnlocalizedName("compositeMaterialSet");
        compositeMaterialMixture = new MCHPItems(64).setUnlocalizedName("compositeMaterialMixture");
        compositeMaterialIngot = new MCHPItems(64).setUnlocalizedName("compositeMaterialIngot");
        compositeMaterialPlate = new MCHPItems(64).setUnlocalizedName("compositeMaterialPlate");
        compositeMaterialFuselagePlate = new MCHPItems(64).setUnlocalizedName("compositeMaterialFuselagePlate");
        
        //Electronics
        nightVisionSystem = new MCHPItems(64).setUnlocalizedName("nightVisionSystem");
        stealthSystem = new MCHPItems(64).setUnlocalizedName("stealthSystem");
        
        //Heli parts
        heliRunners = new MCHPItems(64).setUnlocalizedName("heliRunners");
        heliFloatRunners = new MCHPItems(64).setUnlocalizedName("heliFloatRunners");
        heliRotorBlade = new MCHPItems(64).setUnlocalizedName("heliRotorBlade");
        twoBladeRotor = new MCHPItems(64).setUnlocalizedName("twoBladeRotor");
        threeBladeRotor = new MCHPItems(64).setUnlocalizedName("threeBladeRotor");
        fourBladeRotor = new MCHPItems(64).setUnlocalizedName("fourBladeRotor");
        fiveBladeRotor = new MCHPItems(64).setUnlocalizedName("fiveBladeRotor");
        sixBladeRotor = new MCHPItems(64).setUnlocalizedName("sixBladeRotor");
        lowTorqueHeliEngine = new MCHPItems(64).setUnlocalizedName("lowTorqueHeliEngine");
        medTorqueHeliEngine = new MCHPItems(64).setUnlocalizedName("medTorqueHeliEngine");
        highTorqueHeliEngine = new MCHPItems(64).setUnlocalizedName("highTorqueHeliEngine");
        
        //Specifics
        
        //Osprey
        ospreyWing = new MCHPItems(8).setUnlocalizedName("ospreyWing");
        ospreyEngine = new MCHPItems(8).setUnlocalizedName("ospreyEngine");
        ospreyEngineCasing = new MCHPItems(16).setUnlocalizedName("ospreyEngineCasing");
        ospreyCockpit = new MCHPItems(4).setUnlocalizedName("ospreyCockpit");
        ospreyControlBay = new MCHPItems(16).setUnlocalizedName("ospreyControlBay");
        ospreyTailPiece = new MCHPItems(8).setUnlocalizedName("ospreyTailPiece");
        v22Fuselage = new MCHPItems(4).setUnlocalizedName("v22Fuselage");
        mv22Fuselage = new MCHPItems(4).setUnlocalizedName("mv22Fuselage");
        v22WeaponsSystem = new MCHPItems(16).setUnlocalizedName("v22WeaponsSystem");
        
        //Civillian Helicopters
        longRangerFuselage = new MCHPItems(4).setUnlocalizedName("longRangerFuselage");
        longRangerTail = new MCHPItems(8).setUnlocalizedName("longRangerTail");
        fl282Fuselage = new MCHPItems(4).setUnlocalizedName("fl282Fuselage");
        fl282Tail = new MCHPItems(8).setUnlocalizedName("fl282Tail");
        bell47gFuselage = new MCHPItems(4).setUnlocalizedName("bell47gFuselage");
        bell47gTail = new MCHPItems(8).setUnlocalizedName("bell47GTail");
        bell47gWeaponSystem = new MCHPItems(16).setUnlocalizedName("bell47GWeaponSystem");
        robinsonFuselage = new MCHPItems(4).setUnlocalizedName("robinsonFuselage");
        robinsonTail = new MCHPItems(8).setUnlocalizedName("robinsonTail");
        s76Fuselage = new MCHPItems(4).setUnlocalizedName("s76Fuselage");
        s76Tail = new MCHPItems(8).setUnlocalizedName("s76Tail");
        s76FancyShit = new MCHPItems(8).setUnlocalizedName("s76FancyShit");
        
        
        //Civillian Planes
        an2sFuselage = new MCHPItems(4).setUnlocalizedName("an2sFuselage");
        an2sTail = new MCHPItems(8).setUnlocalizedName("an2sTail");
        an2sWing = new MCHPItems(16).setUnlocalizedName("an2sWing");
        t4Fuselage = new MCHPItems(4).setUnlocalizedName("t4Fuselage");
        t4Tail = new MCHPItems(8).setUnlocalizedName("t4Tail");
        t4Wing = new MCHPItems(16).setUnlocalizedName("t4Wing");
        m18Fuselage = new MCHPItems(4).setUnlocalizedName("m18Fuselage");
        m18Tail = new MCHPItems(8).setUnlocalizedName("m18Tail");
        m18Wing = new MCHPItems(16).setUnlocalizedName("m18Wing");
        p180Fuselage = new MCHPItems(4).setUnlocalizedName("p180Fuselage");
        p180Cockpit = new MCHPItems(4).setUnlocalizedName("p180Cockpit");
        p180Tail = new MCHPItems(8).setUnlocalizedName("p180Tail");
        p180Wing = new MCHPItems(16).setUnlocalizedName("p180Wing");
        md90Fuselage = new MCHPItems(4).setUnlocalizedName("md90Fuselage");
        md90Cockpit = new MCHPItems(4).setUnlocalizedName("md90Cockpit");
        md90Tail = new MCHPItems(8).setUnlocalizedName("md90Tail");
        md90Wing = new MCHPItems(16).setUnlocalizedName("md90Wing");
        mc72Fuselage = new MCHPItems(4).setUnlocalizedName("mc72Fuselage");
        mc72Tail = new MCHPItems(8).setUnlocalizedName("mc72Tail");
        mc72Wing = new MCHPItems(16).setUnlocalizedName("mc72Wing");
        mc72Floater = new MCHPItems(16).setUnlocalizedName("mc72Floater");
        m33Fuselage = new MCHPItems(4).setUnlocalizedName("m33Fuselage");
        m33Tail = new MCHPItems(8).setUnlocalizedName("m33Tail");
        m33Wing = new MCHPItems(16).setUnlocalizedName("m33Wing");
        m33Engine = new MCHPItems(16).setUnlocalizedName("m33Engine");
        cessna172Fuselage = new MCHPItems(4).setUnlocalizedName("cessna172Fuselage");
        cessna172Tail = new MCHPItems(8).setUnlocalizedName("cessna172Tail");
        cessna172Floater = new MCHPItems(16).setUnlocalizedName("cessna172Floater");
        cessna152Fuselage = new MCHPItems(4).setUnlocalizedName("cessna152Fuselage");
        cessna152Tail = new MCHPItems(8).setUnlocalizedName("cessna152Tail");
        cessnaWing = new MCHPItems(16).setUnlocalizedName("cessnaWing");
        
        //Halo items
        hornetFuselage = new MCHPItems(4).setUnlocalizedName("hornetFuselage");
        hornetEngine = new MCHPItems(8).setUnlocalizedName("hornetEngine");
        hornetWing = new MCHPItems(16).setUnlocalizedName("hornetWing");
        hornetStandWing = new MCHPItems(16).setUnlocalizedName("hornetStandWing");
        hornetControlSystem = new MCHPItems(16).setUnlocalizedName("hornetControlSystem"); //
        hornetWeaponSystem = new MCHPItems(16).setUnlocalizedName("hornetWeaponSystem"); //
        ghostFuselage = new MCHPItems(4).setUnlocalizedName("ghostFuselage");
        ghostControlSystem = new MCHPItems(16).setUnlocalizedName("ghostControlSystem"); //
        ghostEngine = new MCHPItems(8).setUnlocalizedName("ghostEngine"); //
        ghostExhaust = new MCHPItems(8).setUnlocalizedName("ghostExhaust");
        ghostWeaponSystem = new MCHPItems(16).setUnlocalizedName("ghostWeaponSystem");
        bansheeFuselage = new MCHPItems(4).setUnlocalizedName("bansheeFuselage");
        bansheeControlSystem = new MCHPItems(16).setUnlocalizedName("bansheeControlSystem"); //
        bansheeWing = new MCHPItems(16).setUnlocalizedName("bansheeWing");
        bansheeEngine = new MCHPItems(8).setUnlocalizedName("bansheeEngine");
        bansheeWeaponSystem = new MCHPItems(16).setUnlocalizedName("bansheeWeaponSystem");
        
        unscVulcan = new MCHPItems(1).setUnlocalizedName("unscVulcan"); //
        unscRocketLauncher = new MCHPItems(1).setUnlocalizedName("unscRocketLauncher"); //
        covenantPlasmaCannon = new MCHPItems(1).setUnlocalizedName("covenantPlasmaCannon"); //
        covenantPlasmaCharger = new MCHPItems(1).setUnlocalizedName("covenantPlasmaCharger"); //
        covenantFuelRodCannon = new MCHPItems(1).setUnlocalizedName("covenantFuelRodCannon"); //
        covenantFuelRod = new MCHPItems(16).setUnlocalizedName("covenantFuelRod");
        
        smallBullet = new MCHPItems(64).setUnlocalizedName("smallBullet");
        mediumBullet = new MCHPItems(64).setUnlocalizedName("mediumBullet");
        largeBullet = new MCHPItems(64).setUnlocalizedName("largeBullet");
        cannonBullet = new MCHPItems(64).setUnlocalizedName("cannonBullet");
        blackPowder = new MCHPItems(64).setUnlocalizedName("blackPowder");
        cartridgePrimer = new MCHPItems(64).setUnlocalizedName("cartridgePrimer");
        grenadePrimer = new MCHPItems(64).setUnlocalizedName("grenadePrimer");
        bombPrimer = new MCHPItems(64).setUnlocalizedName("bombPrimer");
        missilePrimer = new MCHPItems(64).setUnlocalizedName("missilePrimer");
        missilePlating = new MCHPItems(64).setUnlocalizedName("missilePlating");//
        smallMissileHousing = new MCHPItems(64).setUnlocalizedName("smallMissileHousing");//
        mediumMissileHousing = new MCHPItems(64).setUnlocalizedName("mediumMissileHousing");//
        largeMissileHousing = new MCHPItems(64).setUnlocalizedName("largeMissileHousing");//
        missileExplosiveSmall = new MCHPItems(64).setUnlocalizedName("missileExplosiveSmalll");//
        missileExplosiveMedium = new MCHPItems(64).setUnlocalizedName("missileExplosiveMedium");//
        missileExplosiveLarge = new MCHPItems(64).setUnlocalizedName("missileExplosiveLarge");//
        missileFin = new MCHPItems(64).setUnlocalizedName("missileFin");//
        missileLaserGuidance = new MCHPItems(64).setUnlocalizedName("missileLaserGuidance");//
        missileCamera = new MCHPItems(64).setUnlocalizedName("missileCamera");//
        missilePropellant = new MCHPItems(64).setUnlocalizedName("missilePropellant");//
        missileFuelCell = new MCHPItems(64).setUnlocalizedName("missileFuelCell");//
        shotgunPrimer = new MCHPItems(64).setUnlocalizedName("shotgunPrimer");//
        
        case5_56mm = new MCHPItems(64).setUnlocalizedName("case5_56mm");
        case7_62mm = new MCHPItems(64).setUnlocalizedName("case7_62mm");
        case7_7mm = new MCHPItems(64).setUnlocalizedName("case7_7mm");
        case7_92mm = new MCHPItems(64).setUnlocalizedName("case7_92mm");
        case9mm = new MCHPItems(64).setUnlocalizedName("case9mm");
        case10_9mm = new MCHPItems(64).setUnlocalizedName("case10_9mm");
        case11_43mm = new MCHPItems(64).setUnlocalizedName("case11_43mm");
        case12_7mm = new MCHPItems(64).setUnlocalizedName("case12_7mm");
        case12gauge = new MCHPItems(64).setUnlocalizedName("case12gauge"); //
        
        case5_56mm_Filled = new MCHPItems(64).setUnlocalizedName("case5_56mm_Filled");
        case7_62mm_Filled = new MCHPItems(64).setUnlocalizedName("case7_62mm_Filled");
        case7_7mm_Filled = new MCHPItems(64).setUnlocalizedName("case7_7mm_Filled");
        case7_92mm_Filled = new MCHPItems(64).setUnlocalizedName("case7_92mm_Filled");
        case9mm_Filled = new MCHPItems(64).setUnlocalizedName("case9mm_Filled");
        case10_9mm_Filled = new MCHPItems(64).setUnlocalizedName("case10_9mm_Filled");
        case11_43mm_Filled = new MCHPItems(64).setUnlocalizedName("case11_43mm_Filled");
        case12_7mm_Filled = new MCHPItems(64).setUnlocalizedName("case12_7mm_Filled");
        case12gauge_Filled = new MCHPItems(64).setUnlocalizedName("case12gauge_Filled");
        
        case5_56mm_Cast = new MCHPItems(1).setUnlocalizedName("case5_56mm_Cast");
        case7_62mm_Cast = new MCHPItems(1).setUnlocalizedName("case7_62mm_Cast");
        case7_7mm_Cast = new MCHPItems(1).setUnlocalizedName("case7_7mm_Cast");
        case7_92mm_Cast = new MCHPItems(1).setUnlocalizedName("case7_92mm_Cast");
        case9mm_Cast = new MCHPItems(1).setUnlocalizedName("case9mm_Cast");
        case10_9mm_Cast = new MCHPItems(1).setUnlocalizedName("case10_9mm_Cast");
        case11_43mm_Cast = new MCHPItems(1).setUnlocalizedName("case11_43mm_Cast");
        case12_7mm_Cast = new MCHPItems(1).setUnlocalizedName("case12_7mm_Cast");
        case12gauge_Cast = new MCHPItems(1).setUnlocalizedName("case12gauge_Cast");

        ammo5_56mm = new MCHPTextItem("5.56mm", 1, "ammo556mm").setUnlocalizedName("ammo5_56mm");
        ammo5_56mm_5x = new MCHPTextItem("5.56mm", 5, "ammo556mm").setUnlocalizedName("ammo5_56mm_5x");
        ammo5_56mm_30x = new MCHPTextItem("5.56mm", 30, "ammo556mm").setUnlocalizedName("ammo5_56mm_30x");
        ammo5_56mm_100x = new MCHPTextItem("5.56mm", 100, "ammo556mm").setUnlocalizedName("ammo5_56mm_100x");
        ammo7_62mm = new MCHPTextItem("7.62mm", 1, "ammo762mm").setUnlocalizedName("ammo7_62mm");
        ammo7_62mm_he = new MCHPTextItem("7.62mm", 1, "ammo762mm").setUnlocalizedName("ammo7_62mm_he");
        ammo7_62mm_tracer = new MCHPTextItem("7.62mm", 1, "ammo762mm").setUnlocalizedName("ammo7_62mm_tracer");
        ammo7_7mm = new MCHPTextItem("7.7mm", 1, "ammo77mm").setUnlocalizedName("ammo7_7mm");
        ammo7_92mm = new MCHPTextItem("7.92mm", 1, "ammo792mm").setUnlocalizedName("ammo7_92mm");
        ammo9mm = new MCHPTextItem("9mm", 1, "ammo9mm").setUnlocalizedName("ammo9mm");
        ammo9mm_poison = new MCHPTextItem("9mm", 1, "ammo9mm").setUnlocalizedName("ammo9mm_poison");
        ammo10_9mm = new MCHPTextItem("10.9mm", 1, "ammo109mm").setUnlocalizedName("ammo10_9mm");
        ammo11_43mm = new MCHPTextItem("11.43mm", 1, "ammo1143mm").setUnlocalizedName("ammo11_43mm");
        ammo12_7mm = new MCHPTextItem("12.7mm", 1, "ammo127mm").setUnlocalizedName("ammo12_7mm");
        ammo12_7mm_he = new MCHPTextItem("12.7mm", 1, "ammo127mm").setUnlocalizedName("ammo12_7mm_he");
        ammo12_7mm_tracer = new MCHPTextItem("12.7mm", 1, "ammo127mm").setUnlocalizedName("ammo12_7mm_tracer");
        ammo12_7mm_explosive = new MCHPTextItem("12.7mm", 1, "ammo127mm").setUnlocalizedName("ammo12_7mm_explosive");
        ammo12gauge = new MCHPItems(64).setUnlocalizedName("ammo12gauge");
        ammo12gauge_incendiary = new MCHPItems(64).setUnlocalizedName("ammo12gauge_incendiary");
        
        emptyMagACR = new MCHPItems(64).setUnlocalizedName("emptyMagACR");
        emptyMagAK74 = new MCHPItems(64).setUnlocalizedName("emptyMagAK74");
        emptyMagAUG = new MCHPItems(64).setUnlocalizedName("emptyMagAUG");
        emptyMagBarrett = new MCHPItems(64).setUnlocalizedName("emptyMagBarrett");
        emptyMagBizon = new MCHPItems(64).setUnlocalizedName("emptyMagBizon");
        emptyMagDesertEagle = new MCHPItems(64).setUnlocalizedName("emptyMagDesertEagle");
        emptyMagDragonuv = new MCHPItems(64).setUnlocalizedName("emptyMagDragonuv");
        emptyMagScar = new MCHPItems(64).setUnlocalizedName("emptyMagScar");
        emptyMagG3 = new MCHPItems(64).setUnlocalizedName("emptyMagG3");
        emptyMagG36 = new MCHPItems(64).setUnlocalizedName("emptyMagG36");
        emptyMagGlock = new MCHPItems(64).setUnlocalizedName("emptyMagGlock");
        emptyMagGlockHi = new MCHPItems(64).setUnlocalizedName("emptyMagGlockHi");
        emptyMagL86 = new MCHPItems(64).setUnlocalizedName("emptyMagL86");
        emptyMagL96 = new MCHPItems(64).setUnlocalizedName("emptyMagL96");
        emptyMagM4 = new MCHPItems(64).setUnlocalizedName("emptyMagM4");
        emptyMagM9 = new MCHPItems(64).setUnlocalizedName("emptyMagM9");
        emptyMagM14 = new MCHPItems(64).setUnlocalizedName("emptyMagM14");
        emptyMagM21 = new MCHPItems(64).setUnlocalizedName("emptyMagM21");
        emptyMagM249 = new MCHPItems(64).setUnlocalizedName("emptyMagM249");
        emptyMagM1911 = new MCHPItems(64).setUnlocalizedName("emptyMagM1911");
        emptyMagMakarov = new MCHPItems(64).setUnlocalizedName("emptyMagMakarov");
        emptyMagMP5 = new MCHPItems(64).setUnlocalizedName("emptyMagMP5");
        emptyMagMTAR = new MCHPItems(64).setUnlocalizedName("emptyMagMTAR");
        emptyMagP90 = new MCHPItems(64).setUnlocalizedName("emptyMagP90");
        emptyMagRPD = new MCHPItems(64).setUnlocalizedName("emptyMagRPD");
        emptyMagSG550 = new MCHPItems(64).setUnlocalizedName("emptyMagSG550");
        emptyMagSIG_P226 = new MCHPItems(64).setUnlocalizedName("emptyMagSIG_P226");
        emptyMagSkorpion = new MCHPItems(64).setUnlocalizedName("emptyMagSkorpion");
        emptyMagUSP = new MCHPItems(64).setUnlocalizedName("emptyMagUSP");
        emptyMagUzi = new MCHPItems(64).setUnlocalizedName("emptyMagUzi");
        
        barrelSection = new MCHPItems(64).setUnlocalizedName("barrelSection");
        flashHider = new MCHPItems(64).setUnlocalizedName("flashHider");
        trigger = new MCHPItems(64).setUnlocalizedName("trigger");
        pistolStyleGrip = new MCHPItems(64).setUnlocalizedName("pistolStyleGrip");
        fixedStock = new MCHPItems(64).setUnlocalizedName("fixedStock");
        slidingStock = new MCHPItems(64).setUnlocalizedName("slidingStock");
        skeletonStock = new MCHPItems(64).setUnlocalizedName("skeletonStock");
        
        assaultRifleBarrel = new MCHPItems(64).setUnlocalizedName("assaultRifleBarrel");
        assaultRifleBolt = new MCHPItems(64).setUnlocalizedName("assaultRifleBolt");
        assaultRifleMagwell = new MCHPItems(64).setUnlocalizedName("assaultRifleMagwell");
        assaultRifleFiringPin = new MCHPItems(64).setUnlocalizedName("assaultRifleFiringPin");
        assaultRifleFireSelectorSSF = new MCHPItems(64).setUnlocalizedName("assaultRifleFireSelectorSSF");
        assaultRifleFireSelectorSSB = new MCHPItems(64).setUnlocalizedName("assaultRifleFireSelectorSSB");
        assaultRifleFireSelectorSF = new MCHPItems(64).setUnlocalizedName("assaultRifleFireSelectorSF");
        assaultRifleRISRail = new MCHPItems(64).setUnlocalizedName("assaultRifleRISRail");
        
        assaultRifleACRReciever = new MCHPItems(64).setUnlocalizedName("assaultRifleACRReciever");
        assaultRifleAUGReciever = new MCHPItems(64).setUnlocalizedName("assaultRifleAUGReciever");
        assaultRifleScarReciever = new MCHPItems(64).setUnlocalizedName("assaultRifleScarReciever");
        assaultRifleG36Reciever = new MCHPItems(64).setUnlocalizedName("assaultRifleG36Reciever");
        assaultRifleL86Reciever = new MCHPItems(64).setUnlocalizedName("assaultRifleL86Reciever");
        assaultRifleM16Reciever = new MCHPItems(64).setUnlocalizedName("assaultRifleM16Reciever");
        assaultRifleSG550Reciever = new MCHPItems(64).setUnlocalizedName("assaultRifleSG550Reciever");
        assaultRifleMTARReciever = new MCHPItems(64).setUnlocalizedName("assaultRifleMTARReciever");
        assaultRifleG3Reciever = new MCHPItems(64).setUnlocalizedName("assaultRifleG3Reciever");
        
        sniperRifleBarrel = new MCHPItems(64).setUnlocalizedName("sniperRifleBarrel");
        sniperRifleBolt = new MCHPItems(64).setUnlocalizedName("sniperRifleBolt");
        sniperRifleMagwell = new MCHPItems(64).setUnlocalizedName("sniperRifleMagwell");
        sniperRifleFiringPin = new MCHPItems(64).setUnlocalizedName("sniperRifleFiringPin");
        sniperRifle1xScope = new MCHPItems(64).setUnlocalizedName("sniperRifle1xScope");
        sniperRifleBoltHandle = new MCHPItems(64).setUnlocalizedName("sniperRifleBoltHandle");
        
        sniperRifleDragonuvReciever = new MCHPItems(64).setUnlocalizedName("sniperRifleDragonuvReciever");
        sniperRifleL96Reciever = new MCHPItems(64).setUnlocalizedName("sniperRifleL96Reciever");
        sniperRifleR700Reciever = new MCHPItems(64).setUnlocalizedName("sniperRifleR700Reciever");
        sniperRifleM14Reciever = new MCHPItems(64).setUnlocalizedName("sniperRifleM14Reciever");
        sniperRifleM21Reciever = new MCHPItems(64).setUnlocalizedName("sniperRifleM21Reciever");
        sniperRifleM40A3Reciever = new MCHPItems(64).setUnlocalizedName("sniperRifleM40A3Reciever");
        sniperRifleBarrettReciever = new MCHPItems(64).setUnlocalizedName("sniperRifleBarrettReciever");
        sniperRifleBarrettFlashHider = new MCHPItems(64).setUnlocalizedName("sniperRifleBarrettFlashHider");
        
        lmgBarrel = new MCHPItems(64).setUnlocalizedName("lmgBarrel");
        lmgBolt = new MCHPItems(64).setUnlocalizedName("lmgBolt");
        lmgFeedSlot = new MCHPItems(64).setUnlocalizedName("lmgFeedSlot");
        lmgMagwell = new MCHPItems(64).setUnlocalizedName("lmgMagwell");
        lmgFiringPin = new MCHPItems(64).setUnlocalizedName("lmgFiringPin");
        lmgBarrelJacket = new MCHPItems(64).setUnlocalizedName("lmgBarrelJacket");
        
        lmgM60Reciever = new MCHPItems(64).setUnlocalizedName("lmgM60Reciever");
        lmgM249Reciever = new MCHPItems(64).setUnlocalizedName("lmgM249Reciever");
        lmgRPDReciever = new MCHPItems(64).setUnlocalizedName("lmgRPDReciever");
        lmgMinigunReciever = new MCHPItems(64).setUnlocalizedName("lmgMinigunReciever");
        lmgMinigunBarrelSet = new MCHPItems(64).setUnlocalizedName("lmgMinigunBarrelSet");
        
        smgBarrel = new MCHPItems(64).setUnlocalizedName("smgBarrel");
        smgMagwell = new MCHPItems(64).setUnlocalizedName("smgMagwell");
        
        smgAK74Reciever = new MCHPItems(64).setUnlocalizedName("smgAK74Reciever");
        smgP90Reciever = new MCHPItems(64).setUnlocalizedName("smgP90Reciever");
        smgBizonReciever = new MCHPItems(64).setUnlocalizedName("smgBizonReciever");
        smgMP5Reciever = new MCHPItems(64).setUnlocalizedName("smgMP5Reciever");
        smgUziReciever = new MCHPItems(64).setUnlocalizedName("smgUziReciever");
        smgSkorpionReciever = new MCHPItems(64).setUnlocalizedName("smgSkorpionReciever");
        smgP90Magwell = new MCHPItems(64).setUnlocalizedName("smgP90Magwell");
        
        pistolBarrel = new MCHPItems(64).setUnlocalizedName("pistolBarrel");
        pistolGrip = new MCHPItems(64).setUnlocalizedName("pistolGrip");
        pistolHammer = new MCHPItems(64).setUnlocalizedName("pistolHammer");
        pistolSlide = new MCHPItems(64).setUnlocalizedName("pistolSlide");
        
        pistolGlockFrame = new MCHPItems(64).setUnlocalizedName("pistolGlockFrame");
        pistolM9Frame = new MCHPItems(64).setUnlocalizedName("pistolM9Frame");
        pistolMakarovFrame = new MCHPItems(64).setUnlocalizedName("pistolMakarovFrame");
        pistolP226Frame = new MCHPItems(64).setUnlocalizedName("pistolP226Frame");
        pistolUSPFrame = new MCHPItems(64).setUnlocalizedName("pistolUSPFrame");
        pistolM1911Frame = new MCHPItems(64).setUnlocalizedName("pistolM1911Frame");
        pistolDesertEagleFrame = new MCHPItems(64).setUnlocalizedName("pistolDesertEagleFrame");
        
        shotgunBarrel = new MCHPItems(64).setUnlocalizedName("shotgunBarrel");
        shotgunShellTube = new MCHPItems(64).setUnlocalizedName("shotgunShellTube");
        shotgunShellDoor = new MCHPItems(64).setUnlocalizedName("shotgunShellDoor");

        shotgunM1014Reciever = new MCHPItems(64).setUnlocalizedName("shotgunM1014Reciever");
        shotgunR870Reciever = new MCHPItems(64).setUnlocalizedName("shotgunR870Reciever");
        shotgunSPASReciever = new MCHPItems(64).setUnlocalizedName("shotgunSPASReciever");
        shotgunW1200Reciever = new MCHPItems(64).setUnlocalizedName("shotgunW1200Reciever");
        
        
        //----------------
        // VEHICLES
        //----------------
        
        //ammo parts
        case20mm = new MCHPItems(64).setUnlocalizedName("case20mm");
        case23mm = new MCHPItems(64).setUnlocalizedName("case23mm");
        case25mm = new MCHPItems(64).setUnlocalizedName("case25mm");
        case30mm = new MCHPItems(64).setUnlocalizedName("case30mm");
        case37mm = new MCHPItems(64).setUnlocalizedName("case37mm");
        case40mm = new MCHPItems(64).setUnlocalizedName("case40mm");
        case47mm = new MCHPItems(64).setUnlocalizedName("case47mm");
        case76mm = new MCHPItems(64).setUnlocalizedName("case76mm");
        case105mm = new MCHPItems(64).setUnlocalizedName("case105mm");
        case125mm = new MCHPItems(64).setUnlocalizedName("case125mm");
        case12_7cm = new MCHPItems(64).setUnlocalizedName("case12_7cm");
        case15_5cm = new MCHPItems(64).setUnlocalizedName("case15_5cm");
        case35_6cm = new MCHPItems(64).setUnlocalizedName("case35_6cm");
        case46cm = new MCHPItems(64).setUnlocalizedName("case46cm");
        case120mm = new MCHPItems(64).setUnlocalizedName("case120mm");
        case50mm = new MCHPItems(64).setUnlocalizedName("case50mm");
        case152mm = new MCHPItems(64).setUnlocalizedName("case152mm");
        case5_25in = new MCHPItems(64).setUnlocalizedName("case5_25in");
        
        case20mm_Filled = new MCHPItems(64).setUnlocalizedName("case20mm_Filled");
        case23mm_Filled = new MCHPItems(64).setUnlocalizedName("case23mm_Filled");
        case25mm_Filled = new MCHPItems(64).setUnlocalizedName("case25mm_Filled");
        case30mm_Filled = new MCHPItems(64).setUnlocalizedName("case30mm_Filled");
        case37mm_Filled = new MCHPItems(64).setUnlocalizedName("case37mm_Filled");
        case40mm_Filled = new MCHPItems(64).setUnlocalizedName("case40mm_Filled");
        case47mm_Filled = new MCHPItems(64).setUnlocalizedName("case47mm_Filled");
        case76mm_Filled = new MCHPItems(64).setUnlocalizedName("case76mm_Filled");
        case105mm_Filled = new MCHPItems(64).setUnlocalizedName("case105mm_Filled");
        case125mm_Filled = new MCHPItems(64).setUnlocalizedName("case125mm_Filled");
        case12_7cm_Filled = new MCHPItems(64).setUnlocalizedName("case12_7cm_Filled");
        case15_5cm_Filled = new MCHPItems(64).setUnlocalizedName("case15_5cm_Filled");
        case35_6cm_Filled = new MCHPItems(64).setUnlocalizedName("case35_6cm_Filled");
        case46cm_Filled = new MCHPItems(64).setUnlocalizedName("case46cm_Filled");
        case120mm_Filled = new MCHPItems(64).setUnlocalizedName("case120mm_Filled");
        case50mm_Filled = new MCHPItems(64).setUnlocalizedName("case50mm_Filled");
        case152mm_Filled = new MCHPItems(64).setUnlocalizedName("case152mm_Filled");
        case5_25in_Filled = new MCHPItems(64).setUnlocalizedName("case5_25in_Filled");
        
        case20mm_Cast = new MCHPItems(1).setUnlocalizedName("case20mm_Cast");
        case23mm_Cast = new MCHPItems(1).setUnlocalizedName("case23mm_Cast");
        case25mm_Cast = new MCHPItems(1).setUnlocalizedName("case25mm_Cast");
        case30mm_Cast = new MCHPItems(1).setUnlocalizedName("case30mm_Cast");
        case37mm_Cast = new MCHPItems(1).setUnlocalizedName("case37mm_Cast");
        case40mm_Cast = new MCHPItems(1).setUnlocalizedName("case40mm_Cast");
        case47mm_Cast = new MCHPItems(1).setUnlocalizedName("case47mm_Cast");
        case76mm_Cast = new MCHPItems(1).setUnlocalizedName("case76mm_Cast");
        case105mm_Cast = new MCHPItems(1).setUnlocalizedName("case105mm_Cast");
        case125mm_Cast = new MCHPItems(1).setUnlocalizedName("case125mm_Cast");
        case12_7cm_Cast = new MCHPItems(1).setUnlocalizedName("case12_7cm_Cast");
        case15_5cm_Cast = new MCHPItems(1).setUnlocalizedName("case15_5cm_Cast");
        case35_6cm_Cast = new MCHPItems(1).setUnlocalizedName("case35_6cm_Cast");
        case46cm_Cast = new MCHPItems(1).setUnlocalizedName("case46cm_Cast");
        case120mm_Cast = new MCHPItems(1).setUnlocalizedName("case120mm_Cast");
        case50mm_Cast = new MCHPItems(1).setUnlocalizedName("case50mm_Cast");
        case152mm_Cast = new MCHPItems(1).setUnlocalizedName("case152mm_Cast");
        case5_25in_Cast = new MCHPItems(1).setUnlocalizedName("case5_25in_Cast");
        
        ammo12_7cm = new MCHPTextItem("12.7cm", 1, "ammo127cm").setUnlocalizedName("ammo12_7cm");
        ammo12_7cm_5x = new MCHPTextItem("12.7cm", 5, "ammo127cm").setUnlocalizedName("ammo12_7cm_5x");
        ammo15_5cm = new MCHPTextItem("15.5cm", 1, "ammo155cm").setUnlocalizedName("ammo15_5cm");
        ammo15_5cm_5x = new MCHPTextItem("15.5cm", 5, "ammo155cm").setUnlocalizedName("ammo15_5cm_5x");
        ammo35_6cm = new MCHPTextItem("35.6cm", 1, "ammo356cm").setUnlocalizedName("ammo35_6cm");
        ammo46cm = new MCHPTextItem("46cm", 1, "ammo46cm").setUnlocalizedName("ammo46cm");
        
        ammo7_62mm_5x = new MCHPTextItem("7.62mm", 5, "ammo762mm").setUnlocalizedName("ammo7_62mm_5x");
        ammo7_62mm_25x = new MCHPTextItem("7.62mm", 25, "ammo762mm").setUnlocalizedName("ammo7_62mm_25x");
        ammo7_7mm_5x = new MCHPTextItem("7.7mm", 5, "ammo762mm").setUnlocalizedName("ammo7_7mm_5x");
        ammo7_7mm_25x = new MCHPTextItem("7.7mm", 25, "ammo762mm").setUnlocalizedName("ammo7_7mm_25x");
        ammo7_92_5x = new MCHPTextItem("7.92mm", 5, "ammo762mm").setUnlocalizedName("ammo7_92mm_5x");
        ammo7_92_25x = new MCHPTextItem("7.92mm", 25, "ammo762mm").setUnlocalizedName("ammo7_92mm_25x");
        ammo12_7mm_5x = new MCHPTextItem("12.7mm", 5, "ammo762mm").setUnlocalizedName("ammo12_7mm_5x");
        ammo12_7mm_25x = new MCHPTextItem("12.7mm", 25, "ammo762mm").setUnlocalizedName("ammo12_7mm_25x");
        ammo20mm = new MCHPTextItem("20mm", 1, "ammo20mm").setUnlocalizedName("ammo20mm");
        ammo20mm_5x = new MCHPTextItem("20mm", 5, "ammo20mm").setUnlocalizedName("ammo20mm_5x");
        ammo20mm_25x = new MCHPTextItem("20mm", 25, "ammo20mm").setUnlocalizedName("ammo20mm_25x");
        ammo23mm = new MCHPTextItem("23mm", 1, "ammo23mm").setUnlocalizedName("ammo23mm");
        ammo23mm_5x = new MCHPTextItem("23mm", 5, "ammo23mm").setUnlocalizedName("ammo23mm_5x");
        ammo23mm_25x = new MCHPTextItem("23mm", 25, "ammo23mm").setUnlocalizedName("ammo23mm_25x");
        ammo25mm = new MCHPTextItem("25mm", 1, "ammo25mm").setUnlocalizedName("ammo25mm");
        ammo25mm_5x = new MCHPTextItem("25mm", 5, "ammo25mm").setUnlocalizedName("ammo25mm_5x");
        ammo25mm_25x = new MCHPTextItem("25mm", 25, "ammo25mm").setUnlocalizedName("ammo25mm_25x");
        ammo30mm = new MCHPTextItem("30mm", 1, "ammo30mm").setUnlocalizedName("ammo30mm");
        ammo30mm_5x = new MCHPTextItem("30mm", 5, "ammo30mm").setUnlocalizedName("ammo30mm_5x");
        ammo30mm_25x = new MCHPTextItem("30mm", 25, "ammo30mm").setUnlocalizedName("ammo30mm_25x");
        ammo37mm = new MCHPTextItem("37mm", 1, "ammo37mm").setUnlocalizedName("ammo37mm");
        ammo37mm_5x = new MCHPTextItem("37mm", 5, "ammo37mm").setUnlocalizedName("ammo37mm_5x");
        ammo37mm_25x = new MCHPTextItem("37mm", 25, "ammo37mm").setUnlocalizedName("ammo37mm_25x");
        ammo40mm = new MCHPTextItem("40mm", 1, "ammo40mm").setUnlocalizedName("ammo40mm");
        ammo40mm_5x = new MCHPTextItem("40mm", 5, "ammo40mm").setUnlocalizedName("ammo40mm_5x");
        ammo40mm_25x = new MCHPTextItem("40mm", 25, "ammo40mm").setUnlocalizedName("ammo40mm_25x");
        ammo40mm_Grenade = new MCHPTextItem("40mm", 1, "grenade40mm").setUnlocalizedName("ammo40mm_Grenade");//
        ammo40mm_Grenade_5x = new MCHPTextItem("40mm", 5, "grenade40mm").setUnlocalizedName("ammo40mm_Grenade_5x");//
        ammo40mm_Grenade_25x = new MCHPTextItem("40mm", 25, "grenade40mm").setUnlocalizedName("ammo40mm_Grenade_25x");//
        ammo47mm = new MCHPTextItem("47mm", 1, "ammo47mm").setUnlocalizedName("ammo47mm");
        ammo47mm_5x = new MCHPTextItem("47mm", 5, "ammo47mm").setUnlocalizedName("ammo47mm_5x");
        ammo47mm_25x = new MCHPTextItem("47mm", 25, "ammo47mm").setUnlocalizedName("ammo47mm_25x");
        ammo76mm = new MCHPTextItem("76mm", 1, "ammo76mm").setUnlocalizedName("ammo76mm");
        ammo76mm_5x = new MCHPTextItem("76mm", 5, "ammo76mm").setUnlocalizedName("ammo76mm_5x");
        ammo76mm_25x = new MCHPTextItem("76mm", 25, "ammo76mm").setUnlocalizedName("ammo76mm_25x");
        ammo105mm = new MCHPTextItem("105mm", 1, "ammo105mm").setUnlocalizedName("ammo105mm"); //APFSDS
        ammo105mm_5x = new MCHPTextItem("105mm", 5, "ammo105mm").setUnlocalizedName("ammo125mm_5x"); 
        ammo125mm = new MCHPTextItem("125mm", 1, "ammo125mm").setUnlocalizedName("ammo125mm"); //APFSDS
        ammo125mm_he = new MCHPTextItem("125mm", 1, "ammo125mm").setUnlocalizedName("ammo125mm_he");
        ammoMk19Grenade = new MCHPItems(64).setUnlocalizedName("ammoMk19Grenade");
        
        ammo120mmOrdnance = new MCHPTextItem("120mm", 1, "ammo120mm").setUnlocalizedName("ammo120mmOrdnance");
        ammo50mmOrdnance = new MCHPTextItem("50mm", 1, "ammo50mm").setUnlocalizedName("ammo50mmOrdnance");
        ammo152mmOrdnance = new MCHPTextItem("152mm", 1, "ammo152mm").setUnlocalizedName("ammo152mmOrdnance");
        
        ammo5_25in = new MCHPTextItem("5.25 inch", 1, "ammo525inch").setUnlocalizedName("ammo5_25in");
        ammo5_25in_5x = new MCHPTextItem("5.25 inch", 5, "ammo525inch").setUnlocalizedName("ammo5_25in_5x");
        ammo5_25in_25x = new MCHPTextItem("5.25 inch", 25, "ammo525inch").setUnlocalizedName("ammo5_25in_25x");
        
        radioA_10_CAS = new MCHPItems(64).setUnlocalizedName("radioA_10_CAS");
        
        missile9M114 = new MCHPItems(64).setUnlocalizedName("missile9M114");
        missile9M114_TV = new MCHPItems(64).setUnlocalizedName("missile9M114_TV");
        missile40mm = new MCHPItems(64).setUnlocalizedName("missile40mm");
        missile57mm = new MCHPItems(64).setUnlocalizedName("missile57mm");
        missile66mm = new MCHPItems(64).setUnlocalizedName("missile66mm");
        missile68mm = new MCHPItems(64).setUnlocalizedName("missile68mm");
        missile70mm = new MCHPItems(64).setUnlocalizedName("missile70mm");
        missile70mm_TV = new MCHPItems(64).setUnlocalizedName("missile70mm_TV");
        missile80mm = new MCHPItems(64).setUnlocalizedName("missile80mm");
        missile80mm_thermobaric = new MCHPItems(64).setUnlocalizedName("missile80mm_thermobaric");
        missile80mm_marker = new MCHPItems(64).setUnlocalizedName("missile80mm_marker");
        missile84mm = new MCHPItems(64).setUnlocalizedName("missile84mm");
        missile149mm = new MCHPItems(64).setUnlocalizedName("missile149mm");
        missile200mm = new MCHPItems(64).setUnlocalizedName("missile200mm");
        missileAGM_65_Maverick = new MCHPItems(64).setUnlocalizedName("missileAGM_65_Maverick");
        missileAGM_84_Harpoon = new MCHPItems(64).setUnlocalizedName("missileAGM_84_Harpoon");
        missileAGM_114_Hellfire = new MCHPItems(64).setUnlocalizedName("missileAGM_114_Hellfire");
        missileAGM_114_Hellfire_TV = new MCHPItems(64).setUnlocalizedName("missileAGM_114_Hellfire_TV");
        missileAGM_119B_Penguin = new MCHPItems(64).setUnlocalizedName("missileAGM_119B_Penguin");
        missileAGM_130 = new MCHPItems(64).setUnlocalizedName("missileAGM_130");
        missileAGM_154 = new MCHPItems(64).setUnlocalizedName("missileAGM_154");
        missileAGM_158_JASSM = new MCHPItems(64).setUnlocalizedName("missileAGM_158_JASSM");
        missileAIM_7_Sparrow = new MCHPItems(64).setUnlocalizedName("missileAIM_7_Sparrow");
        missileAIM_9_Sidewinder = new MCHPItems(64).setUnlocalizedName("missileAIM_9_Sidewinder");
        missileAIM_9x_Sidewinder = new MCHPItems(64).setUnlocalizedName("missileAIM_9x_Sidewinder");
        missileAIM_92_Stinger = new MCHPItems(64).setUnlocalizedName("missileAIM_92_Stinger");
        missileAIM_120_AMRAAM = new MCHPItems(64).setUnlocalizedName("missileAIM_120_AMRAAM");
        missileMIM_23_HAWK = new MCHPItems(64).setUnlocalizedName("missileAIM_23_HAWK");
        missileIRIS_T = new MCHPItems(64).setUnlocalizedName("missileIRIS_T");
        missileSA_2 = new MCHPItems(64).setUnlocalizedName("missileSA_2");
        missileGeneric = new MCHPItems(64).setUnlocalizedName("missileGeneric");
        missileGenericTV = new MCHPItems(64).setUnlocalizedName("missileGenericTV");
        missileGenericLaser = new MCHPItems(64).setUnlocalizedName("missileGenericLaser");
        
        bomb50kg = new MCHPItems(64).setUnlocalizedName("bomb50kg");
        bomb250kg = new MCHPItems(64).setUnlocalizedName("bomb250kg");
        bomb250lb = new MCHPItems(64).setUnlocalizedName("bomb250lb");
        bomb500lb = new MCHPItems(64).setUnlocalizedName("bomb500lb");
        bomb540lb = new MCHPItems(64).setUnlocalizedName("bomb540lb");
        bomb1800kg = new MCHPItems(64).setUnlocalizedName("bomb1800kg");
        bombAN_M17 = new MCHPItems(64).setUnlocalizedName("bombAN_M17");
        bombCluster = new MCHPItems(64).setUnlocalizedName("bombCluster");
        bombJDAM = new MCHPItems(64).setUnlocalizedName("bombJDAM");
        bomb936kgTorpedo = new MCHPItems(64).setUnlocalizedName("bomb936kgTorpedo");
        bombMk46Torpedo = new MCHPItems(64).setUnlocalizedName("bombMk46Torpedo");
        bombType91Torpedo = new MCHPItems(64).setUnlocalizedName("bombType91Torpedo");
        bombType93Torpedo = new MCHPItems(64).setUnlocalizedName("bombType93Torpedo");
        bombType97 = new MCHPItems(64).setUnlocalizedName("bombType97");
        bombMk62Mine = new MCHPItems(64).setUnlocalizedName("bombMk62Mine");
        bombPlastic = new MCHPItems(64).setUnlocalizedName("bombPlastic");
        
        //Weapons
        weaponSmallCannon = new MCHPItems(64).setUnlocalizedName("weaponSmallCannon"); //20-50mm rounds
        weaponMediumCannon = new MCHPItems(64).setUnlocalizedName("weaponMediumCannon"); //51-100mm rounds
        weaponLargeCannon = new MCHPItems(64).setUnlocalizedName("weaponLargeCannon"); //101mm-200mm rounds
        weaponMissileLauncher = new MCHPItems(64).setUnlocalizedName("weaponMissileLauncher");
        weaponLaserMissileLauncher = new MCHPItems(64).setUnlocalizedName("weaponLaserMissileLauncher");
        weaponTVMissileLauncher = new MCHPItems(64).setUnlocalizedName("weaponTVMissileLauncher");
        
        weaponAGM_Launcher = new MCHPItems(64).setUnlocalizedName("weaponAGM_Launcher");
        weaponAIM_Launcher = new MCHPItems(64).setUnlocalizedName("weaponAIM_Launcher");
        
        //Weapons (Guns)
        weaponGSh_23_2 = new MCHPItems(64).setUnlocalizedName("weaponGSh_23_2");
        weaponYakB_12_7 = new MCHPItems(64).setUnlocalizedName("weaponYakB_12_7");
        weaponGShG_7_62 = new MCHPItems(64).setUnlocalizedName("weaponGShG_7_62");
        weaponM3M = new MCHPItems(64).setUnlocalizedName("weaponM3M");
        weaponM60 = new MCHPItems(64).setUnlocalizedName("weaponM60");
        weaponM61A1_Vulcan = new MCHPItems(64).setUnlocalizedName("weaponM61A1_Vulcan");
        weaponM134 = new MCHPItems(64).setUnlocalizedName("weaponM134");
        weaponM134D = new MCHPItems(64).setUnlocalizedName("weaponM134D");
        weaponM197 = new MCHPItems(64).setUnlocalizedName("weaponM197");
        weaponM230 = new MCHPItems(64).setUnlocalizedName("weaponM230");
        weaponM240 = new MCHPItems(64).setUnlocalizedName("weaponM240");
        weapon12_7_Machine_Gun = new MCHPItems(64).setUnlocalizedName("weapon12_7_Machine_Gun");
        
        //Towns
        valthraxusToken = new TokenItem().setUnlocalizedName("valthraxusToken");
        larchToken = new TokenItem().setUnlocalizedName("larchToken");
        eouToken = new TokenItem().setUnlocalizedName("eouToken");
    	vanguardsPeakToken = new TokenItem().setUnlocalizedName("vanguardsPeakToken");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.registerRenderers();
    	proxy.registerItems();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }

}
