package transport;

import java.util.Objects;

public class DriverB extends Driver<Car> {


    public DriverB(String FIO, int experience, Car car) {
        super(FIO, "B", experience, car);

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
