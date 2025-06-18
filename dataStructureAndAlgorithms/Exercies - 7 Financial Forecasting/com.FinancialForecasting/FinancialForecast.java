// FinancialForecast.java

public class FinancialForecast {

    // Recursive method to calculate future value
    // futureValue = presentValue * (1 + growthRate) ^ years
    public static double futureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValueRecursive(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized recursive method using memoization
    public static double futureValueMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) {
            return presentValue;
        }
        if (memo[years] != 0) {
            return memo[years];
        }
        memo[years] = futureValueMemo(presentValue * (1 + growthRate), growthRate, years - 1, memo);
        return memo[years];
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05; // 5% annual growth
        int years = 5;

        // Using simple recursion
        double result = futureValueRecursive(presentValue, growthRate, years);
        System.out.printf("Future value (recursive): %.2f\n", result);

        // Using memoization
        double[] memo = new double[years + 1];
        double resultMemo = futureValueMemo(presentValue, growthRate, years, memo);
        System.out.printf("Future value (memoized): %.2f\n", resultMemo);
    }
}

/*
Recursion Explanation:
Recursion is a technique where a method calls itself to solve smaller instances of a problem. 
It simplifies problems that can be broken down into similar subproblems, like calculating future value over years.

Time Complexity:
- The simple recursive approach has O(n) time complexity, where n is the number of years.
- However, without memoization, it may recompute values for overlapping subproblems.

Optimization:
- Memoization stores already computed results, avoiding redundant calculations and improving efficiency.
- For this problem, memoization is not strictly necessary since each year depends only on the previous year, but it's useful for more complex recursive relationships.
*/

