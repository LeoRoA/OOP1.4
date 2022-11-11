package sets.passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final LocalDate localDate;

    public Passport(int number, String firstName, String middleName, String lastName, LocalDate localDate) {
        this.number = number;
        if (firstName == null || firstName.isEmpty() || firstName.isBlank()) {
            throw new IllegalArgumentException("Не указано имя");
        } else {
            this.firstName = firstName;;
        }
        if (lastName == null || lastName.isEmpty() || lastName.isBlank()) {
            throw new IllegalArgumentException("Не указана фамилия");
        } else {
            this.lastName = lastName;
        }
        this.middleName = middleName;

        if (localDate == null) {
            throw new IllegalArgumentException("Не указана дата рождения");
        } else {
            this.localDate = localDate;;
        }

    }

    public int getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String toString() {
        return String.format("Паспорт номер %d, принадлежит %s %s %s, дата рождения: %s\n",number, firstName, middleName, lastName, localDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getFirstName(), getMiddleName(), getLastName(), getLocalDate());
    }
}
