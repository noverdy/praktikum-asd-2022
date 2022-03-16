package pertemuan4;

import pertemuan2.Node;
import pertemuan2.SLL;

public class StackLL {
    SLL data = new SLL();

    public void push(int input) {
        data.addFirst(new Node(input));
    }

    public void pop() {
        data.removeFirst();
    }

    public void print() {
        data.print();
    }
}
