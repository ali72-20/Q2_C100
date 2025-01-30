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

    // get size

    public E getHead(){
        return head.data;
    }
    // get tail
}
