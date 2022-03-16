package pertemuan3;

public class CLL {
    NodeCLL head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(NodeCLL input) {
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            input.next = head;
            head = input;
        }
        tail.next = input;
        size++;
    }

    public void addLast(NodeCLL input) {
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            tail.next = input;
            tail = input;
        }
        input.next = head;
        size++;
    }

    public void removeFirst() {
        head = head.next;
        tail.next = head;
        size--;
    }

    public void removeLast() {
        NodeCLL pointer = head;
        while (pointer.next != tail) {
            pointer = pointer.next;
        }
        tail = pointer;
        tail.next = head;
        size--;
    }

    public boolean isExists(int data) {
        NodeCLL pointer = head;
        while (pointer != null) {
            if (pointer.data == data) return true;
            pointer = pointer.next;
        }
        return false;
    }

    public void print() {
        NodeCLL pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
}

