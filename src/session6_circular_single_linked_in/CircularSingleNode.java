package session6_circular_single_linked_in;
class CircularSingleNode<E> {
    protected E data;
    protected CircularSingleNode<E> next;
    protected CircularSingleNode(E data){
        this.data = data;
        next = null;
    }
}
