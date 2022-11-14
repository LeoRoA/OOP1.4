package maps;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private  final Map<String, String> phonebook = new HashMap<>();

    public void addContact(String fullName, String phoneNumber) {
        if (phonebook.containsKey(fullName) && phonebook.containsValue(phoneNumber)) {
            System.out.println("Объект с ключом " + fullName + " и значением " + phoneNumber + " уже существует");
        } else {
            phonebook.put(fullName, phoneNumber);
        }
    }

    @Override
    public String toString() {
        int i = 1;
        for (Map.Entry entry : phonebook.entrySet()) {
            System.out.println(i + " " + entry.getKey() + " " + entry.getValue());
            i++;
        }
        return "";
    }
}


