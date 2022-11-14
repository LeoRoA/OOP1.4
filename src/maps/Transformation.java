package maps;

import java.util.*;

public class Transformation {
    private static final Map<String, List<Integer>> firstCollection = new HashMap<>();
    private static final Map<String, Integer> secondCollection = new HashMap<>();
    private final Random random = new Random();

    public void addElement(String nameElement) {
        if (firstCollection.containsKey(nameElement)) {
            throw new IllegalArgumentException("Элемент c таким значением уже существует");
        } else {
            firstCollection.put(nameElement,
                    List.of(random.nextInt(1000),
                            random.nextInt(1000),
                            random.nextInt(1000)));
            System.out.println(nameElement + "  -> " + firstCollection.get(nameElement));
                    }

    }
    public void putSecondCollection(){
        
        for (Map.Entry<String, List<Integer>> stringIntegerEntry : firstCollection.entrySet()) {
            String name = stringIntegerEntry.getKey();
            Integer sum = stringIntegerEntry.getValue().stream().reduce(0, Integer::sum);
            secondCollection.put(name, sum);
        }
    }
    public void printSecondCollection() {
        System.out.println("second:");
        for (Map.Entry<String, Integer> stringIntegerEntry : secondCollection.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + "  -> " + stringIntegerEntry.getValue());
        }

    }

    @Override
    public String toString() {
        for (Map.Entry<String, List<Integer>> stringIntegerEntry : firstCollection.entrySet()) {
            System.out.println(stringIntegerEntry);
        }

        return "";
    }

}
