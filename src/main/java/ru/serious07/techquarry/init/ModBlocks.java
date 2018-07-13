package ru.serious07.techquarry.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.serious07.techquarry.blocks.BlockBase;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
}