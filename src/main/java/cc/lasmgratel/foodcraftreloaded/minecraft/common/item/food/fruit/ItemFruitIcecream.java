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

package cc.lasmgratel.foodcraftreloaded.minecraft.common.item.food.fruit;

import cc.lasmgratel.foodcraftreloaded.minecraft.client.util.masking.CustomModelMasking;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.FoodCraftReloadedMod;
import cc.lasmgratel.foodcraftreloaded.minecraft.api.init.FCRCreativeTabs;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.item.food.FCRItemFood;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.util.Translator;
import cc.lasmgratel.foodcraftreloaded.minecraft.common.util.enumeration.FruitTyped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ItemFruitIcecream extends FCRItemFood implements FruitTyped, CustomModelMasking {
    private FruitType fruitType;

    public ItemFruitIcecream(FruitType fruitType) {
        super(5, 1.0f, false);
        setRegistryName(FoodCraftReloadedMod.MODID, fruitType.toString() + "_icecream");
        setCreativeTab(FCRCreativeTabs.SNACK);
        this.fruitType = fruitType;
    }

    @Nonnull
    @Override
    public String getItemStackDisplayName(@Nonnull ItemStack stack) {
        return Translator.format("item.iceCream", Translator.format("item.fruit" + StringUtils.capitalize(fruitType.toString())));
    }

    @Override
    public FruitType getType() {
        return fruitType;
    }

    @Nullable
    @Override
    public ModelResourceLocation getModelLocation() {
        return new ModelResourceLocation(new ResourceLocation(FoodCraftReloadedMod.MODID, "ice_cream"), "inventory");
    }

    @Override
    public int getTintIndex() {
        return 1;
    }
}
