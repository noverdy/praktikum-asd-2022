package pertemuan5;

import pertemuan2.Node;
import pertemuan2.SLL;

public class QueueLL {
    SLL data = new SLL();

    public void enqueue(int input) {
        data.addLast(new Node(input));
    }

    public void dequeue() {
        data.removeFirst();
    }

    public void print() {
        data.print();
    }
}
