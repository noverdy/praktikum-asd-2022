package pertemuan8;

public class Main {
    public static void main(String[] args) {
        GrafMatrix graf = new GrafMatrix(6);

        graf.addEdge(1, 2);
        graf.addEdge(2, 5);
        graf.addEdge(1, 5);
        graf.addEdge(3, 6);

        graf.printMatrix();

        GrafList graf2 = new GrafList(6);
        graf2.addEdge(1, 2);
        graf2.addEdge(2, 2);
        graf2.addEdge(2, 4);
        graf2.addEdge(2, 5);
        graf2.addEdge(4, 1);
        graf2.addEdge(4, 5);
        graf2.addEdge(5, 4);
        graf2.addEdge(6, 3);

        graf2.printList();
    }
}
