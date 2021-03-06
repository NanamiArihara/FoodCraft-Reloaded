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

package cc.lasmgratel.foodcraftreloaded.minecraft.common.block;

import cc.lasmgratel.foodcraftreloaded.minecraft.client.util.masking.CustomModelMasking;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.FoodCraftReloadedMod;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.item.food.fruit.FruitType;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.item.food.fruit.ItemFruitCake;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.loader.FruitEnumLoader;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.util.NameBuilder;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.util.enumeration.FruitTyped;
import net.minecraft.block.BlockCake;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

public class BlockFruitCake extends BlockCake implements CustomModelMasking, FruitTyped {
    private FruitType fruitType;

    public BlockFruitCake(FruitType fruitType) {
        super();
        setRegistryName(FoodCraftReloadedMod.MODID, NameBuilder.buildRegistryName(fruitType.toString(), "cake"));
        this.fruitType = fruitType;
    }

    @Override
    public FruitType getType() {
        return fruitType;
    }

    public void setFruitType(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    @Nonnull
    @Override
    public Map<IBlockState, ModelResourceLocation> getStateModelLocations() {
        Map<IBlockState, ModelResourceLocation> map = new HashMap<>();
        for (int bite : BlockCake.BITES.getAllowedValues())
            map.put(getDefaultState().withProperty(BlockCake.BITES, bite), new ModelResourceLocation(new ResourceLocation(FoodCraftReloadedMod.MODID, "fruit_cake"), "bites=" + bite));
        return map;
    }

    @Override
    public int getTintIndex() {
        return 0;
    }

    @Nonnull
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(FoodCraftReloadedMod.getProxy().getLoaderManager().getLoader(FruitEnumLoader.class).get().getInstance(ItemFruitCake.class, fruitType));
    }
}
