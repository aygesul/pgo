public class GasContainer extends Container implements IHazardNotifier {
    private double pressure;

    public GasContainer(double tareWeight, double height, double depth, double maxPayload, double pressure) {
        super(tareWeight, height, depth, maxPayload, "G");
        this.pressure = pressure;
    }

    @Override
    public void load(double mass) throws OverfillException {
        if (mass > maxPayload * 0.9) {
            notifyHazard("Gas container overfill: " + serialNumber);
            throw new OverfillException("Gas over capacity");
        }
        cargoWeight = mass;
    }

    @Override
    public void unload() {
        cargoWeight *= 0.05;
    }

    @Override
    public void notifyHazard(String message) {
        System.out.println("[HAZARD] " + message);
    }
}

