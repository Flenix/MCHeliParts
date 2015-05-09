package co.uk.silvania.mcheliparts;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class TokenItem extends Item {
	
	public TokenItem() {
		super();
		this.setCreativeTab(MCHeliParts.tabMCHP);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(MCHeliParts.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
