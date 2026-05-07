//Person 1: Kirubel

public class Node {
    String name;
    // Modified by Person 2(Silvio): Added height attribute to achieve O(log n)
    // complexity for AVL trees as required by rubric.
    int height;

    Node left, right;

    public Node(String name) {
        this.name = name;
        this.height = 0; // New nodes are initially added at leaf level
        this.left = null;
        this.right = null;
    }
}