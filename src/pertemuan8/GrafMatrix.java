package pertemuan8;

import java.util.Arrays;

public class GrafMatrix {
    int[][] data;
    int size;

    public GrafMatrix(int size) {
        this.size = size;
        data = new int[size][size];
    }

    public void addEdge(int node1, int node2) {
        data[node1 - 1][node2 - 1] = 1;
        data[node2 - 1][node1 - 1] = 1;
    }

    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}
