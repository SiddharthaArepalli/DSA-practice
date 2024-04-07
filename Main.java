 class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
  }
}

class BinaryTree {
  Node root;

  public BinaryTree() {
    root = null;
  }

  public void insert(int data) {
    Node newNode = new Node(data);
    if (root == null) {
      root = newNode;
      return;
    }
    insertRec(root, newNode);
  }

  private void insertRec(Node current, Node newNode) {
    if (newNode.data < current.data) {
      if (current.left == null) {
        current.left = newNode;
      } else {
        insertRec(current.left, newNode);
      }
    } else {
      if (current.right == null) {
        current.right = newNode;
      } else {
        insertRec(current.right, newNode);
      }
    }
  }
  public void printPreOrder() {
    printPreOrderRec(root);
  }

void printPreOrderRec(Node current) {
    if (current != null) {
      System.out.print(current.data + " "); // Visit root first in pre-order
      printPreOrderRec(current.left);
      printPreOrderRec(current.right);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    // You can add your code to perform operations on the tree here
    System.out.println("Tree created successfully!");
    tree.printPreOrder();
  }
}
