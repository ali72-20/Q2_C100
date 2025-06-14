import solid.open_close.Fawery;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int LIMIT = 1000005;
    static boolean[] prime = new boolean[LIMIT];

    private static void seive() {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i < LIMIT; ++i) {
            if (prime[i]) {
                for (int j = i + i ; j < LIMIT; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        seive();
        int n = scanner.nextInt();
        while (n-- > 0){
            int x = scanner.nextInt();
            if(x < 0) System.out.println("NO");
            else if(prime[x]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
