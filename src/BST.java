//Person 2
public class BST {
    Node root;

    public BST() {
        this.root = null;
    }

    public void insert(String name) {
        root = insertRecursive(root, name);
    }

    private Node insertRecursive(Node current, String name) {
        if (current == null) {
            return new Node(name);
        }
        if (name.compareToIgnoreCase(current.name) < 0) {
            current.left = insertRecursive(current.left, name);
        } else if (name.compareToIgnoreCase(current.name) > 0) {
            current.right = insertRecursive(current.right, name);
        } else {
            System.out.println("Contact already exists.");
            return current;
        }

        // Modified by Person 2(Silvio): Update height of this ancestor node to maintain
        // O(log n) AVL performance
        current.height = 1 + Math.max(getHeight(current.left), getHeight(current.right));

        return current;
    }

    public boolean search(String name) {
        return searchRecursive(root, name);
    }

    private boolean searchRecursive(Node current, String name) {
        if (current == null) {
            return false; // reached empty spot - name not found
        }
        if (name.compareToIgnoreCase(current.name) == 0) {
            return true; // found it!
        }
        if (name.compareToIgnoreCase(current.name) < 0) {
            return searchRecursive(current.left, name); // go left
        } else {
            return searchRecursive(current.right, name); // go right
        }
    }

    // --- Added by Person 2(Silvio) ---

    // 1. Display contacts using inorder traversal (Recursive)
    public void displayInorder() {
        System.out.println("--- Contacts List ---");
        inorderRecursive(root);
        System.out.println("---------------------");
    }

    private void inorderRecursive(Node current) {
        if (current != null) {
            inorderRecursive(current.left);
            System.out.println("- " + current.name);
            inorderRecursive(current.right);
        }
    }

    // 2. Helper method to safely get height of a node
    protected int getHeight(Node node) {
        if (node == null)
            return -1; // Null nodes have height -1
        return node.height;
    }

    // 3. Compute height of the entire tree
    public int height() {
        return getHeight(root);
    }

    // 4. Compute balance factor of a specific node
    public int getBalanceFactor(Node current) {
        if (current == null) {
            return 0;
        }
        return getHeight(current.left) - getHeight(current.right);
    }
}