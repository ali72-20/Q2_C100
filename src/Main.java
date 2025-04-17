import binary_search_tree.BinarySearchTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.iterativePush(10);
        printLine();
        binarySearchTree.iterativePush(15);
        printLine();
        binarySearchTree.iterativePush(6);
        printLine();
        binarySearchTree.iterativePush(8);
        printLine();
        binarySearchTree.iterativePush(9);
        printLine();
        binarySearchTree.iterativePush(16);
        printLine();
        binarySearchTree.iterativePush(13);
        printLine();
        binarySearchTree.iterativePush(2);
        printLine();
        System.out.println(binarySearchTree.contains(13));
        printLine();
        System.out.println(binarySearchTree.containsRec(13,binarySearchTree.root,0));
        printLine();
        System.out.println(binarySearchTree.containsRec(14,binarySearchTree.root,0));

    }

    private static void printLine() {
        System.out.println("----------------------------------------");
    }
}