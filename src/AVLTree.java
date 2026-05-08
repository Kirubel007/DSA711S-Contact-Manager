//Person 3 & 4
// Person 3: 220097755 Tk Hambira
public class AVLTree extends BST {

    /**
     * Performs a Right Rotation to resolve a Left-Left (LL) imbalance.
     * Complexity: O(1)
     */
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

    /**
     * Performs a Left Rotation to resolve a Right-Right (RR) imbalance.
     * Complexity: O(1)
     */
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

    public void insertAVL(String name) {
        root = insertAVL(root, name);
    }

    /**
     * Recursive AVL Insertion.
     * Maintains O(log n) tree height by checking the balance factor at each ancestor
     * and performing necessary rotations during the recursive unwinding phase.
     */
    private Node insertAVL(Node node, String name) {

    if (node == null) {
        return new Node(name);
    }

    if (name.compareToIgnoreCase(node.name) < 0) {
        node.left = insertAVL(node.left, name);
    }
    else if (name.compareToIgnoreCase(node.name) > 0) {
        node.right = insertAVL(node.right, name);
    }
    else {
        return node;
    }

    node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

    int balance = getBalanceFactor(node);

    // 1. Left-Left (LL) Case: Unbalanced on the left child's left subtree
    if (balance > 1 && name.compareToIgnoreCase(node.left.name) < 0) {
        return rotateRight(node);
    }

    // 2. Right-Right (RR) Case: Unbalanced on the right child's right subtree
    if (balance < -1 && name.compareToIgnoreCase(node.right.name) > 0) {
        return rotateLeft(node);
    }
     
    // 3. Left-Right (LR) Case: Unbalanced on the left child's right subtree
    if (balance > 1 && name.compareToIgnoreCase(node.left.name) > 0) {
        node.left = rotateLeft(node.left);
        return rotateRight(node);
    }

    // 4. Right-Left (RL) Case: Unbalanced on the right child's left subtree
    if (balance < -1 && name.compareToIgnoreCase(node.right.name) < 0) {
        node.right = rotateRight(node.right);
        return rotateLeft(node);
    }

 return node;
}

}