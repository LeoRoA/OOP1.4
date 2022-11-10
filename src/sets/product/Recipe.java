package sets.product;

import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private final Set<Product> products;
    private float sum;


    public Recipe(String name, Set<Product> products) {
        if (name == null || name.isEmpty() || products.size() == 0 || products == null){
            throw new IllegalArgumentException("Недостаточно данных");
        }
        this.name = name;
        this.products = products;
    }

    public float setSum(float sum) {
        for (Product product:products){
            sum += product.getPrice()*product.getAmount();
        }
        return sum;
    }

    public float getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
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

    @Override
    public String toString() {
        return String.format("Рецепт %s включает следующие ингрдидиенты: %s",getName(),getProducts());
    }
}
