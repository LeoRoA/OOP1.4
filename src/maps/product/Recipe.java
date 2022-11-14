package maps.product;

import java.util.*;

public class Recipe {
    private final String name;
    private final Map<Product, Integer> products;
    private float sum;


    public Recipe(String name, Map<Product,Integer> products) {
        if (name == null || name.isEmpty() || products.size() == 0 ){
            throw new IllegalArgumentException("Недостаточно данных");
        }
        this.name = name;
        this.products = products;
        this.sum = setSum();
    }

    public float getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public Map<Product,Integer> getProducts() {
        return products;
    }

    public float setSum() {
        float recipeSum = 0;
        for (Map.Entry<Product, Integer> productIntegerEntry : products.entrySet()) {
            Product product = productIntegerEntry.getKey();
            recipeSum += product.getPrice() * product.getAmount();
        }
        return recipeSum;
    }

    @Override
    public String toString() {
        return String.format("Рецепт %s включает следующие ингрдидиенты: %s, на следующую сумму %f",getName(),getProducts(),getSum());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(getName(), recipe.getName()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getProducts(), getSum());
    }
}
