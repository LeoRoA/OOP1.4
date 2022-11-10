package sets.product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new ProductAlreadyExistsException("Продукт уже есть в списке");
        } else this.products.add(product);
    }

    public void checkProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setCheckBuying();
                break;
            }

        }
    }

    public void removeProduct(String name) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()){
            if(productIterator.next().getName().equals(name)){
                productIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("ProductList: ");
        for (Product product: this.products) {
            System.out.println(product);
        }
        return "";
    }
}
