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
    public static Item lowTorqueLPJetEngine;
    public static Item medTorqueLPJetEngine;
    public static Item highTorqueLPJetEngine;
    public static Item stealthEngine;
    public static Item lowTorqueIonThruster;
    public static Item medTorqueIonThruster;
    public static Item highTorqueIonThruster;
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
    public static Item an2sEngine;
    public static Item an2sWing;
    public static Item t4Fuselage;
    public static Item t4Tail;
    public static Item t4Engine;
    public static Item t4Wing;
    public static Item m18Fuselage;
    public static Item m18Tail;
    public static Item m18Engine;
    public static Item m18Wing;
    public static Item p180Fuselage;
    public static Item p180Cockpit;
    public static Item p180Tail;
    public static Item p180Engine;
    public static Item p180Wing;
    public static Item md90Fuselage;
    public static Item md90Cockpit;
    public static Item md90Tail;
    public static Item md90Engine;
    public static Item md90Wing;
    public static Item mc72Fuselage;
    public static Item mc72Tail;
    public static Item mc72Engine;
    public static Item mc72Wing;
    public static Item mc72Floater;
    public static Item m33Fuselage;
    public static Item m33Tail;
    public static Item m33Engine;
    public static Item m33Wing;
    public static Item m33Floater;
    public static Item cessna172Fuselage;
    public static Item cessna172Tail;
    public static Item cessna172Engine;
    public static Item cessna172Wing;
    public static Item cessna172Floater;
    public static Item cessna152Fuselage;
    public static Item cessna152Tail;
    public static Item cessna152Engine;
    public static Item cessna152Wing;
    
    //Halo items
    public static Item hornetFuselage;
    public static Item hornetEngine;
    public static Item hornetWing;
    public static Item hornetStandWing;
    public static Item hornetControlSystem;
    public static Item hornetWeaponSystem;
    public static Item ghostFuselage;
    public static Item ghostControlSystem;
    public static Item ghostEngine;
    public static Item ghostExhaust;
    public static Item ghostWeaponSystem;
    public static Item bansheeLowerFuselage;
    public static Item bansheeUpperFuselage;
    public static Item bansheeControlSystem;
    public static Item bansheeWing;
    public static Item bansheeEngine;
    public static Item bansheeWeaponSystem;
    
    public static Item unscVulcan;
    public static Item unscVulcanRounds;
    public static Item unscRocketLauncher;
    public static Item unscRocket;
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
    
    public static Item case5mm;
    public static Item case5_56mm;
    public static Item case6mm;
    public static Item case6_35mm;
    public static Item case6_5mm;
    public static Item case6_8mm;
    public static Item case7mm;
    public static Item case7_62mm;
    public static Item case7_7mm;
    public static Item case7_8mm;
    public static Item case7_9mm;
    public static Item case7_92mm;
    public static Item case8mm;
    public static Item case8_6mm;
    public static Item case9mm;
    public static Item case10mm;
    public static Item case10_9mm;
    public static Item case11_43mm;
    public static Item case12_7mm;
    
    public static Item round5mm;
    public static Item round5_56mm;
    public static Item round5_56mm_5x;
    public static Item round5_56mm_30x;
    public static Item round5_56mm_100x;
    public static Item round6mm;
    public static Item round6_35mm;
    public static Item round6_5mm;
    public static Item round6_8mm;
    public static Item round7mm;
    public static Item round7_62mm;
    public static Item round7_7mm;
    public static Item round7_8mm;
    public static Item round7_9mm;
    public static Item round7_92mm;
    public static Item round8mm;
    public static Item round8_6mm;
    public static Item round9mm;
    public static Item round10mm;
    public static Item round10_9mm;
    public static Item round11_43mm;
    public static Item round12_7mm;
    
    
    //----------------
    // VEHICLES
    //----------------
    
    //round parts
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
    //round TODO
    public static Item round12_7cm;
    public static Item round12_7cm_5x;
    public static Item round15_5cm;
    public static Item round15_5cm_5x;
    public static Item round35_6cm;
    public static Item round46cm;
    
    public static Item round7_62mm_5x;
    public static Item round7_62mm_25x;
    public static Item round7_7mm_5x;
    public static Item round7_7mm_25x;
    public static Item round7_92_5x;
    public static Item round7_92_25x;
    public static Item round12_7mm_5x;
    public static Item round12_7mm_25x;
    public static Item round20mm;
    public static Item round20mm_5x;
    public static Item round20mm_25x;
    public static Item round23mm;
    public static Item round23mm_5x;
    public static Item round23mm_25x;
    public static Item round25mm;
    public static Item round25mm_5x;
    public static Item round25mm_25x;
    public static Item round30mm;
    public static Item round30mm_5x;
    public static Item round30mm_25x;
    public static Item round37mm;
    public static Item round37mm_5x;
    public static Item round37mm_25x;
    public static Item round40mm;
    public static Item round40mm_5x;
    public static Item round40mm_25x;
    public static Item round40mm_Grenade;
    public static Item round40mm_Grenade_5x;
    public static Item round40mm_Grenade_25x;
    public static Item round47mm;
    public static Item round47mm_5x;
    public static Item round47mm_25x;
    public static Item round76mm;
    public static Item round76mm_5x;
    public static Item round76mm_25x;
    public static Item round105mm; //APFSDS
    public static Item round105mm_5x; 
    public static Item round125mm; //APFSDS
    public static Item round125mm_he;
    public static Item roundMk19Grenade;
    
    public static Item round120mmOrdnance;
    public static Item round50mmOrdnance;
    public static Item round152mmOrdnance;
    
    public static Item round5_25in;
    public static Item round5_25in_5x;
    public static Item round5_25in_25x;
    
    public static Item radioA_10_CAS;
    
    public static Item missile9M114;
    public static Item missile9M114_TV;
    public static Item missile57mm;
    public static Item missile68mm;
    public static Item missile70mm;
    public static Item missile70mm_TV;
    public static Item missile80mm;
    public static Item missile80mm_thermobaric;
    public static Item missile80mm_marker;
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
    public static Item weaponSmallCannon; //20-50mm rounds
    public static Item weaponMediumCannon; //51-100mm rounds
    public static Item weaponLargeCannon; //101mm-200mm rounds
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
        //TODO textures!
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
        lowTorqueLPJetEngine = new MCHPItems(64).setUnlocalizedName("lowTorqueLPJetEngine");
        medTorqueLPJetEngine = new MCHPItems(64).setUnlocalizedName("medTorqueLPJetEngine");
        highTorqueLPJetEngine = new MCHPItems(64).setUnlocalizedName("highTorqueLPJetEngine");
        stealthEngine = new MCHPItems(64).setUnlocalizedName("stealthEngine");
        lowTorqueIonThruster = new MCHPItems(64).setUnlocalizedName("lowTorqueIonThruster");
        medTorqueIonThruster = new MCHPItems(64).setUnlocalizedName("medTorqueIonThruster");
        highTorqueIonThruster = new MCHPItems(64).setUnlocalizedName("highTorqueIonThruster");
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
        an2sEngine = new MCHPItems(8).setUnlocalizedName("an2sEngine");
        an2sWing = new MCHPItems(16).setUnlocalizedName("an2sWing");
        t4Fuselage = new MCHPItems(4).setUnlocalizedName("t4Fuselage");
        t4Tail = new MCHPItems(8).setUnlocalizedName("t4Tail");
        t4Engine = new MCHPItems(8).setUnlocalizedName("t4Engine");
        t4Wing = new MCHPItems(16).setUnlocalizedName("t4Wing");
        m18Fuselage = new MCHPItems(4).setUnlocalizedName("m18Fuselage");
        m18Tail = new MCHPItems(8).setUnlocalizedName("m18Tail");
        m18Engine = new MCHPItems(8).setUnlocalizedName("m18Engine");
        m18Wing = new MCHPItems(16).setUnlocalizedName("m18Wing");
        p180Fuselage = new MCHPItems(4).setUnlocalizedName("p180Fuselage");
        p180Cockpit = new MCHPItems(4).setUnlocalizedName("p180Cockpit");
        p180Tail = new MCHPItems(8).setUnlocalizedName("p180Tail");
        p180Engine = new MCHPItems(8).setUnlocalizedName("p180Engine");
        p180Wing = new MCHPItems(16).setUnlocalizedName("p180Wing");
        md90Fuselage = new MCHPItems(4).setUnlocalizedName("md90Fuselage");
        md90Cockpit = new MCHPItems(4).setUnlocalizedName("md90Cockpit");
        md90Tail = new MCHPItems(8).setUnlocalizedName("md90Tail");
        md90Engine = new MCHPItems(8).setUnlocalizedName("md90Engine");
        md90Wing = new MCHPItems(16).setUnlocalizedName("md90Wing");
        mc72Fuselage = new MCHPItems(4).setUnlocalizedName("mc72Fuselage");
        mc72Tail = new MCHPItems(8).setUnlocalizedName("mc72Tail");
        mc72Engine = new MCHPItems(8).setUnlocalizedName("mc72Engine");
        mc72Wing = new MCHPItems(16).setUnlocalizedName("mc72Wing");
        mc72Floater = new MCHPItems(16).setUnlocalizedName("mc72Floater");
        m33Fuselage = new MCHPItems(4).setUnlocalizedName("m33Fuselage");
        m33Tail = new MCHPItems(8).setUnlocalizedName("m33Tail");
        m33Engine = new MCHPItems(8).setUnlocalizedName("m33Engine");
        m33Wing = new MCHPItems(16).setUnlocalizedName("m33Wing");
        m33Floater = new MCHPItems(16).setUnlocalizedName("m33Floater");
        cessna172Fuselage = new MCHPItems(4).setUnlocalizedName("cessna172Fuselage");
        cessna172Tail = new MCHPItems(8).setUnlocalizedName("cessna172Tail");
        cessna172Engine = new MCHPItems(8).setUnlocalizedName("cessna172Engine");
        cessna172Wing = new MCHPItems(16).setUnlocalizedName("cessna172Wing");
        cessna172Floater = new MCHPItems(16).setUnlocalizedName("cessna172Floater");
        cessna152Fuselage = new MCHPItems(4).setUnlocalizedName("cessna152Fuselage");
        cessna152Tail = new MCHPItems(8).setUnlocalizedName("cessna152Tail");
        cessna152Engine = new MCHPItems(8).setUnlocalizedName("cessna152Engine");
        cessna152Wing = new MCHPItems(16).setUnlocalizedName("cessna152Wing");
        
        //Halo items
        hornetFuselage = new MCHPItems(4).setUnlocalizedName("hornetFuselage");
        hornetEngine = new MCHPItems(8).setUnlocalizedName("hornetEngine");
        hornetWing = new MCHPItems(16).setUnlocalizedName("hornetWing");
        hornetStandWing = new MCHPItems(16).setUnlocalizedName("hornetStandWing");
        hornetControlSystem = new MCHPItems(16).setUnlocalizedName("hornetControlSystem");
        hornetWeaponSystem = new MCHPItems(16).setUnlocalizedName("hornetWeaponSystem");
        ghostFuselage = new MCHPItems(4).setUnlocalizedName("ghostFuselage");
        ghostControlSystem = new MCHPItems(16).setUnlocalizedName("ghostControlSystem");
        ghostEngine = new MCHPItems(8).setUnlocalizedName("ghostEngine");
        ghostExhaust = new MCHPItems(8).setUnlocalizedName("ghostExhaust");
        ghostWeaponSystem = new MCHPItems(16).setUnlocalizedName("ghostWeaponSystem");
        bansheeLowerFuselage = new MCHPItems(4).setUnlocalizedName("bansheeLowerFuselage");
        bansheeUpperFuselage = new MCHPItems(4).setUnlocalizedName("bansheeUpperFuselage");
        bansheeControlSystem = new MCHPItems(16).setUnlocalizedName("bansheeControlSystem");
        bansheeWing = new MCHPItems(16).setUnlocalizedName("bansheeWing");
        bansheeEngine = new MCHPItems(8).setUnlocalizedName("bansheeEngine");
        bansheeWeaponSystem = new MCHPItems(16).setUnlocalizedName("bansheeWeaponSystem");
        
        unscVulcan = new MCHPItems(1).setUnlocalizedName("unscVulcan");
        unscVulcanRounds = new MCHPItems(64).setUnlocalizedName("unscVulcanRounds");
        unscRocketLauncher = new MCHPItems(1).setUnlocalizedName("unscRocketLauncher");
        unscRocket = new MCHPItems(16).setUnlocalizedName("unscRocket");
        covenantPlasmaCannon = new MCHPItems(1).setUnlocalizedName("covenantPlasmaCannon");
        covenantPlasmaCharger = new MCHPItems(1).setUnlocalizedName("covenantPlasmaCharger");
        covenantFuelRodCannon = new MCHPItems(1).setUnlocalizedName("covenantFuelRodCannon");
        covenantFuelRod = new MCHPItems(16).setUnlocalizedName("covenantFuelRod");
        
        round5_56mm = new MCHPTextItem("5.56mm", 1, "round556").setUnlocalizedName("round5_56mm");
        round5_56mm_5x = new MCHPTextItem("5.56mm", 5, "round556mm").setUnlocalizedName("round5_56mm_5x");
        round5_56mm_30x = new MCHPTextItem("5.56mm", 30, "round556mm").setUnlocalizedName("round5_56mm_30x");
        round5_56mm_100x = new MCHPTextItem("5.56mm", 100, "round556mm").setUnlocalizedName("round5_56mm_100x");
        
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
