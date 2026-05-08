// Person 5 & 6: (add names)
// Entry point — console menu that lets the user interact with
// both the BST and the AVL tree side by side.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        BST bst = new BST();
        AVLTree avl = new AVLTree();

        int choice = 0;

        System.out.println("=================================================");
        System.out.println("HELLO, WELCOME TO THE  CONTACT MANAGEMENT SYSTEM ");
        System.out.println("=================================================");

        do {
            System.out.println("\nMENU");
            System.out.println("1. Insert Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Tree Heights");
            System.out.println("5. Balance Factor");
            System.out.println("0. Exit");

            System.out.print("Choose option: ");

            if (!in.hasNextInt()) {
                System.out.println("Invalid input.");
                in.nextLine();
                continue;
            }

            choice = in.nextInt();
            in.nextLine();

            switch (choice) {

                // INSERT
                case 1:

                    System.out.print("Enter contact name: ");
                    String insertName = in.nextLine().trim();

                    if (insertName.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }
                    bst.insert(insertName);
                    avl.insertAVL(insertName);
                    System.out.println(insertName + " inserted successfully.");
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = in.nextLine().trim();
                    if (bst.search(searchName)) {
                        System.out.println("BST : Contact Found");
                    } else {
                        System.out.println("BST : Contact Not Found");
                    }
                    if (avl.search(searchName)) {
                        System.out.println("AVL : Contact Found");
                    } else {
                        System.out.println("AVL : Contact Not Found");
                    }
                    break;
                case 3:
                    System.out.println("\nBST Contacts:");
                    bst.displayInorder();
                    System.out.println("\nAVL Contacts:");
                    avl.displayInorder();
                    break;
                case 4:
                    System.out.println("BST Height : " + bst.height());
                    System.out.println("AVL Height : " + avl.height());
                    break;
                case 5:
                    System.out.println("BST Root Balance Factor : "
                            + bst.getBalanceFactor(bst.root));

                    System.out.println("AVL Root Balance Factor : "
                            + avl.getBalanceFactor(avl.root));
                    break;
                case 0:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}