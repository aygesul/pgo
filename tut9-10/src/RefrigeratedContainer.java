public class RefrigeratedContainer extends Container {
    private String productType;
    private double requiredTemp;
    private double currentTemp;

    public RefrigeratedContainer(double tareWeight, double height, double depth, double maxPayload,
                                 String productType, double requiredTemp, double currentTemp) {
        super(tareWeight, height, depth, maxPayload, "C");
        this.productType = productType;
        this.requiredTemp = requiredTemp;
        this.currentTemp = currentTemp;
    }

    public void load(double mass, String incomingType) throws OverfillException {
        if (!incomingType.equals(productType)) {
            throw new OverfillException("Mismatched product type");
        }
        if (currentTemp < requiredTemp) {
            throw new OverfillException("Temperature too low");
        }
        if (mass > maxPayload) {
            throw new OverfillException("Too much mass");
        }
        cargoWeight = mass;
    }

    @Override
    public void load(double mass) throws OverfillException {
        throw new UnsupportedOperationException("Use the load(mass, type) method for refrigerated container");
    }

    @Override
    public void unload() {
        cargoWeight = 0;
    }
}

