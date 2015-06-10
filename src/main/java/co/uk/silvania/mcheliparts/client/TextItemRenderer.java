package co.uk.silvania.mcheliparts.client;

import co.uk.silvania.mcheliparts.MCHPTextItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;

public class TextItemRenderer implements IItemRenderer {

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type == ItemRenderType.INVENTORY;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private static RenderItem renderItem = new RenderItem();
	
	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		IIcon icon = item.getIconIndex();
		FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
		
		renderItem.renderIcon(0, 0, icon, 16, 16);
		
		//String text = MCHPTextItem.cal + ", " + MCHPTextItem.stack;
		fontRenderer.drawString(text, 1, 1, 0xFFFFFF);
		
	}

}
