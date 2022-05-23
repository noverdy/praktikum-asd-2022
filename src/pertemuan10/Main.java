package pertemuan10;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 8, 12, 34, 38, 42, 51};

        int data = 41;
        int index = linearSearch(arr, data);
        int index2 = binarySearch(arr, data);

        System.out.println(index);
        System.out.println(index2);
    }

    public static int linearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int data) {
        int l = 0;
        int r = arr.length - 1;
        int m = (l + r)/2;

        while (l <= r) {
            m = (l + r)/2;
            if (data == arr[m]) {
                return m;
            }
            if (data < arr[m]) {
                r = m - 1;
            }
            if (data > arr[m]) {
                l = m + 1;
            }
        }

        return -1;
    }
}
