package co.uk.silvania.mcheliparts;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MCHPTextItem extends MCHPItems {
	
	public String cal = "";
	public int stack;
	public String texture;

	public MCHPTextItem(String cal, int stack, String texture) {
		super(64);
		this.cal = cal;
		if (stack > 1) {
			this.stack = stack;
		}
	}
	
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer play, List list, boolean bool) {
		list.add("Calibre: " + cal);
		if (stack > 1) {
			list.add("Quantity: " + stack);
		}
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon multiIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(MCHeliParts.modid + ":" + texture);
		multiIcon = iconRegister.registerIcon(MCHeliParts.modid + ":" + texture + "_muli");
	}
	
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIconIndex(ItemStack item) {
    	if (this.stack > 1) {
    		return multiIcon;
    	}
        return itemIcon;
    }

}
