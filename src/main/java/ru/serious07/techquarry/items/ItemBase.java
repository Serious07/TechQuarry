package ru.serious07.techquarry.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.serious07.techquarry.Main;
import ru.serious07.techquarry.init.ModItems;
import ru.serious07.techquarry.util.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}