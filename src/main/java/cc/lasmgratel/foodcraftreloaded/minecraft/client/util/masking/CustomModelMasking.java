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

package cc.lasmgratel.foodcraftreloaded.minecraft.client.util.masking;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

public interface CustomModelMasking {
    @Nullable
    default ModelResourceLocation getModelLocation() {
        return null;
    }

    @Nonnull
    default Map<IBlockState, ModelResourceLocation> getStateModelLocations() {
        return Collections.emptyMap();
    }

    default ItemMeshDefinition getItemMeshDefinition() {
        return null;
    }

    default int getTintIndex() {
        return -1;
    }

    @Nullable
    default IBlockColor getBlockColorMultiplier() {
        return null;
    }

    @Nullable
    default IItemColor getItemColorMultiplier() {
        return null;
    }
}
