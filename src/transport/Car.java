package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    private final BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
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
