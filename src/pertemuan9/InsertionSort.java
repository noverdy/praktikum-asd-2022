package pertemuan9;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 6, 3, 1, 5, 3, 7, 8, 10, 2};

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j != 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
