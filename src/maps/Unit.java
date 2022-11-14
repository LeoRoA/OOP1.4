package maps;

import java.util.HashMap;

import java.util.Map;

public class Unit {

    private final Map<String, Integer> units = new HashMap<>();

    public void addUnit(String unitName, Integer unitNumber) {
        if (units.containsKey(unitName) && units.containsValue(unitNumber)) {
            throw new IllegalArgumentException("Unit c таким значением уже существует");
        } else if (units.containsKey(unitName)) {
            Integer value = units.get(unitName);
            System.out.println("Для объекта с ключом " + unitName + " значение " +
                    value + " заменено на значение " + unitNumber);
            units.replace(unitName, value, unitNumber);
        } else {
            units.put(unitName, unitNumber);
        }

    }

    @Override
    public String toString() {
        int i = 1;
        for (Map.Entry entry : units.entrySet()) {
            System.out.println(i + " " + entry.getKey() + " " + entry.getValue());
            i++;
        }
        return "";
    }
}


