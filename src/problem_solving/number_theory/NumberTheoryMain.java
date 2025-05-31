
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberTheoryMain {
    static List<Integer> findDivisors(long n) {
        List<Integer> divisors = new ArrayList<>();
        for(long i = 1; i * i <= n ; ++i){
            if(n % i == 0){
                divisors.add((int) i);
                if(n / i != i){
                    divisors.add((int)((int)n / i));
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        List<Integer> divisors = findDivisors(n);
        Collections.sort(divisors);
        for(int divisor: divisors){
            System.out.println(divisor);
        }
    }
}
