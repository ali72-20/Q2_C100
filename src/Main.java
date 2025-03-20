import java.util.Scanner;
public class Main {
    static boolean binarySearch(int[] a, int target){
        int l = 0, r = a.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] == target){
                return true;
            }else if(a[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int q = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; ++i) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < q; ++i){
            int target = scanner.nextInt();
            if(binarySearch(arr,target)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}