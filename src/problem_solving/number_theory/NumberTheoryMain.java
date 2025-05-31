package problem_solving.number_theory;

import java.util.List;
import java.util.Scanner;

public class NumberTheoryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> divisors = NumberTheoryHelper.fasterFindDivisors(n);
        for(Integer divisor: divisors){
            System.out.print(divisor + " ");
        }
        System.out.println();
    }
}
