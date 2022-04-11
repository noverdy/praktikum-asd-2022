package pertemuan8;

public class GrafList {
    int size;
    Node[] list;

    public GrafList(int size) {
        this.size = size;
        list = new Node[size];
    }

    public void addEdge(int node1, int node2) {
        if (list[node1 - 1] == null) {
            list[node1 - 1] = new Node(node2);
        }
        else {
            Node pointer = list[node1 - 1];
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = new Node(node2);
        }
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + " -> ");
            Node pointer = list[i];
            while (pointer != null) {
                System.out.print(pointer.data);
                if (pointer.next != null) System.out.print(" -> ");
                pointer = pointer.next;
            }
            System.out.println();
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
