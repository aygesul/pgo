import java.util.*;

public class ContainerShip {
    private String name;
    private int maxSpeed, maxContainerNum;
    private double maxWeight;
    private ArrayList<Container> containers = new ArrayList<>();

    public ContainerShip(String name, int maxSpeed, int maxContainerNum, double maxWeight) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxContainerNum = maxContainerNum;
        this.maxWeight = maxWeight;
    }

    public boolean addContainer(Container c) {
        if (containers.size() >= maxContainerNum || getTotalCargoWeight() + c.getTotalWeight() > maxWeight) {
            return false;
        }
        return containers.add(c);
    }

    public boolean removeContainer(String serial) {
        return containers.removeIf(c -> c.getSerialNumber().equals(serial));
    }

    public void printInfo() {
        System.out.println("Ship: " + name);
        System.out.println("Speed: " + maxSpeed + " knots");
        System.out.println("Containers:");
        for (Container c : containers) {
            c.printInfo();
            System.out.println();
        }
    }

    private double getTotalCargoWeight() {
        return containers.stream().mapToDouble(Container::getTotalWeight).sum();
    }
}
