package sorting_algo;

import java.util.Arrays;

public class SortingAlgo {
    private SortingAlgo() {
    }

    /**
     * @param a array need to sort in O(n^2) time
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
            if (isSorted) {
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

    static public void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; ++i) {
            int mnIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (a[j] < a[mnIndex]) {
                    mnIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[mnIndex];
            a[mnIndex] = temp;
        }
    }

    // O(n ^ 2)
    static public void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    static private void merge(int[] originalArr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; ++i) {
            arr1[i] = originalArr[l + i];
        }
        for (int i = 0; i < n2; ++i) {
            arr2[i] = originalArr[mid + 1 + i];
        }
        int pointer1 = 0, pointer2 = 0, k = l;
        while (pointer1 < n1 && pointer2 < n2) {
            if (arr1[pointer1] <= arr2[pointer2]) {
                originalArr[k] = arr1[pointer1];
                pointer1++;
            } else {
                originalArr[k] = arr2[pointer2];
                pointer2++;
            }
            k++;
        }
        while (pointer1 < n1) {
            originalArr[k] = arr1[pointer1];
            pointer1++;
            k++;
        }
        while (pointer2 < n2) {
            originalArr[k] = arr2[pointer2];
            pointer2++;
            k++;
        }
    }

    static public void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private static int getMaxNumber(int[] arr) {
        int mx = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            mx = Math.max(mx, arr[i]);
        }
        return mx;
    }

    // return array with freq of evert number in array a
    private static int[] countNumber(int[] a, int maxNumber) {
        int[] frq = new int[maxNumber + 1];
        Arrays.fill(frq, 0);
        for(int i = 0; i < a.length; ++i) {
            int item = a[i];
            frq[item]++;
        }
        return frq;
    }
    public static void countSort(int[] arr) {
        int freqSize = getMaxNumber(arr) + 1;
        int[] frq = countNumber(arr, freqSize); // O(size) --> 5 * 4 bytes = 20 bytes
        int currentValidIndex = 0;
        for(int i = 0; i < frq.length; ++i){
            if(frq[i] == 0) continue;
            while (frq[i] > 0){
                arr[currentValidIndex] = i;
                frq[i]--;
                currentValidIndex++;
            }
        }
    }
}
