package maps.product;

import java.util.*;



public class ProductList {
    private final HashMap<String, Integer> products = new HashMap();

    public void addProduct(Product product) {
        if (products.containsKey(product.getName())) {
            throw new ProductAlreadyExistsException("Продукт уже есть в списке");
        } else if (product.getAmount()<=0){
            int number = 1;
            products.put(product.getName(),number);
        } else{
            products.put(product.getName(),product.getAmount());
        }
    }

    public void checkProduct(Product product) {
        if (products.containsKey(product.getName())){
            product.setCheckBuying();
        }
    }

    public void removeProduct(String name) {
        Iterator<Map.Entry<String,Integer>> productIterator = this.products.entrySet().iterator();
        while (productIterator.hasNext()){
            if(productIterator.next().getKey().equals(name)){
                productIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("ProductList: ");
        Iterator<Map.Entry<String,Integer>> productIterator = this.products.entrySet().iterator();
        while (productIterator.hasNext()){
            System.out.println(productIterator.next());
        }
        return "";
    }
}
