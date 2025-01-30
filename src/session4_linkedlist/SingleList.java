package session4_linkedlist;

public class SingleList<E>{
    private SingleNode<E> head;
    private SingleNode<E> tail;
    private int size;

    public SingleList(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public E getHead(){
        return head.data;
    }

    public E getTail(){
        return tail.data;
    }

    public void pushFront(E element){


        // mohamed
    }
}
