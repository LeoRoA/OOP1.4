package transport;

import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private final String FIO;

    private final char licenseCategory;

    private final int experience;

    private final T car;

    protected Driver(String FIO, char licenseCategory, int experience, T car) {
        this.FIO = ValidationUtil.valOrDefString(FIO, "noname");
        this.licenseCategory = licenseCategory;
        this.experience = ValidationUtil.valOrDefInt(experience, 0);
        this.car = car;
    }

    public void startRace() {

    }

    public void stopRace() {

    }

    public void refill() {

    }

    public String getFIO() {
        return FIO;
    }

    public char getLicenseCategory() {
        return licenseCategory;
    }

    public int getExperience() {
        return experience;
    }

    public T getCar() {
        return car;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                this.getFIO(), this.car.getBrand(), this.car.getModel());
    }
}
