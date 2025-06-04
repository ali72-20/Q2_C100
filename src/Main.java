
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Pair<E, T> {
        public E first;
        public T second;

        public Pair(E first, T second) {
            this.first = first;
            this.second = second;
        }
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            List<Pair<Integer,Integer>> list = primeFactorization(n);
            if(list.isEmpty() || list.get(0).first != 2){
                System.out.println(0);
                continue;
            }
            int ans = list.get(0).second;
            for(int i = 1;i < list.size(); ++i){
                ans*= (list.get(i).second + 1);
            }
            System.out.println(ans);
        }
    }
}