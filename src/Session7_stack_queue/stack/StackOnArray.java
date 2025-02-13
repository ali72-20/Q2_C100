package Session7_stack_queue.stack;

import java.util.ArrayList;

public class StackOnArray<E> {
    private E[] stack;
    private int size;
    private int capacity;
    public StackOnArray(){
        capacity = 1;
        stack = (E[]) new Object[capacity];
        size = 0;
    }
    public int getSize(){
        return size;
    }
    // isEmpty()
}
