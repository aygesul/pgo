public class Main {
    public static void main(String[] args) {
        try {
            LiquidContainer l1 = new LiquidContainer(1000, 250, 300, 5000, true);
            l1.load(2000);

            GasContainer g1 = new GasContainer(900, 200, 300, 4000, 10);
            g1.load(3000);

            RefrigeratedContainer r1 = new RefrigeratedContainer(1200, 260, 320, 4500, "Bananas", 5, 6);
            r1.load(4000, "Bananas");

            ContainerShip ship = new ContainerShip("Voyager", 20, 10, 30000);
            ship.addContainer(l1);
            ship.addContainer(g1);
            ship.addContainer(r1);

            ship.printInfo();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
