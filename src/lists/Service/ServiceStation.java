package lists.Service;

import lists.Transport.Bus;
import lists.Transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> serviceQueue = new LinkedList<>();

    public void addClient(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не обслуживаем");
        } else {
            serviceQueue.add(transport);
        }
    }

    public void service() {
        Transport next = serviceQueue.poll();
        if (next != null) {
            System.out.println("На обслуживании " + next.getBrand() + " " + next.getModel());
        }
    }
}
