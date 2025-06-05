public interface Rentable {
    int maximumRentDays = 14;

    boolean isAvailable();
    boolean rent();
    void returnItem();

    static double calculateLateFee(int daysLate) {
        return 0.50 * daysLate;
    }


}

