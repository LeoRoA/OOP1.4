package transport;

import java.util.Objects;

public class DriverC extends Driver<Truck> {

    public DriverC(String FIO, int experience, Truck car) {
        super(FIO, "C", experience, car);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
