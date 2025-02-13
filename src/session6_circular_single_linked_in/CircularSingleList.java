package session6_circular_single_linked_in;

public class CircularSingleList<E> {
    private CircularSingleNode<E> head;
    private CircularSingleNode<E> tail;
    private int size;

    public CircularSingleList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    private void emptyListHandler(String methodName) {
        if (isEmpty()) {
            throw new NullPointerException("List is empty: " + methodName + " method");
        }
    }

    public E getHeadData() {
        emptyListHandler("getHeadData");
        return head.data;
    }

    public E getTailData() {
        emptyListHandler("getTailData");
        return tail.data;
    }
    private boolean firstNodeHandler(CircularSingleNode<E> newNode){
        if (isEmpty()){
            head = newNode;
            tail = newNode;
            return true;
        }
        return false;
    }
    private void setCircular(){
        tail.next = head;
    }
    public void pushFront(E item){
        // creat newNode
        CircularSingleNode<E> newNode = new CircularSingleNode<>(item);
        // update size
        size++;
       if(firstNodeHandler(newNode)) return;
       newNode.next = head;
       head = newNode;
       setCircular();
    }



    public void popBack(){
        emptyListHandler("popBack()");
        CircularSingleNode<E> deletedNode = tail;
        CircularSingleNode<E> currentNode = head;
        while (currentNode.next != tail){
            currentNode = currentNode.next;
        }
        tail = currentNode;
        tail.next = head;
        deletedNode.next = null;
        deletedNode = null;
        size--;
    }

    // task
    // popFront()
    // pushBack()

    public void pushBack(E item) {
        CircularSingleNode<E> newNode = new CircularSingleNode<>(item);
        size++;
        if (firstNodeHandler(newNode)) return;
        tail.next = newNode;
        tail = newNode;
        setCircular();
    }
}
