import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        boolean isFound = false;
        for (int i = 0; i < n; ++i) {
            if(arr[i] == target){
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println("Target found");
        }else{
            System.out.println("Target not found");
        }

    }
}