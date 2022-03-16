package pertemuan4;

public class StackArray {
    int[] data = new int[5];
    int count = 0;

    public void push(int input) {
        data[count] = input;
        count++;
    }

    public int pop() {
        count--;
        int temp = data[count];
        data[count] = 0;
        return temp;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
