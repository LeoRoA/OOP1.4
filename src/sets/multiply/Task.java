package sets.multiply;

import java.util.Objects;

public class Task {
    private final int value1;
    private final int value2;



    public Task(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return (value1 == task.value1 && value2 == task.value2) ||
                (value1 == task.value2 && value2 == task.value1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1 * value2, value1+value2);
    }

    @Override
    public String toString() {
        return String.format("%d * %d = ?\n",
                value1,value2);
    }
}
