import sorting_algo.SortingAlgo;

import java.util.Scanner;

public class Main{
   static int fib(int n){
       if(n <= 1){
           return n;
       }
       return fib(n - 1) + fib(n - 2);
   }
   static int fn(int current, int ed){
       if(current == ed){
           return 1;
       }
       if(current > ed){
           return 0;
       }
       return fn(current + 1,ed) + fn(current + 2, ed) + fn(current + 3,ed);
   }
   // 5 --> x
    public static int fn(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fn(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; ++i){
            arr[i] = scanner.nextInt();
        }

        SortingAlgo.mergeSort(arr,0,n - 1);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}