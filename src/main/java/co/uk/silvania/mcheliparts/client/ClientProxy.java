package co.uk.silvania.mcheliparts.client;

import net.minecraftforge.client.MinecraftForgeClient;
import co.uk.silvania.mcheliparts.CommonProxy;
import co.uk.silvania.mcheliparts.MCHeliParts;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.registerItemRenderer(MCHeliParts.round5_56mm, new TextItemRenderer());
		MinecraftForgeClient.registerItemRenderer(MCHeliParts.round5_56mm_5x, new TextItemRenderer());
		MinecraftForgeClient.registerItemRenderer(MCHeliParts.round5_56mm_30x, new TextItemRenderer());
		MinecraftForgeClient.registerItemRenderer(MCHeliParts.round5_56mm_100x, new TextItemRenderer());
	}
}
