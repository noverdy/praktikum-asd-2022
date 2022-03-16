package pertemuan4;

public class Main {
    public static void main(String[] args) {
        StackArray s1 = new StackArray();
        s1.push(2);
        s1.push(7);
        s1.push(4);
        s1.push(2);
        s1.push(7);
//        s1.push(4);
        s1.print();
        s1.pop();
        s1.print();

        StackLL s2 = new StackLL();
        s2.push(2);
        s2.push(7);
        s2.push(4);
        s2.push(2);
        s2.push(7);
        s2.push(4);
        s2.push(2);
        s2.push(2);
        s2.push(7);
        s2.push(4);
        s2.push(2);
        s2.push(7);
        s2.push(4);
        s2.push(2);
        s2.push(2);
        s2.push(7);
        s2.push(4);
        s2.push(2);
        s2.push(7);
        s2.push(4);
        s2.push(2);
        s2.push(2);
        s2.push(7);
        s2.push(4);
        s2.push(2);
        s2.push(7);
        s2.push(4);
        s2.push(2);
        s2.print();
    }
}
