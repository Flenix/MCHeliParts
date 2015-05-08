package co.uk.silvania.mcheliparts;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MCHPLoreItem extends Item {
	
	public String lore;
	public String txtr;
	public int value;
	
	public MCHPLoreItem(String str, int val, String texture) {
		super();
		txtr = texture;
		lore = str;
		value = val;
	}
	
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer play, List list, boolean bool) {
		list.add(lore);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(MCHeliParts.modid + ":" + txtr);
	}

}
