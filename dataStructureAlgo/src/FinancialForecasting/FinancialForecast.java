package FinancialForecasting;

public class FinancialForecast {

    public static double futureValue(double presentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return presentValue;
        }

        // Recursive Call
        return futureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }
}