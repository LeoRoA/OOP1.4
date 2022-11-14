package sets.Transport;

import sets.Persons.Driver;
import sets.Persons.Mechanic;
import transport.Competing;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    private final BodyType bodyType;


    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

    }

    @Override
    public int getBestCircle() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + "починена");
    }

    @Override
    public void setDriver(Set<Driver<?>> driversB) {
        for (Driver<?> driverB : driversB) {
            if (driverB.getLicenseCategory().equals("B")) {
                driver = driverB;
//                driversB.remove(driverB);
                break;
            }
        }
    }

    @Override
    public void addMechanic(Set<Mechanic> mechanics) {
        for (Mechanic mechanic : mechanics)
            if (mechanic.fixesCar) {
                mechanicList.add(mechanic);
            }
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
    public int doPitStop() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", "
                + bodyType;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
