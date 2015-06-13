package co.uk.silvania.mcheliparts;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MCHPTextItem extends Item {
	
	public String cal = "";
	public int stack;
	public String texture;

	public MCHPTextItem(String cal, int stack, String texture) {
		super();
		this.cal = cal;
		this.setCreativeTab(MCHeliParts.tabMCHP);
		this.texture = texture;
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
	private IIcon superMultiIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(MCHeliParts.modid + ":" + (this.getUnlocalizedName().substring(5)));
		multiIcon = iconRegister.registerIcon(MCHeliParts.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_5x");
		superMultiIcon = iconRegister.registerIcon(MCHeliParts.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_25x");
	}
	
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIconIndex(ItemStack item) {
    	if (this.stack > 1 && this.stack < 25) {
    		return multiIcon;
    	} else if (this.stack >= 25) {
    		return superMultiIcon;
    	} else
        return itemIcon;
    }

}