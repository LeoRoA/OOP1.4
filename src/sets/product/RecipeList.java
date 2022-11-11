package sets.product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


public class RecipeList {
    private final Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        Iterator<Recipe> recipeIterator = this.recipes.iterator();
        if (recipes.isEmpty()) {
            recipes.add(recipe);
        }else {
           while (recipeIterator.hasNext()) {
                Recipe next = recipeIterator.next();
                    if (next.getName().equals(recipe.getName())) {
                        throw new IllegalArgumentException("Такой рецепт уже существует"+recipe.getName());
                    } else {
                        recipes.add(recipe);
                        break;
                    }
                }
            }
        }


    public String toString() {
        System.out.println("RecipeList: ");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
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
