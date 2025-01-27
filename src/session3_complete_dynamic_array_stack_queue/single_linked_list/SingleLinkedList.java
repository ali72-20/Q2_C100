package session3_complete_dynamic_array_stack_queue.single_linked_list;

public class SingleLinkedList<E> {
    private SingleNode<E> head;
    private int size;
    /**
     * Head is null in init the list
     * size also is already zero
     */
    public SingleLinkedList(){
        head = null;
        size = 0;
    }
    /**
     *
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     *
     * @return the current size of list
     */
    public int getSize(){
        return size;
    }
}
