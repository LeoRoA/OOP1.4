package sets.Persons;

import sets.Transport.Car;

public class DriverB extends Driver<Car> {


    public DriverB(String FIO, int experience) {
        super(FIO, "B", experience);

    }
//    @Override
//    public String toString() {
//        return String.format("Водитель " + getFIO() + " со стажем " + getExperience() +
//                        " управляет автомобилем %s %s и будет участвовать в заезде",
//                Car.getBrand(), Car.getModel());
//
//
//}
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }

}
