package maps.product;

import java.util.*;


public class RecipeList {
    private final Map<Integer, Recipe> recipes = new HashMap<>();

    public void addRecipe(Recipe recipe) {
        Iterator<Map.Entry<Integer, Recipe>> recipeIterator = this.recipes.entrySet().iterator();
        int i = 1;
        if (recipes.isEmpty()) {
            recipes.put(1, recipe);
        } else {

            while (recipeIterator.hasNext()) {
                if (recipeIterator.next().getValue().equals(recipe.getName())) {
                    throw new IllegalArgumentException("Такой рецепт уже существует" + recipe.getName());
                } else {
                    recipes.put(recipes.size() + 1, recipe);
                        break;
                }
            }
        }
    }


    public String toString() {
        System.out.println("RecipeList: ");
        Iterator<Map.Entry<Integer, Recipe>> iterator = recipes.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipeList)) return false;
        RecipeList that = (RecipeList) o;
        return recipes.equals(that.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipes);
    }
}
