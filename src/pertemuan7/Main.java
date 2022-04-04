package pertemuan7;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        /* Hasil AVL Tree:
            30
            / \
          20 40
         / \   \
        10 25  50
    	*/

        tree.preorder(tree.root);
    }
}
