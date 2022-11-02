package transport;

import java.util.Objects;

public class DriverD extends Driver<Bus> {

    public DriverD(String FIO, int experience, Bus car) {
        super(FIO, "D", experience, car);
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
