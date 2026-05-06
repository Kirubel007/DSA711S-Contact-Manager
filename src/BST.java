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
        if(current == null) {
            return new Node(name);
        }
        if (name.compareToIgnoreCase(current.name) < 0) {
        current.left = insertRecursive(current.left, name);
    } else if (name.compareToIgnoreCase(current.name) > 0) {
        current.right = insertRecursive(current.right, name);
    } else {
        System.out.println("Contact already exists.");
    }
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

}