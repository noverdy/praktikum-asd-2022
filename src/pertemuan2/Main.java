package pertemuan2;

public class Main {
    public static void main(String[] args) {
        SLL contoh = new SLL();
        contoh.addFirst(new Node(12));
        contoh.addLast(new Node(20));
        contoh.addLast(new Node(99));
        contoh.addFirst(new Node(9));
        contoh.addFirst(new Node(1111111111));
        contoh.addLast(new Node(999999999));
        contoh.print();
        contoh.removeFirst();
        contoh.print();
        contoh.removeLast();
        contoh.print();
        boolean h1 = contoh.isExists(9);
        System.out.println(h1);
        boolean h2 = contoh.isExists(30);
        System.out.println(h2);
    }
}


