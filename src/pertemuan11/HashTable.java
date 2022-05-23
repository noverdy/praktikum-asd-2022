package pertemuan11;

import java.util.Arrays;

public class HashTable {
    private String[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        this.table = new String[size];
    }

    public void insert(String data) {
        int total = 0;
        int X = 128;
        int pangkat = 0;
        for (int i = data.length() - 1; i >= 0; i--) {
            total += (data.charAt(i) * Math.pow(X, pangkat)) % size;
            pangkat++;
        }
        table[total % size] = data;
    }

    public boolean search(String data) {
        int total = 0;
        int X = 128;
        int pangkat = 0;
        for (int i = data.length() - 1; i >= 0; i--) {
            total += (data.charAt(i) * Math.pow(X, pangkat)) % size;
            pangkat++;
        }
        return table[total % size] != null;
    }

    public void printTable() {
        System.out.println(Arrays.toString(table));
    }
}
