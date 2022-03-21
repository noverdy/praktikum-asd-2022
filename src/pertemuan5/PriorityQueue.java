package pertemuan5;

public class PriorityQueue {
    NodePQ head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(NodePQ input) {
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            if (input.priority >= head.priority) {
                input.next = head;
                head = input;
            }
            else {
                NodePQ pointer = head;
                while (pointer.next != null && pointer.next.priority > input.priority) {
                    pointer = pointer.next;
                }
                input.next = pointer.next;
                pointer.next = input;
            }
        }
        size++;
    }

    public void remove() {
        NodePQ pointer = head;
        while (pointer.next != tail) {
            pointer = pointer.next;
        }
        pointer.next = null;
        tail = pointer;
        size--;
    }

    public boolean isExists(int data) {
        NodePQ pointer = head;
        while (pointer != null) {
            if (pointer.data == data) return true;
            pointer = pointer.next;
        }
        return false;
    }

    public void print() {
        NodePQ pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
}
