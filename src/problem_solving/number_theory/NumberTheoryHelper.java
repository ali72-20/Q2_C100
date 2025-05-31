package problem_solving.number_theory;

import java.util.ArrayList;
import java.util.List;

public class NumberTheoryHelper {
    private NumberTheoryHelper() {}
    // O(n)
    public static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) divisors.add(i);
        }
        return divisors;
    }

    public static List<Integer> fasterFindDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        // O(Sqrt(n))
        for (int i = 1; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
