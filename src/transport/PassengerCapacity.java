package transport;

public enum PassengerCapacity {
    SMALLEST(0, 10),
    SMALL(0, 25),
    MEDIUM(40, 50),
    HIGH(60, 80),
    HIGHEST(100, 120);

    private int capacityFrom;
    private int capacityTo;

    PassengerCapacity(int capacityFrom, int capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        String capacity = capacityFrom > 0 ? capacityFrom + " - " + capacityTo : "до " + String.valueOf(capacityTo);
        return "Вместимость пассажиров: " + capacity + " мест";
    }
}
