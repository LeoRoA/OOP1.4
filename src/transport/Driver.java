package transport;

import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private final String FIO;

    private String licenseCategory;

    private final int experience;

    private final T car;

    protected Driver(String FIO, String licenseCategory, int experience, T car) {
        this.FIO = ValidationUtil.valOrDefString(FIO, "noname");
        setLicenseCategory(licenseCategory);
        this.experience = ValidationUtil.valOrDefInt(experience, 0);
        this.car = car;
    }

    public void startRace() {

    }

    public void stopRace() {

    }

    public void refill() {

    }

    public void setLicenseCategory(String licenseCategory) {
        if (licenseCategory == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        } else {
            this.licenseCategory = licenseCategory;
        }
    }

    public String getFIO() {
        return FIO;
    }

    public String getLicenseCategory() {
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
