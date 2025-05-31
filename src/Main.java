import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n % 2 == 0){
            int needed = n/2;
            System.out.println(needed);
           while (needed -- > 0){
               System.out.print(2 + " ");
           }
        }else{
            n-=3;
            System.out.println((n / 2) + 1);
            for(int i = 0;i < n / 2; ++i){
                System.out.print(2 + " ");
            }
            System.out.println(3);
        }
    }
}
