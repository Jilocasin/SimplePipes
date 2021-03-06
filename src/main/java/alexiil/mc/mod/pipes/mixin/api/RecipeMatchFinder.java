package alexiil.mc.mod.pipes.mixin.api;

import java.util.function.Consumer;

import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.world.World;

public final class RecipeMatchFinder {
    public final RecipeType<?> recipeType;
    public final Inventory inventory;
    public final World world;
    public final Consumer<Recipe<?>> consumer;

    /** If true then the {@link #consumer} will only use the first recipe given to it. */
    public final boolean single;

    public RecipeMatchFinder(RecipeType<?> recipeType, Inventory inventory, World world, Consumer<Recipe<?>> consumer,
        boolean single) {

        this.recipeType = recipeType;
        this.inventory = inventory;
        this.world = world;
        this.consumer = consumer;
        this.single = single;
    }
}
