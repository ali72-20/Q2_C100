package session2_dynmaic_array;

public class CustomDynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public CustomDynamicArray() {
        capacity = 1;
        size = 0;
        arr = new int[capacity];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public int get(int i) {
        if (i >= size) {
            throw new ArrayIndexOutOfBoundsException("index must be less than the current array size");
        }
        return arr[i];
    }

    private void dynamicAlloc(){
        capacity*=2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; ++i){
            newArray[i] = arr[i];
        }
        arr = newArray;
    }

    public void insert(int element){
        if(size == capacity){
            dynamicAlloc();
        }
        arr[size] = element;
        size++;
    }

}
