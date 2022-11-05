package lists.Persons;

import lists.Transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String FIO, int experience) {
        super(FIO, "C", experience);
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
