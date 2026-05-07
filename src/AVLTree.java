//Person 3 & 4
// Person 3: 220097755 Tk Hambira
public class AVLTree extends BST {

    // RIGHT ROTATION (LL Case)
    protected Node rotateRight(Node y) {

        // x becomes new root of this subtree
        Node x = y.left;

        // T2 temporarily stores x's right subtree
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));

        return x;
    }

    // LEFT ROTATION (RR Case)
    protected Node rotateLeft(Node x) {

        // y becomes new root of this subtree
        Node y = x.right;

        // T2 temporarily stores y's left subtree
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        return y;
    }
}