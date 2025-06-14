public class LiquidContainer extends Container implements IHazardNotifier {
    private boolean isHazardous;

    public LiquidContainer(double tareWeight, double height, double depth, double maxPayload, boolean isHazardous) {
        super(tareWeight, height, depth, maxPayload, "L");
        this.isHazardous = isHazardous;
    }

    @Override
    public void load(double mass) throws OverfillException {
        double maxAllowed = isHazardous ? maxPayload * 0.5 : maxPayload * 0.9;
        if (mass > maxAllowed) {
            notifyHazard("Overfill detected in " + serialNumber);
            throw new OverfillException("Exceeded allowed capacity");
        }
        this.cargoWeight = mass;
    }

    @Override
    public void unload() {
        cargoWeight = 0;
    }

    @Override
    public void notifyHazard(String message) {
        System.out.println("[HAZARD] " + message);
    }
}

