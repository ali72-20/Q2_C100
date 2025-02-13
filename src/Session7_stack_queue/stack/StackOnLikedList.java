package Session7_stack_queue.stack;

import java.util.EmptyStackException;

public class StackOnLikedList<E> {
    private StackNode<E> peek;
    private int size;
    public StackOnLikedList(){
        peek = null;
        size = 0;
    }
    public int getSize(){
       return size;
    }
    public boolean isEmpty(){
       return peek == null;
    }
    public E Peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return peek.data;
    }
    public void push(E item){
        StackNode<E> newNode = new StackNode<>(item);
        size++;
        if(isEmpty()){
            peek = newNode;
            return;
        }
        newNode.next = peek;
        peek = newNode;
    }
    public void pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        StackNode<E> deletedNode = peek;
        peek = peek.next;
        deletedNode.next = null;
        deletedNode =null;
        size--;
    }
}

