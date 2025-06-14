
    public abstract class Container {
        protected static int counter = 1;
        protected String serialNumber;
        protected double tareWeight, height, depth, maxPayload;
        protected double cargoWeight = 0;

        public Container(double tareWeight, double height, double depth, double maxPayload, String typeCode) {
            this.tareWeight = tareWeight;
            this.height = height;
            this.depth = depth;
            this.maxPayload = maxPayload;
            this.serialNumber = "KON-" + typeCode + "-" + (counter++);
        }

        public abstract void load(double mass) throws OverfillException;
        public abstract void unload();

        public String getSerialNumber() {
            return serialNumber;
        }

        public double getTotalWeight() {
            return tareWeight + cargoWeight;
        }

        public void printInfo() {
            System.out.println("Serial: " + serialNumber);
            System.out.println("Total Weight: " + getTotalWeight());
        }
    }


