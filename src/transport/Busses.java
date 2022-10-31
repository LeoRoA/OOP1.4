package transport;

public class Busses extends Transport implements Competing {
    public Busses(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
