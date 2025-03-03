package sorting_algo;

public class SortingAlgo {
    private SortingAlgo() {}
    /**
     *
     * @param a array need to sort in O(n^2) time
     *
     */
    static public void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    static public void optimizedBubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; ++i) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
    static public int numberOfInvertions(int[] a) {
        int n = a.length;
        int cnt = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    cnt++;
                }
            }
        }
        return cnt;
    }
    static public void selectionSort(int[] a){
        int n = a.length;
        for(int i = 0;i < n; ++i){
            int mnIndex = i;
            for(int j = i + 1; j < n; ++j){
                if(a[j] < a[mnIndex]){
                    mnIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[mnIndex];
            a[mnIndex] = temp;
        }
    }
    // insertion sort
}
