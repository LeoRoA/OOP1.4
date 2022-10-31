import transport.*;

public class Main {
    public static void main(String[] args) {

        task4();

    }

    public static void task4() {
        Cars Lada_Grande = new Cars("Lada", "Grande", 0);
        Cars Kia_Rio = new Cars("Kia", "Rio", 1.6);
        Cars Hyundai_Solaris = new Cars("Hyundai", "Solaris", 1.6);
        Cars Volkswagen_Polo = new Cars("Volkswagen", "Polo", 1.6);

        Trucks Scania_R620 = new Trucks("Scania", "R620", 13);
        Trucks MAN_TGS = new Trucks("MAN", "TGS", 12.4);
        Trucks Ford_FMAX = new Trucks("Ford", "F-MAX", 12.7);
        Trucks Iveco_Stralis = new Trucks("Iveco", "Stralis", 12.9);


        Busses Ford_Transit = new Busses("Ford", "Transit", 4);
        Busses Peugeot_Boxer = new Busses("Peugeot", "Boxer", 3);
        Busses Higer_KLQ6119TQ = new Busses("Higer", " KLQ6119TQ", 6);
        Busses Iveco_Daily = new Busses("Iveco", "Daily", 3);


        DriversB Max = new DriversB("MSD", true,13, Kia_Rio);
        DriversC Rey = new DriversC<>("RDO", true, 7, Ford_FMAX);
        DriversD Dom = new DriversD<>("DSG", true, 4, Iveco_Daily);

        System.out.println(Max);
        System.out.println(Rey);
        System.out.println(Dom);


    }
}