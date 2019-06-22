package com.solochopstick.realisticsurvivalmod.items;

import com.solochopstick.realisticsurvivalmod.Main;
import com.solochopstick.realisticsurvivalmod.init.ModItems;
import com.solochopstick.realisticsurvivalmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
