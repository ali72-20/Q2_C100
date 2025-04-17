package binary_search_tree;

public class BinarySearchTree {
    public BinaryNode root;
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

    public void recPush(int data,BinaryNode currentNode){
        if(isEmpty()){
            root = new BinaryNode(data);
            return;
        }
        if(data > currentNode.data){
            if(currentNode.right != null) {
                recPush(data,currentNode.right);
            }else{
                currentNode.right = new BinaryNode(data);
                return;
            }
        }else{
            if(currentNode.left != null){
                recPush(data, currentNode.left);
            }else{
                currentNode.left = new BinaryNode(data);
                return;
            }
        }
    }

    public boolean contains(int target){
        if(isEmpty()){
            return false;
        }
        BinaryNode currentNode = root;
        int dirc = 0;
        while (currentNode != null){
            if(dirc == 0){
                System.out.println("In root");
            }else if(dirc == 1){
                System.out.println("In right");
            }
            else if(dirc == 2){
                System.out.println("In left");
            }
            if(currentNode.data == target){
                return true;
            }
            if(target > currentNode.data){
                currentNode = currentNode.right;
                dirc = 1;
            }else{
                currentNode = currentNode.left;
                dirc = 2;
            }
        }
        return false;
    }

    public boolean containsRec(int target,BinaryNode currentNode, int dirc){
        if(dirc == 0){
            System.out.println("In root");
        }else if(dirc == 1){
            System.out.println("In right");
        }
        else if(dirc == 2){
            System.out.println("In left");
        }
        if(currentNode == null){
            return false;
        }
        if(currentNode.data == target){
            return true;
        }
        if(target > currentNode.data){
           return containsRec(target,currentNode.right,1);
        }
        return containsRec(target,currentNode.left, 2);
    }

    // left root right
    public void inOrder(BinaryNode currentNode){
        if(currentNode == null) return;
        inOrder(currentNode.left);
        System.out.print(currentNode.data  + " ");
        inOrder(currentNode.right);
    }
    // root,  left, right
    public void preOrder(){

    }
    // left right root
    public void postOrder(){

    }

}
