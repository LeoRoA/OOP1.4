package sets.product;

import java.util.Objects;

public class Product {
    private final String name;
    private final float price;
    private final int amount;

    private boolean checkBuying;

    public Product(String name, float price, int amount) {
        if (name == null || name.isEmpty() || price<0 || amount<0){
            throw new IllegalArgumentException("Недостаточно данных");
        }
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.checkBuying = false;
    }

    public void setCheckBuying() {
        this.checkBuying = true;
    }

    public boolean isCheckBuying() {
        return checkBuying;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%s, Цена - %.2f, количество: %d",name, price,  amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
