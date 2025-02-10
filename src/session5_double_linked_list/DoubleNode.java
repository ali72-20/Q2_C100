package session5_double_linked_list;

class DoubleNode<E>{
    protected E data;
    protected DoubleNode<E> next;
    protected DoubleNode<E> prev;
    protected DoubleNode(E data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
