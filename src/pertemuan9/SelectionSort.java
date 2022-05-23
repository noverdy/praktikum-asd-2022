package pertemuan9;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 6, 3, 1, 5, 3, 7, 8, 10, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int minNumber = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minNumber) {
                    minNumber = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
