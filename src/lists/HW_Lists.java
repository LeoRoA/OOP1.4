package lists;

import lists.Persons.*;
import lists.Supermarket.CashRegister;
import lists.Transport.*;

import java.util.List;

import static lists.BDList.BDList.printBDList;

public class HW_Lists {
    public static void main(String[] args) {
        task1_2();

        task3();
        task4();

    }

    public static void task1_2() {


        Sponsor Torbo = new Sponsor("Teodor", 1000, true);
        Sponsor Mors = new Sponsor("MARS", 200000, false);
        Sponsor Cole = new Sponsor("ASA", 15000, false);
        List<Sponsor> sponsors = List.of(Torbo, Cole, Mors);

        Mechanic Jim = new Mechanic("JIM", "JiiBoo", true, false, false);
        Mechanic Sam = new Mechanic("SAM", "SAMON", true, false, false);
        Mechanic Dom = new Mechanic("DOM", "Family", false, true, true);

        List<Mechanic> mechanics = List.of(Jim, Sam, Dom);

        Car Kia_Rio1 = new Car("Kia", "Rio", 1.6, BodyType.HATCHBACK);
        Truck Ford_FMAX = new Truck("Ford", "F-MAX", 12.7, LoadCapacity.N3);
        Bus Iveco_Daily = new Bus("Iveco", "Daily", 3, PassengerCapacity.HIGH);
        List<Transport> transports = List.of(Kia_Rio1, Ford_FMAX, Iveco_Daily);

        DriverB Max = new DriverB("MDX", 13);
        DriverC Rey = new DriverC("RDO", 7);
        DriverD Dan = new DriverD("DSG", 4);
        List<Driver<?>> drivers = List.of(Max, Rey, Dan);


        Kia_Rio1.setDriver(drivers);
        Kia_Rio1.addMechanic(mechanics);
        Kia_Rio1.addSponsor(Cole, Mors);

        Ford_FMAX.setDriver(drivers);
        Ford_FMAX.addMechanic(mechanics);
        Ford_FMAX.addSponsor(Torbo, Mors);

        Iveco_Daily.setDriver(drivers);
        Iveco_Daily.addMechanic(mechanics);
        Iveco_Daily.addSponsor(Mors);

//        for (Sponsor sponsor : sponsors) {
//            System.out.println(sponsor);
//        }
//        for (Mechanic mechanic : mechanics) {
//            System.out.println(mechanic);
//        }
//        for (Driver driver : drivers) {
//            System.out.println(driver);
//        }
        Kia_Rio1.printPersons();
        Ford_FMAX.printPersons();
        Iveco_Daily.printPersons();
    }


    public static void task3() {
        for (int i = 0; i < 11; i++) {
            CashRegister.addClient(Integer.toString(i));
        }
        CashRegister.deleteClient();
        CashRegister.deleteClient();
    }

    public static void task4() {
        printBDList();
    }
}
