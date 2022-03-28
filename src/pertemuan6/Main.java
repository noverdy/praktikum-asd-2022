package pertemuan6;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.add(12);
        tree.add(8);
        tree.add(19);
        tree.preorder(tree.root);
    }
}
