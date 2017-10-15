package net.infstudio.foodcraftreloaded.init.food;

import net.infstudio.foodcraftreloaded.item.food.*;
import net.infstudio.foodcraftreloaded.util.loader.annotation.RegFood;

@SuppressWarnings("unused")
public interface FCRFoods {
    @RegFood(modifier = {0.2f, 0.6f, 0f, 0f, 0.7f}, name = {"tomato", "and", "eggs"})
    ItemPFood TOMATO_AND_EGGS = new ItemPFood();

    // <------ MEAL ------>
    // Rice
    ItemRiceF WHITE_RICE = new ItemRiceF(2, "white");

    // Porridge
    ItemPorridge RICE_PORRIDGE = new ItemPorridge(3, "rice");
    ItemPorridge BLACK_RICE_PORRIDGE = new ItemPorridge(6, "black", "rice");
    ItemPorridge DATE_BEAN_MILK_PORRIDGE = new ItemPorridge(7, "date", "bean", "milk");
    ItemPorridge GREENS_PORRIDGE = new ItemPorridge(6, "greens", "porridge");
    ItemPorridge MINCED_PORK_AND_PRESERVED_EGG_PORRIDGE = new ItemPorridge(10, "minced", "pork", "and", "preserved", "egg");
    ItemPorridge SHRIMP_CELERY_PORRIDGE = new ItemPorridge(10, "shrimp", "celery");
    ItemPorridge MUSHROOM_CHICKEN_PORRIDGE = new ItemPorridge(10, "mushroom", "chicken");
    ItemPorridge LABA_PORRIDGE = new ItemPorridge(7, "laba");
    ItemPorridge BEEF_EGG_PORRIDGE = new ItemPorridge(10, "beef", "egg");
    ItemPorridge PUMPKIN_PORRIDGE = new ItemPorridge(6, "pumpkin");
    ItemPorridge RED_SWEET_POTATO_PORRIDGE = new ItemPorridge(6, "red", "sweet", "potato");
    ItemPorridge WHITE_SWEET_POTATO_PORRIDGE = new ItemPorridge(6, "white", "sweet", "potato");
    ItemPorridge TOMATO_AND_EGG_PORRIDGE = new ItemPorridge(7, "tomato", "and", "egg");
    ItemPorridge WHITE_RADISH_PORRIDGE = new ItemPorridge(6, "white", "radish");

    // Soup
    ItemSoup CABBAGE_SOUP = new ItemSoup(6, "cabbage");
    ItemSoup LETTUCE_SOUP = new ItemSoup(4, "lettuce");
    ItemSoup EGGPLANT_SOUP = new ItemSoup(5, "eggplant");
    ItemSoup CORN_SOUP = new ItemSoup(5, "corn");
    ItemSoup BEAN_SOUP = new ItemSoup(4, "bean");
    ItemSoup FRUIT_SOUP = new ItemSoup(4, "fruit");
    ItemSoup WHITE_RADISH_SOUP = new ItemSoup(5, "white", "radish");
    ItemSoup RED_PEPPER_SOUP = new ItemSoup(2, "red", "pepper");
    ItemSoup GREEN_PEPPER_SOUP = new ItemSoup(2, "green", "pepper");
    ItemSoup FACING_HEAVEN_PEPPER_SOUP = new ItemSoup(2, "facing", "heaven", "pepper");
    ItemSoup LOTUS_ROOT_PORK_SOUP = new ItemSoup(10, "lotus", "root", "pork");
    ItemSoup TOMATO_AND_EGG_SOUP = new ItemSoup(5, "tomato", "and", "egg");
    ItemSoup MUSHROOM_CHICKEN_SOUP = new ItemSoup(10, "mushroom", "chicken");
    ItemSoup CREAM_MUSHROOM_SOUP = new ItemSoup(6, "cream", "mushroom");
    ItemSoup PUMPKIN_SOUP = new ItemSoup(5, "pumpkin");
    ItemSoup CABBAGE_LAMB_SOUP = new ItemSoup(10, "cabbage", "lamb");
    ItemSoup FISH_TOFU_SOUP = new ItemSoup(10, "fish", "tofu");
    ItemSoup OAT_SOUP = new ItemSoup(5, "oat");

    // Solid soup
    ItemSoup BLACK_SESAME_PASTE = new ItemSoup(5, "black", "sesame", "paste");
    ItemSoup MILK_OAT_SOUP = new ItemSoup(6, "milk", "oat");
    ItemSoup LOTUS_ROOT_STARCH = new ItemSoup(5, "lotus", "root", "starch");
    ItemSoup DOUBLE_SKIN_MILK = new ItemSoup(5, "double", "skin", "milk");
    ItemSoup EGG_SOUP = new ItemSoup(5, "egg");
    ItemSoup GOOSE_EGG_SOUP = new ItemSoup(5, "goose", "egg");

    // Noodles
    ItemNoodles NOODLES = new ItemNoodles(3);
    ItemNoodles CUTTING_NOODLES = new ItemNoodles(4, "cutting");
    ItemNoodles JAPANESE_UDON_NOODLES = new ItemNoodles(10, "japanese", "udon");
    ItemNoodles RICE_FLOUR_NOODLES = new ItemNoodles(3, "rice", "flour");
    ItemNoodles FRAGRANT_CHICKEN_BRIDGE_NOODLES = new ItemNoodles(10, "fragrant", "chicken", "bridge");
    ItemNoodles BEEF_SWEET_POTATO_NOODLES = new ItemNoodles(10, "beef", "sweet", "potato");
    ItemNoodles MEAT_RESIDUE_NOODLES = new ItemNoodles(10, "meat", "residue");
    ItemNoodles CHICKEN_GUILIN_RICE_NOODLES = new ItemNoodles(10, "chicken", "guilin", "rice");
    ItemNoodles YANG_CHUN_NOODLES = new ItemNoodles(6, "yang", "chun");
    ItemNoodles FRIED_NOODLES = new ItemNoodles(6, "fried");
    ItemNoodles TOMATO_AND_EGGS_VERMICELLI_NOODLES = new ItemNoodles(6, "tomato", "and", "eggs", "vermicelli");
    ItemNoodles TOMATO_AND_EGGS_SPAGHETTI_NOODLES = new ItemNoodles(6, "tomato", "and", "eggs", "spaghetti");
    ItemNoodles BOWEL_FLOUR_NOODLES = new ItemNoodles(5, "bowel", "flour");
    ItemNoodles PORK_FRIED_RIVER_FLOUR_NOODLES = new ItemNoodles(10, "pork", "fried", "river", "flour");
    ItemNoodles PORK_FRIED_RICE_FLOUR_NOODLES = new ItemNoodles(10, "pork", "fried", "rice", "flour");
    ItemNoodles SAUCE_NOODLES = new ItemNoodles(10, "sauce");
}
