package transport;

import java.util.Objects;

public class DriversC<C extends Trucks & Competing> extends Drivers {

    public String nameTransport;

    public DriversC(String FIO, boolean isHaveDriveLicense, int experience, C nameObject) {
        super(FIO, isHaveDriveLicense, experience);
        setNameTransport(nameObject);
    }

    public void setNameTransport(C nameObject) {
        this.nameTransport = nameObject.getBrand() + " " + nameObject.getModel();
    }

    public String getNameTransport() {
        return nameTransport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriversC)) return false;
        if (!super.equals(o)) return false;
        DriversC<?> driversC = (DriversC<?>) o;
        return Objects.equals(nameTransport, driversC.nameTransport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameTransport);
    }

    @Override
    public String toString() {
        return "Водитель " + FIO +
                " управляет автомобилем " + nameTransport +
                " и будет участвовать в заезде";
    }
}
