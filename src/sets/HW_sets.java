package sets;

import sets.Transport.*;
import sets.Persons.*;
import sets.multiply.MultiplicationTable;
import sets.passport.Passport;
import sets.passport.PassportList;
import sets.product.Product;
import sets.product.ProductList;
import sets.product.Recipe;
import sets.product.RecipeList;

import java.time.LocalDate;
import java.util.*;

public class HW_sets {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1_2() {
        Product banana = new Product("banana", 79f, 2);
        Product apple = new Product("apple", 98f, 3);
        Product cheese = new Product("cheese", 780f, 1);
        Product banana2 = new Product("banana", 81, 1);

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(apple);
//        productList.addProduct(banana2);
        productList.addProduct(cheese);


        System.out.println(productList);

        Recipe recipe = new Recipe("Recipe", Set.of(banana, apple));
        Recipe recipe1 = new Recipe("Recipe1", Set.of(banana, cheese));
        Recipe recipe2 = new Recipe("Recipe2", Set.of(banana, apple));

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe);
        recipeList.addRecipe(recipe1);
        recipeList.addRecipe(recipe2);

        System.out.println(recipeList);
    }

    public static void task3() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }


    public static void task4() {

        Sponsor Torbo = new Sponsor("Teodor", 1000, true);
        Sponsor Mors = new Sponsor("MARS", 200000, false);
        Sponsor Cole = new Sponsor("ASA", 15000, false);
        Sponsor Cole2 = new Sponsor("ASA", 25000, false);

        Set<Sponsor> sponsors = new HashSet<>();

        Sponsor.addSponsorInSet(Torbo, sponsors);
        Sponsor.addSponsorInSet(Mors, sponsors);
        Sponsor.addSponsorInSet(Cole, sponsors);
        Sponsor.addSponsorInSet(Cole2, sponsors);

        Mechanic Jim = new Mechanic("JIM", "JiiBoo", true, false, false);
        Mechanic Sam = new Mechanic("SAM", "SAMON", true, false, false);
        Mechanic Dom = new Mechanic("DOM", "Family", false, true, true);
        Mechanic Mas = new Mechanic("SAM", "SAMON", true, false, false);

        Set<Mechanic> mechanics = new HashSet<>();
        Mechanic.addMechanicInSet(Jim, mechanics);
        Mechanic.addMechanicInSet(Sam, mechanics);
        Mechanic.addMechanicInSet(Dom, mechanics);
        Mechanic.addMechanicInSet(Mas, mechanics);

        Car Kia_Rio1 = new Car("Kia", "Rio", 1.6, BodyType.HATCHBACK);
        Car Kia_Rio2 = new Car("Kia", "Rio", 1.6, BodyType.HATCHBACK);
        Truck Ford_FMAX = new Truck("Ford", "F-MAX", 12.7, LoadCapacity.N3);
        Bus Iveco_Daily = new Bus("Iveco", "Daily", 3, PassengerCapacity.HIGH);
        Set<Transport> transports = new HashSet<>();

        Transport.addСarInSet(Kia_Rio1, transports);
        Transport.addСarInSet(Kia_Rio2, transports);
        Transport.addСarInSet(Ford_FMAX, transports);
        Transport.addСarInSet(Iveco_Daily, transports);

        DriverB Max = new DriverB("MDX", 13);
        DriverC Rey = new DriverC("RDO", 7);
        DriverD Dan = new DriverD("DSG", 4);
        DriverD Nad = new DriverD("DSG", 4);
        Set<Driver<?>> drivers = new HashSet<>();

        Driver.addDriverInSet(Max, drivers);
        Driver.addDriverInSet(Rey, drivers);
        Driver.addDriverInSet(Dan, drivers);
        Driver.addDriverInSet(Nad, drivers);

        System.out.println(mechanics);
        System.out.println(drivers);
        System.out.println(sponsors);
        System.out.println(transports);
    }

    public static void task5() {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
    }

    public static void task6() {
        Passport passport1 = new Passport(1111, "Fir", "", "St", LocalDate.parse("1991-12-01"));
        Passport passport2 = new Passport(1112, "Se", "Co", "Nd", LocalDate.parse("1992-12-01"));
        Passport passport3 = new Passport(1112, "Thi", "R", "D", LocalDate.parse("1993-12-01"));
        Passport passport4 = new Passport(1111, "La", "S", "T", LocalDate.parse("1993-12-01"));

        PassportList passportLists = new PassportList();
        PassportList.addPassport(passport1);
        PassportList.addPassport(passport2);
        PassportList.addPassport(passport3);
        PassportList.addPassport(passport4);

        System.out.println(passportLists);


    }
}
