package lists.Supermarket;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CashRegister {
    private final static Random RANDOM = new Random();
    private final static Queue<String> firstRegistry = new LinkedList<>();
    private final static Queue<String> secondRegistry = new LinkedList<>();

    public static void addClient(String name) {
        if (firstRegistry.size() == 5 && secondRegistry.size() == 5) {
            System.out.println("Гаааааляяяяя!!!");
        } else if (firstRegistry.size() < secondRegistry.size()) {
            firstRegistry.add(name);
        } else {
            secondRegistry.add(name);
        }
    }

    public final static void deleteClient() {
        if (RANDOM.nextBoolean() && firstRegistry.size() != 0) {
            System.out.println("Удален " + firstRegistry.remove() + " из 1 очередни");
        } else if (secondRegistry.size() != 0) {
            System.out.println("Удален " + secondRegistry.remove() + " из 2 очередни");
        }
    }

}


