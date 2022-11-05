package lists.Transport;

import lists.Persons.Driver;
import lists.Persons.Mechanic;
import lists.Persons.Sponsor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    Driver driver;
    final List<Mechanic> mechanicList = new ArrayList<>();
    final List<Sponsor> sponsorList = new ArrayList<>();


    public Transport(String brand, String model,
                     double engineVolume) {
        this.brand = ValidationUtil.valOrDefString(brand, "default");
        this.model = ValidationUtil.valOrDefString(model, "default");
        this.engineVolume = ValidationUtil.valOrDefDouble(engineVolume, 1.5);

    }

    public abstract void setDriver(List<Driver<?>> drivers);

    public abstract void addMechanic(List<Mechanic> mechanicList);

    public void addSponsor(Sponsor... sponsors) {
        sponsorList.addAll(List.of(sponsors));

    }

    public abstract void passDiagnostics();

    public abstract void startRace();

    public abstract void stopRace();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
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

    public Driver getDriver() {
        return driver;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public List<Sponsor> getSponsorList() {
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

    @Override
    public String toString() {
        printPersons();
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';

    }
}

