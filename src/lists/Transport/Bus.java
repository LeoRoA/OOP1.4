package lists.Transport;

import lists.Persons.Driver;
import lists.Persons.DriverD;
import lists.Persons.Mechanic;
import lists.Persons.Sponsor;
import lists.Transport.Competing;

import java.util.List;

public class Bus extends Transport implements Competing {

    private final PassengerCapacity passCapacity;

    public Bus(String brand, String model, double engineVolume,
               PassengerCapacity passCapacity) {
        super(brand, model, engineVolume);
        this.passCapacity = passCapacity;
    }

    @Override
    public void setDriver(List<Driver<?>> driversD) {
        for (Driver<?> driverD : driversD) {
            if (driverD.getLicenseCategory().equals("D")) {
                driver = driverD;
//                driversD.remove(driverD);
                break;
            }
        }
    }

    @Override
    public void addMechanic(List<Mechanic> mechanics) {
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
