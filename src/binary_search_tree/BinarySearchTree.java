package binary_search_tree;

public class BinarySearchTree {
    private BinaryNode root;


    public BinarySearchTree(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public int getRoot(){
        if(isEmpty()){
            throw new NullPointerException("Tree is empty");
        }
        return root.data;
    }

    public void iterativePush(int data){
        BinaryNode newNode = new BinaryNode(data);
        if(isEmpty()){
            System.out.println("inserted in root");
            root = newNode;
            return;
        }
        BinaryNode currentNode = root;
        System.out.println("start from root");

        while(true){
            if(data > currentNode.data){
                if(currentNode.right != null) {
                    System.out.println("Walk to right");
                    currentNode = currentNode.right;
                }else{
                    currentNode.right = newNode;
                    System.out.println("Inserted in right");
                    break;
                }
            }else{
                if(currentNode.left != null){
                    currentNode = currentNode.left;
                    System.out.println("Walk to left");
                }else{
                    currentNode.left = newNode;
                    System.out.println("Inserted in left");
                    break;
                }
            }
        }
    }

    public void recPush(int data){

    }

}
