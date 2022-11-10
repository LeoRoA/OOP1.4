package sets.Transport;

import sets.Persons.Driver;
import sets.Persons.Mechanic;
import sets.Transport.Competing;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing {


    public final LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new DiagException("Грузовик " + getBrand() + " " + getModel() + " не прошел диагностику");
        } else System.out.println(("Грузовик " + getBrand() + " " + getModel() + " прошел диагностику"));
    }

    public void printType() {
        if (loadCapacity != null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Недостаточно данных");
        }
    }

    @Override
    public void setDriver(Set<Driver<?>> driversС) {
        for (Driver<?> driverС : driversС) {
            if (driverС.getLicenseCategory().equals("С")) {
                driver = driverС;
//                driversС.remove(driverС);
                break;
            }
        }
    }

    @Override
    public void addMechanic(Set<Mechanic> mechanics) {
        for (Mechanic mechanic : mechanics) {
            if (mechanic.fixesTruck) {
                mechanicList.add(mechanic);
            }
        }
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + "починен");
    }

    @Override
    public void startRace() {

    }

    @Override
    public void stopRace() {

    }

    @Override
    public boolean service() {
        return false;
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
}
