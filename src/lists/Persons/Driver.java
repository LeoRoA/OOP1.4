package lists.Persons;

import lists.Transport.Transport;
import transport.ValidationUtil;

import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.drivers;

public abstract class Driver<T extends Transport> {
    public final List<Driver<?>> drivers = new ArrayList<>();
    private final String FIO;

    private String licenseCategory;

    private final int experience;

    private static Transport car;

    protected Driver(String FIO, String licenseCategory, int experience) {
        this.FIO = ValidationUtil.valOrDefString(FIO, "noname");
        setLicenseCategory(licenseCategory);
        this.experience = ValidationUtil.valOrDefInt(experience, 0);
        drivers.add(this);
    }

    public void startRace() {

    }

    public void stopRace() {

    }

    public void refill() {

    }

    public void addDriver(Driver<?> driver) {

        drivers.add(driver);
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

    public static void setCar(Transport transport) {
        car = transport;
    }

    public Transport getCar() {
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
        return "Водитель " + getFIO() + " со стажем " + getExperience() +
                " лет, управляет автомобилем категории " + getLicenseCategory() + " и будет участвовать в заезде";
    }


}
