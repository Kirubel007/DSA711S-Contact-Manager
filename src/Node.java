//Person 1: Kirubel

public class Node {
    String name;

    // Cached height attribute to achieve O(log n) complexity for AVL tree
    // balancing.
    int height;

    Node left, right;

    public Node(String name) {
        this.name = name;
        // Leaf nodes are initialized with a height of 0 per course convention. (Added
        // by Silvio)
        this.height = 0;
        this.left = null;
        this.right = null;
    }
}