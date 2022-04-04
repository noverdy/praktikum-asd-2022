package pertemuan7;

public class AVLTree {
    Node root;

    public int height(Node N) {
        if (N == null)
            return 0;

        return N.height;
    }

    // Fungsi untuk rotasi kanan
    public Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Rotasi kanan
        x.right = y;
        y.left = T2;

        // Perbarui tinggi dari node
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Fungsi untuk rotasi kiri
    public Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Rotasi kiri
        y.left = x;
        x.right = T2;

        // Perbarui tinggi dari node
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Get Balance factor of node N
    public int getBalance(Node N) {
        if (N == null)
            return 0;

        return height(N.left) - height(N.right);
    }

    public Node insert(Node node, int data) {
        if (node == null)
            return (new Node(data));

        if (data < node.data)
            node.left = insert(node.left, data);
        else if (data > node.data)
            node.right = insert(node.right, data);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Right Rotation
        if (balance > 1 && data < node.left.data)
            return rightRotate(node);

        // Left Rotation
        if (balance < -1 && data > node.right.data)
            return leftRotate(node);

        // Left-Right Rotation
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Left Rotation
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void preorder(Node node) {
        System.out.print(node.data + ", ");
        if (node.left != null) preorder(node.left);
        if (node.right != null) preorder(node.right);
    }
}
