import binary_search_tree.BinarySearchTree;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.recPush(10, binarySearchTree.root);
        System.out.println(binarySearchTree.getRoot());
        binarySearchTree.recPush(20,binarySearchTree.root);
    }

    private static void printLine() {
        System.out.println("----------------------------------------");
    }
}