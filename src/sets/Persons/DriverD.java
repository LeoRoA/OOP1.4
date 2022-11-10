package sets.Persons;

import sets.Transport.Bus;

public class DriverD extends Driver<Bus> {

    public DriverD(String FIO, int experience) {
        super(FIO, "D", experience);
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
