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

    public boolean isContain(int data){
        // binary search
    }

    public void insert(int data){

    }

    public void erase(int data){

    }

    public void print(){
        for(Integer item : set){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
