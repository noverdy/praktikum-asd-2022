package pertemuan11;

public class HashTableOpenHashing {
    private SLL[] table;
    private int size;

    public HashTableOpenHashing(int size) {
        this.size = size;
        this.table = new SLL[size];
    }

    public void insert(String data) {
        int total = 0;
        int X = 128;
        int pangkat = 0;
        for (int i = data.length() - 1; i >= 0; i--) {
            total += (data.charAt(i) * Math.pow(X, pangkat)) % size;
            pangkat++;
        }
        total %= size;

        if (table[total] == null) {
            table[total] = new SLL();
        }
        if (table[total].isExists(data)) return;
        table[total].addLast(new Node(data));
    }

    public boolean search(String data) {
        int total = 0;
        int X = 128;
        int pangkat = 0;
        for (int i = data.length() - 1; i >= 0; i--) {
            total += (data.charAt(i) * Math.pow(X, pangkat)) % size;
            pangkat++;
        }
        total %= size;

        if (table[total] == null) {
            return false;
        }
        return table[total].isExists(data);
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + " -> ");
            if (table[i] == null)
                System.out.println("[]");
            else
                table[i].print();
        }
    }
}
