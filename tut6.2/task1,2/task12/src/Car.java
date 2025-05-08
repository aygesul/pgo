public class Car extends Vehicle {
    int numberOfSeats;

    public void getNumberOfSeats() {
        System.out.println("Number of Seats in Car: " + numberOfSeats);
    }

    @Override
    public void start() {

        System.out.println("Car starts");
    }

    @Override
    public void stop() {

        System.out.println("Car stops");
    }
}
