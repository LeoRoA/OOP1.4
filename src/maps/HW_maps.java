package maps;

import maps.product.Product;
import maps.product.ProductList;
import maps.product.Recipe;
import maps.product.RecipeList;

import java.util.*;

public class HW_maps {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    public static void task1() {
        Phonebook phonebook = new Phonebook();
        for (int i = 0; i < 20; i++) {
            phonebook.addContact(randomFio(), randomNumber());
        }
        System.out.println(phonebook);
    }

    private static String randomNumber() {
        Random random = new Random();
        StringBuffer strBuffer = new StringBuffer("9");
        for (int i = 0; i < 9; i++) {
            strBuffer.append(random.nextInt(10));
        }
        return "+7" + strBuffer;
    }

    public static String randomFio() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String fullName = "";
        char[] FIO = new char[2];
        for (int i = 0; i < FIO.length; i++) {
            FIO[i] = alphabet.charAt((int) (Math.random() * alphabet.length()));
            fullName += (FIO[i]);
        }
        return fullName.toUpperCase();
    }

    public static void task2() {

        Product banana = new Product("banana", 79f, 5);
        Product apple = new Product("apple", 98f, 3);
        Product cheese = new Product("cheese", 780f, 1);
        Product yogurt = new Product("yogurt", 56, 1);

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(apple);
        productList.addProduct(yogurt);
        productList.addProduct(cheese);


//            System.out.println(productList);

        Recipe recipe = new Recipe("Recipe", Map.of(banana, 2, apple, 1));
        Recipe recipe1 = new Recipe("Recipe1", Map.of(banana, 3, cheese, 1));
        Recipe recipe2 = new Recipe("Recipe2", Map.of(yogurt, 1, apple, 1));

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe);
        recipeList.addRecipe(recipe1);
        recipeList.addRecipe(recipe2);

//        System.out.println(recipe.getSum());

        System.out.println(recipeList);
    }

    public static void task3() {
        Unit units = new Unit();

        units.addUnit("asd", 5);
        units.addUnit("psd", 6);
        units.addUnit("vsd", 2);
        units.addUnit("asd", 1);
        units.addUnit("xsd", 3);
        units.addUnit("fsd", 5);
//        units.addUnit("psd",6);

        System.out.println(units);
    }

    public static void task4() {
        Transformation secondCollection = new Transformation();
        Transformation firstCollection = new Transformation();

//        List<Integer> numbers = new ArrayList<>(3);
        firstCollection.addElement("first");
        firstCollection.addElement("second");
        firstCollection.addElement("third");
        firstCollection.addElement("forth");
        firstCollection.addElement("fifth");

//        System.out.println(firstCollection);
        secondCollection.putSecondCollection();

        secondCollection.printSecondCollection();

//        Iterator<Map.Entry<String, List<Integer>>> firstCollectionIterator = HashMap.entrySet().iterator();

    }

    public static void task5() {
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>(10);

        for (int i = 1; i <= 10; i++) {
            linkedMap.put(i, randomFio());
        }

        for (Map.Entry<Integer, String> iterator : linkedMap.entrySet()) {
            System.out.println(iterator.getKey() + " -> " + iterator.getValue());
        }

    }
}
