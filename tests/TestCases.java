// Person 5 (Anselmo)
// Modified by Person 2 (Silvio) to speed up submission since deadline is less than 2 hours away.

public class TestCases {
    public static void runTests() {
        System.out.println("=================================================");
        System.out.println("            RUNNING AUTOMATED TEST CASES         ");
        System.out.println("=================================================");

        // I. Skewed Insertion Case
        System.out.println("\n--- Test I: Skewed Insertion (BST vs AVL) ---");
        BST skewedBST = new BST();
        AVLTree skewedAVL = new AVLTree();
        String[] skewedNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
        for (String name : skewedNames) {
            skewedBST.insert(name);
            skewedAVL.insertAVL(name);
        }
        System.out.println("BST Height (Should be 4 for 5 nodes): " + skewedBST.height());
        System.out.println("AVL Height (Should be balanced ~2): " + skewedAVL.height());

        // II. Balanced Insertion Case
        System.out.println("\n--- Test II: Balanced Insertion Case ---");
        BST balancedBST = new BST();
        String[] balancedNames = {"Charlie", "Bob", "Alice", "David", "Eve"};
        for (String name : balancedNames) {
            balancedBST.insert(name);
        }
        System.out.println("BST Height with balanced insertion (Should be 2): " + balancedBST.height());

        // III. AVL Rotation Cases
        System.out.println("\n--- Test III: AVL Rotations ---");
        System.out.println("The AVL tree automatically handled the LL/RR rotations in Test I.");
        System.out.println("Let's test an LR Rotation (Insert 30, 10, 20)...");
        AVLTree lrTree = new AVLTree();
        lrTree.insertAVL("Charlie"); // 30
        lrTree.insertAVL("Alice");   // 10
        lrTree.insertAVL("Bob");     // 20
        System.out.println("AVL Height after LR Rotation (Should be 1): " + lrTree.height());

        // IV. Successful Search
        System.out.println("\n--- Test IV: Successful Search ---");
        System.out.println("Searching for 'Charlie' in skewedAVL: " + (skewedAVL.search("Charlie") ? "Found" : "Not Found"));

        // V. Traversal Output
        System.out.println("\n--- Test V: Traversal Output ---");
        System.out.println("Inorder Traversal of skewedAVL (Should be alphabetical):");
        skewedAVL.displayInorder();
        
        System.out.println("=================================================");
    }
}
