# DSA711S Mini Project Report: Contact Management System

**Module:** Data Structures and Algorithms 2 (DSA711S)  
**Institution:** Namibia University of Science and Technology (NUST)  
**Date:** May 2026  

---

## 1. Group Members & Contributions

| Name | Student No. | Role | Key Contributions |
|------|-------------|------|-------------------|
| Kirubel Hailu | 224001213 | Person 1 | Node class, Recursive BST Insert & Search |
| Silvio Ivanio | 224046179 | Person 2 | Inorder Traversal, Height & Balance Factor |
| Tk Hambira | 220097755 | Person 3 | *[Pending: AVL LL & RR Rotations]* |
| Chido Kavai | 224009133 | Person 4 | *[Pending: AVL LR & RL Rotations + Insert]* |
| Anselmo Martins | 224065955 | Person 5 | *[Pending: Test Cases + Main.java]* |

---

## 2. System Description

The **Contact Management System** is a Java-based application designed to store and manage contact names efficiently using tree-based data structures. The system utilizes both **Binary Search Trees (BST)** and **Adelson-Velsky and Landis (AVL)** trees to demonstrate the performance differences between unbalanced and self-balancing structures.

The core objective is to provide O(log n) performance for search and insertion by maintaining a balanced tree height, preventing the performance degradation often seen in skewed BSTs.

---

## 3. Implementation Explanation

The system is implemented using **Strict Recursion** for all tree operations as per the module requirements.

### 3.1 Data Structure (Node Class)
The `Node` class serves as the fundamental building block. It stores:
- `String name`: The unique key used for ordering.
- `int height`: A cached value representing the node's height, initialized at `0` for leaves.
- `Node left, right`: Pointers to the left and right subtrees.

### 3.2 Binary Search Tree (BST)
The BST class implements the standard non-balancing tree logic:
- **Recursive Insertion:** Traverses the tree based on alphabetical comparison (`compareToIgnoreCase`). It updates the `height` attribute of each ancestor node during the recursive return path.
- **Recursive Search:** A standard recursive search that returns `true` if a name is found, and `false` otherwise.
- **Inorder Traversal:** Displays all contacts in alphabetical order.
- **Height Computation:** 
    - **Recursive Method:** A strict recursive function that traverses the tree from root to leaves to satisfy the assignment's recursion requirements.
    - **O(1) Helper:** A `getHeight()` helper that retrieves the cached `height` attribute for efficiency during balancing.
- **Balance Factor:** Calculated as `height(left) - height(right)`.

---

## 4. Complexity Analysis

### 4.1 BST Performance
- **Search/Insert (Average Case):** $O(\log n)$ when the tree is relatively balanced.
- **Search/Insert (Worst Case):** $O(n)$ if the names are inserted in alphabetical order (e.g., "Alice", "Bob", "Charlie"), resulting in a skewed "linked-list" structure.

### 4.2 AVL Performance (Pending Implementation)
- **Search/Insert:** $O(\log n)$ guaranteed due to the self-balancing property achieved through rotations.

---

## 5. Reflection

*[To be completed by the group once all modules are integrated.]*
