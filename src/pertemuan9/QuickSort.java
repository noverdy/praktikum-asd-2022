package pertemuan9;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    public static void quicksort(int[] arr, int l, int r) {
        if (l < r) {
            int p = partition(arr, l, r);
            quicksort(arr, l, p - 1);
            quicksort(arr, p + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 6, 3, 1, 5, 3, 7, 8, 10, 2};

        quicksort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
