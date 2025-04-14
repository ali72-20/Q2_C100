package binary_search_tree;
class BinaryNode {
    protected int data;
    protected BinaryNode right;
    protected BinaryNode left;
    protected BinaryNode(int data){
        this.data = data;
        right = null;
        left = null;
    }
}
