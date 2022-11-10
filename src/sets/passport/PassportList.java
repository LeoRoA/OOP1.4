package sets.passport;

import sets.product.Product;

import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private static final Set<Passport> passports = new HashSet<>();

    public static void addPassport(Passport passport) {
        if (passports.isEmpty()) {
            passports.add(passport);
        } else {
            for (Passport addedPassport : passports) {
                if (addedPassport.getNumber() == passport.getNumber()) {
                    System.out.println("Обнаружен дубликат:"+addedPassport);
                    passports.remove(addedPassport);
                    passports.add(passport);
                    break;
                }
            }
            passports.add(passport);
        }
    }

    public Passport findByNumber(int number) {
        for (Passport passport : passports) {
            if (passport.getNumber() == number)
                return passport;
        }
        return null;
    }

    public String toString() {
        System.out.println("PassportList: ");
        for (Passport passport : this.passports) {
            System.out.println(passport);
        }
        return "";
    }
}
