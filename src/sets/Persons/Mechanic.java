package sets.Persons;

import sets.Transport.Transport;
import sets.Transport.ValidationUtil;

import java.util.Objects;
import java.util.Set;

public class Mechanic {
    public final String fullName;
    public final String company;
    public final boolean fixesCar;
    public final boolean fixesBus;
    public final boolean fixesTruck;

    public Mechanic(String fullName,
                    String company,
                    boolean fixesCar,
                    boolean fixesBus,
                    boolean fixesTruck) {
        this.fullName = ValidationUtil.valOrDefString(fullName, "Мистер Никто");
        this.company = ValidationUtil.valOrDefString(company, "Никакая компания");
        this.fixesCar = fixesCar;
        this.fixesBus = fixesBus;
        this.fixesTruck = fixesTruck;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean isFixesCar() {
        return fixesCar;
    }

    public boolean service(Transport transport) {
        return transport.service();
    }

    public void fixTransport(Transport transport) {
        transport.repair();
    }

    public boolean isFixesBus() {
        return fixesBus;
    }

    public boolean isFixesTruck() {
        return fixesTruck;
    }

    public static void addMechanicInSet(Mechanic mechanic, Set<Mechanic> mechanics) {
        if (mechanics.isEmpty()) {
            mechanics.add(mechanic);
        } else {
            for (Mechanic addedMechanic : mechanics) {
                if (addedMechanic.getFullName() == mechanic.getFullName()) {
                    System.out.println("Обновлены данные для " + addedMechanic.getFullName());
                    mechanics.remove(addedMechanic);
                    mechanics.add(mechanic);
                    break;
                }
            }
            mechanics.add(mechanic);
            ;
        }
    }

    @Override
    public String toString() {
        return fullName + " из компании " + company + " имеет доступ к обслуживаниваю " +
                " автомобилей: " + fixesCar +
                ", автобусов: " + fixesBus +
                ", грузовиков: " + fixesTruck + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic mechanic = (Mechanic) o;
        return isFixesCar() == mechanic.isFixesCar() && isFixesBus() == mechanic.isFixesBus() && isFixesTruck() == mechanic.isFixesTruck() && getFullName().equals(mechanic.getFullName()) && getCompany().equals(mechanic.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getCompany(), isFixesCar(), isFixesBus(), isFixesTruck());
    }
}
