package Session7_stack_queue.stack;

class StackNode<E> {
    E data;
    StackNode<E> next;
    StackNode(E data){
        this.data = data;
        this.next = null;
    }
}
