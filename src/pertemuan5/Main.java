package pertemuan5;

public class Main {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(12);
        q.enqueue(20);
        q.enqueue(27);
//
//        q.print();
//        q.dequeue();
//        q.print();

        PriorityQueue pq = new PriorityQueue();
        pq.add(new NodePQ(12, 2));
        pq.add(new NodePQ(28, 2));
        pq.add(new NodePQ(99, 2));
        pq.add(new NodePQ(21, 2));
        pq.print();
        pq.add(new NodePQ(7, 1));
        pq.print();
    }
}
