package lists.Transport;

import lists.Persons.Driver;
import lists.Persons.DriverB;
import lists.Persons.Mechanic;
import lists.Persons.Sponsor;
import transport.Competing;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    private final BodyType bodyType;


    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + "починена");
    }

    @Override
    public void setDriver(List<Driver<?>> driversB) {
        for (Driver<?> driverB : driversB) {
            if (driverB.getLicenseCategory().equals("B")) {
                driver = driverB;
//                driversB.remove(driverB);
                break;
            }
        }
    }

    @Override
    public void addMechanic(List<Mechanic> mechanics) {
        for (Mechanic mechanic : mechanics)
            if (mechanic.fixesCar) {
                mechanicList.add(mechanic);
            }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new DiagException("Автомобиль " + getBrand() + " " + getModel() + " не прошел диагностику");
        } else System.out.println("Автомобиль " + getBrand() + " " + getModel() + " прошел диагностику");
    }

    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Недостаточно данных");
        }
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void startRace() {

    }

    @Override
    public void stopRace() {

    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int doPitStop() {
        return 0;
    }

    @Override
    public int getBestCircle() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType=" + bodyType +
                '}';
    }
}
