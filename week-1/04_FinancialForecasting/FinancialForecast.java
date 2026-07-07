public class FinancialForecast {

    /**
     * Recursively calculates the future value of an investment.
     *
     * @param currentValue the value at the current year
     * @param growthRate   the annual growth rate (e.g., 0.05 for 5%)
     * @param years        number of years remaining to forecast
     * @return the future value after the given number of years
     */
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base case: no more years to grow
        if (years == 0) {
            return currentValue;
        }
        // Recursive case: grow the value by one year, then recurse
        double nextYearValue = currentValue * (1 + growthRate);
        return calculateFutureValue(nextYearValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 10000;   // e.g., starting investment amount
        double growthRate = 0.08;      // 8% annual growth
        int years = 5;

        double futureValue = calculateFutureValue(initialValue, growthRate, years);

        System.out.printf("Starting value: %.2f%n", initialValue);
        System.out.printf("Growth rate: %.0f%%%n", growthRate * 100);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);
    }
}
