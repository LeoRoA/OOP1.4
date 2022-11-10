package sets.Transport;

public enum LoadCapacity {
    N1(0, 3.5),
    N2(3.5, 12),
    N3(12.0, 20);
    private final double capacityFrom;
    private final double capacityTo;

    LoadCapacity(double capacityFrom, double capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        return "Грузоподъемность: от " + capacityFrom +
                " до " + capacityTo;
    }
}
