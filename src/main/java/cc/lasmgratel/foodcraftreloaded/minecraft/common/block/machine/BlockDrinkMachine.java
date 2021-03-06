/*
 * FoodCraft Mod - Add more food to your Minecraft.
 * Copyright (C) 2017 Lasm Gratel
 *
 * This file is part of FoodCraft Mod.
 *
 * FoodCraft Mod is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FoodCraft Mod is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FoodCraft Mod.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.lasmgratel.foodcraftreloaded.minecraft.common.block.machine;

import cc.lasmgratel.foodcraftreloaded.minecraft.api.init.FCRBlocks;
import cc.lasmgratel.foodcraftreloaded.minecraft.api.init.FCRCreativeTabs;
import cc.lasmgratel.foodcraftreloaded.minecraft.client.EnumGui;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.FoodCraftReloadedMod;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.block.tileentity.TileEntityDrinkMachine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BlockDrinkMachine extends BlockMachine {
    public BlockDrinkMachine() {
        setCreativeTab(FCRCreativeTabs.BASE);
        setHardness(2.5f);
        setHarvestLevel("pickaxe", 0);
        setLightLevel(1.0f);
    }

    @Override
    public void breakBlock(@Nonnull World worldIn, @Nonnull BlockPos pos, @Nonnull IBlockState state) {
        worldIn.removeTileEntity(pos);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.getTileEntity(pos) == null)
            createNewTileEntity(worldIn, getMetaFromState(state));
        playerIn.openGui(FoodCraftReloadedMod.INSTANCE, EnumGui.DRINK_MACHINE.ordinal(), worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }

    @Nonnull
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, @Nonnull IBlockState state) {
        return new ItemStack(FCRBlocks.DRINK_MACHINE);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(@Nonnull World worldIn, int meta) {
        return new TileEntityDrinkMachine();
    }
}
