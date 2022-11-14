package transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        this.brand = ValidationUtil.valOrDefString(brand, "default");
        this.model = ValidationUtil.valOrDefString(model, "default");
        this.engineVolume = ValidationUtil.valOrDefDouble(engineVolume, 1.5);
    }

    public abstract void passDiagnostics();

    public abstract void startRace();

    public abstract void stopRace();

    public abstract void printType();

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
}
