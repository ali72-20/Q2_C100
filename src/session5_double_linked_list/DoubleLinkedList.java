package session5_double_linked_list;
public class DoubleLinkedList<E> {
    private DoubleNode<E> head;
    private DoubleNode<E> tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    private void handelEmptyList(String methodName) {
        if (isEmpty()) {
            throw new NullPointerException("List is Empty: " + methodName + " method");
        }
    }

    public E getHead() {
        handelEmptyList("getHead()");
        return head.data;
    }

    public E getTail() {
        handelEmptyList("getTail()");
        return tail.data;
    }

    public void pushFront(E item) {
        DoubleNode<E> newNode = new DoubleNode<>(item);
        size++;
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void pushBack(E item) {
        DoubleNode<E> newNode = new DoubleNode<>(item);
        size++;
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void popFront() {
        handelEmptyList("popFront()");
        size--;
        DoubleNode<E> deletedNode = head;
        head = head.next;
        deletedNode.next = null;
        head.prev = null;
        deletedNode = null;
    }

    public void popBack() {
        handelEmptyList("popBack()");
        size--;
        DoubleNode<E> deletedNode = tail;
        tail = tail.prev;
        deletedNode.prev = null;
        tail.next = null;
        deletedNode = null;
    }

    public int searchForward(E item) {
        if (isEmpty()) {
            return -1;
        }
        int index = 0;
        DoubleNode<E> currentNode = head;
        while (currentNode != tail) {
            if (currentNode.data == item) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode.data == item) return index;
        return -1;
    }

    public int searchBackward(E item) {
        if (isEmpty()) {
            return -1;
        }
        int index = size - 1;
        DoubleNode<E> currentNode = tail;
        while (currentNode != head) {
            if (currentNode.data == item) {
                return index;
            }
            currentNode = currentNode.next;
            index--;
        }
        if (currentNode.data == item) return index;
        return -1;
    }

    public boolean contain(E item) {
        return searchForward(item) != -1;
    }

    public void printForward() {
        handelEmptyList("printForward()");
        DoubleNode<E> currentNode = head;
        while (currentNode != tail) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

    // task
    // printBack()
    // get(int index)
}
