package sets.Transport;

import sets.Persons.Driver;
import sets.Persons.Mechanic;
import sets.Persons.Sponsor;

import java.util.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    Driver driver;
    final Set<Mechanic> mechanicList = new HashSet<>();
    final Set<Sponsor> sponsorList = new HashSet<>();


    public Transport(String brand, String model,
                     double engineVolume) {
        this.brand = ValidationUtil.valOrDefString(brand, "default");
        this.model = ValidationUtil.valOrDefString(model, "default");
        this.engineVolume = ValidationUtil.valOrDefDouble(engineVolume, 1.5);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void setDriver(Set<Driver<?>> drivers);

    public abstract void addMechanic(Set<Mechanic> mechanicList);

    public void addSponsor(Sponsor... sponsors) {
        sponsorList.addAll(List.of(sponsors));

    }

    public abstract void passDiagnostics();

    public abstract void startRace();

    public abstract void stopRace();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    public Driver getDriver() {
        return driver;
    }

    public Set<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public Set<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public void printPersons() {
        System.out.println("За автомобилем " + getBrand() + " " + getModel() +
                " закреплены следующие:\nВодитель: " + getDriver());
        for (Sponsor sponsor : sponsorList) {
            System.out.println(sponsor);
        }
        for (Mechanic mechanic : mechanicList) {
            System.out.println(mechanic);
        }
    }

    public static void addСarInSet(Transport transport, Set<Transport> transports) {
        if (transports.isEmpty()) {
            transports.add(transport);
        } else {
            for (Transport addedTransport : transports) {
                if (addedTransport.getBrand() == transport.getBrand() && transport.getModel() == transport.getModel()) {
                    System.out.println("Обновлены данные для " + addedTransport.getBrand() + " " + addedTransport.getModel());
                    transports.remove(addedTransport);
                    transports.add(transport);
                    break;
                }
            }
            transports.add(transport);
        }
    }

    @Override
    public String toString() {
//        printPersons();
        return brand + " " + model;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.getEngineVolume(), getEngineVolume()) == 0 && getBrand().equals(transport.getBrand()) && getModel().equals(transport.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }
}

