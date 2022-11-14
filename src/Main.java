import transport.*;

public class Main {
    public static void main(String[] args) {

        task4();

    }

    public static void task4() {
        Car Lada_Grande = new Car("Lada", "Grande", 0, BodyType.SEDAN);
        Car Kia_Rio = new Car("Kia", "Rio", 1.6, BodyType.HATCHBACK);
//        Car Hyundai_Solaris = new Car("Hyundai", "Solaris", 1.6);
//        Car Volkswagen_Polo = new Car("Volkswagen", "Polo", 1.6);
//
//        Truck Scania_R620 = new Truck("Scania", "R620", 13);
//        Truck MAN_TGS = new Truck("MAN", "TGS", 12.4);
        Truck Ford_FMAX = new Truck("Ford", "F-MAX", 12.7, LoadCapacity.N3);
//        Truck Iveco_Stralis = new Truck("Iveco", "Stralis", 12.9);

//        Bus Ford_Transit = new Bus("Ford", "Transit", 4);
//        Bus Peugeot_Boxer = new Bus("Peugeot", "Boxer", 3);
//        Bus Higer_KLQ6119TQ = new Bus("Higer", " KLQ6119TQ", 6);
        Bus Iveco_Daily = new Bus("Iveco", "Daily", 3, PassengerCapacity.HIGH);


        DriverB Max = new DriverB("MDX", 13, Kia_Rio);
        DriverC Rey = new DriverC("RDO", 7, Ford_FMAX);
        DriverD Dom = new DriverD("DSG", 4, Iveco_Daily);

//        System.out.println(Max);
//        System.out.println(Rey);
//        System.out.println(Dom);
        Iveco_Daily.printType();
        Lada_Grande.printType();
        Ford_FMAX.printType();

        Iveco_Daily.passDiagnostics();
        Lada_Grande.passDiagnostics();
        Ford_FMAX.passDiagnostics();
    }
}