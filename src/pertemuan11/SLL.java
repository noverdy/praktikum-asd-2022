package pertemuan11;

public class SLL {
    Node head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(Node input) {
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            input.next = head;
            head = input;
        }
        size++;
    }

    public void addLast(Node input) {
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public void removeFirst() {
        head = head.next;
        size--;
    }

    public void removeLast() {
        Node pointer = head;
        while (pointer.next != tail) {
            pointer = pointer.next;
        }
        pointer.next = null;
        tail = pointer;
        size--;
    }

    public boolean isExists(String data) {
        Node pointer = head;
        while (pointer != null) {
            if (data.equals(pointer.data)) return true;
            pointer = pointer.next;
        }
        return false;
    }

    public void print() {
        Node pointer = head;
        System.out.print("[");
        while (pointer != null) {
            System.out.print(pointer.data + ", ");
            pointer = pointer.next;
        }
        System.out.println("]");
    }
}

