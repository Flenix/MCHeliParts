package co.uk.silvania.mcheliparts;

import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	@Instance
	public static MCHeliParts instance;
	
	public void registerItems() {
		GameRegistry.registerItem(MCHeliParts.lowTorqueEngine, "lowTorqueEngine");
	}

}
