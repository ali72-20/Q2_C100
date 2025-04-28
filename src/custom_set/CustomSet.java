package custom_set;

import java.util.ArrayList;
import java.util.List;

public class CustomSet {
    private List<Integer> set;

    public CustomSet(){
        set = new ArrayList<>();
    }

    public int size(){
        return set.size();
    }

    private int search(int data){
        int left = 0, right = size() - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            int current = set.get(mid);
            if(current == data){
                return mid;
            }
            if(current > data){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public boolean isContain(int data){
        return search(data) != -1;
    }

    private void insertionSort(){
        int i = set.size() - 2;
        int element = set.getLast();
        while (i >= 0 && set.get(i) > element){
            set.set(i + 1, set.get(i));
            i--;
        }
        set.set(i + 1,element);
    }

    public void insert(int data){
        if(isContain(data)) return;
        set.add(data);
        if(size() == 1) return;
        insertionSort();
    }

    public void erase(int data){
        int index = search(data);
        if(index == -1) return;
        set.remove(index);
    }

    public void print(){
        for(Integer item : set){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
