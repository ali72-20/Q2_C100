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

    private void updateSize(int val){
          size+=val;
    }

    public void pushFront(E element){
         SingleNode<E> newNode = new SingleNode<>(element); // create new Node;
         updateSize(1);
         if(head == null){
             head = newNode;
             tail = newNode;
             return;
         }
         newNode.next = head;
         head = newNode;
    }
}
