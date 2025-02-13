package Session7_stack_queue.stack;
import java.util.EmptyStackException;

// push pop peek
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
    public boolean isEmpty(){
        return size == 0;
    }
    public E peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[size - 1];
    }
    private void dynamicAloc(){
        // double cap
        capacity*=2;

        // creat new array
        E[] newStack = (E[])new Object[capacity];

        // shift old array on new array
        for(int i = 0;i < size; ++i){
            newStack[i] = stack[i];
        }

        //change old array ref to be on new array
        stack = newStack;

    }

    public void push(E item){
        if(size == capacity){
            dynamicAloc();
        }
        stack[size] = item;
        size++;
    }

    // pop
    public void pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        size--;
    }
}
