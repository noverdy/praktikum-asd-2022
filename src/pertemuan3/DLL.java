package pertemuan3;

public class DLL {
    NodeDLL head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(NodeDLL input) {
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            input.next = head;
            head.prev = input;
            head = input;
        }
        size++;
    }

    public void addLast(NodeDLL input) {
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public void removeFirst() {
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() {
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public boolean isExists(int data) {
        NodeDLL pointer = head;
        while (pointer != null) {
            if (pointer.data == data) return true;
            pointer = pointer.next;
        }
        return false;
    }

    public void print() {
        NodeDLL pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
}


