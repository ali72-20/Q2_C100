package problem_solving.number_theory;

import java.util.ArrayList;
import java.util.List;

public class NumberTheoryHelper {
    private NumberTheoryHelper() {
    }

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

    // O(n)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // O(sqrt(n))
    public static boolean fasterIsPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i < n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // O(sqrt(n))
    public static List<Integer> defaultPrimeFactorization(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i * i <= n; ++i) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }


    public static List<Pair<Integer,Integer>> primeFactorization (int n){
        List<Pair<Integer,Integer>> primeFactors = new ArrayList<>();
        for(int i = 2; i * i <= n; ++i){
            if(n % i == 0){
                Pair<Integer,Integer> pair = new Pair<>(i,0);
                while (n % i == 0){
                    pair.second++;
                    n/=i;
                }
                primeFactors.add(pair);
            }
        }
        if(n > 1){
            primeFactors.add(new Pair<>(n,1));
        }
        return primeFactors;
    }

    // 1 2 3 4 5 6 10 12 15 20 30 60
    // 2 ^ 1
    // 2 ^ 2
    // 2 ^ 1 * 3 ^ 1
    // 2 ^ 1 * 5 ^ 1

}