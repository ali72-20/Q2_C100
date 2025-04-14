import binary_search_tree.BinarySearchTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        System.out.println(binarySearchTree.isEmpty());
        binarySearchTree.iterativePush(10);
        printLine();
        binarySearchTree.iterativePush(25);
        printLine();
        binarySearchTree.iterativePush(20);
        printLine();
        binarySearchTree.iterativePush(22);
    }

    private static void printLine() {
        System.out.println("----------------------------------------");
    }
}