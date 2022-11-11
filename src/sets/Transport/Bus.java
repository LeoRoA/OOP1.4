package sets.Transport;

import sets.Persons.Driver;
import sets.Persons.Mechanic;


import java.util.Set;

public class Bus extends Transport implements Competing {

    private final PassengerCapacity passCapacity;

    public Bus(String brand, String model, double engineVolume,
               PassengerCapacity passCapacity) {
        super(brand, model, engineVolume);
        this.passCapacity = passCapacity;
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
    public void setDriver(Set<Driver<?>> driversD) {
        for (Driver<?> driverD : driversD) {
            if (driverD.getLicenseCategory().equals("D")) {
                driver = driverD;
//                driversD.remove(driverD);
                break;
            }
        }
    }

    @Override
    public void addMechanic(Set<Mechanic> mechanics) {
        for (Mechanic mechanic : mechanics)
            if (mechanic.fixesBus) {
                mechanicList.add(mechanic);
            }
    }

    @Override
    public boolean service() {
        return true;
    }

    @Override
    public void repair() {

    }

    @Override
    public void passDiagnostics() {
        System.out.printf("Автобус %s %s в диагностике не требуется\n", getBrand(), getModel());
    }

    @Override
    public void printType() {
        if (passCapacity != null) {
            System.out.println(passCapacity);
        } else {
            System.out.println("Недостаточно данных");
        }
        ;
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
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
