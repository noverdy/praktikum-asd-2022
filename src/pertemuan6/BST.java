package pertemuan6;

public class BST {
    NodeBST root;

    public void add(int data) {
        root = add(root, data);
    }

    public NodeBST add(NodeBST current, int data) {
        NodeBST temp = current;
        if (temp == null) {
            temp = new NodeBST(data);
        }
        else if (data < current.data) {
            temp.left = add(current.left, data);
        }
        else if (data > current.data) {
            temp.right = add(current.right, data);
        }
        return temp;
    }

    public void preorder(NodeBST current) {
        System.out.print(current.data + ", ");
        if (current.left != null) preorder(current.left);
        if (current.right != null) preorder(current.right);
    }

    public void postorder(NodeBST current) {

    }

    public void inorder(NodeBST current) {

    }
}
