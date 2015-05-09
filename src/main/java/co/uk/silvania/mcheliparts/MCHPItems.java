package co.uk.silvania.mcheliparts;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MCHPItems extends Item {
	
	public MCHPItems(int stack) {
		super();
		this.maxStackSize = stack;
		this.setCreativeTab(MCHeliParts.tabMCHP);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(MCHeliParts.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
