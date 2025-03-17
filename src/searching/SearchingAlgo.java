package searching;

public class SearchingAlgo {
    private SearchingAlgo() {}
    // O(n)
    // wrest case -> target not found in array
    public static boolean linearSearch(int[] a, int target){
        for(int i = 0; i < a.length; ++i){
            if(a[i] == target){
                return true;
            }
        }
        return false;
    }
    // O(log(n))
    public static boolean binarySearch(int[] a, int target){
        int l = 0, r = a.length - 1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] == target){
                return true;
            }
            if(target > a[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }
    public static int upperBound(int[] a, int target){
        int l = 0, r = a.length - 1;
        int ans = -1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] > target){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public static int lowerBound(int[] a, int target){
        int l = 0, r = a.length - 1;
        int ans = -1;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] >= target){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
}
