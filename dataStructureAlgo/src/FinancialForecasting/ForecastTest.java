package FinancialForecasting;

public class ForecastTest {

    public static void main(String[] args) {

        double presentValue = 1000;
        double growthRate = 0.10;      // 10%
        int years = 5;

        double result = FinancialForecast.futureValue(presentValue, growthRate, years);

        System.out.println("Present Value : " + presentValue);
        System.out.println("Growth Rate : " + (growthRate * 100) + "%");
        System.out.println("Years : " + years);
        System.out.println("Future Value : " + result);

    }
}
// Recursion is : A method calling itself until a base condition is reached.


/*Time Complexity

There is one recursive call for each year.

T(n) = T(n-1) + O(1)
 Time Complexity = O(n)*/
