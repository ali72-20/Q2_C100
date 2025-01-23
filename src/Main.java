import session2_dynmaic_array.CustomDynamicArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomDynamicArray customDynamicArray = new CustomDynamicArray();
        customDynamicArray.insert(10);
        System.out.println(customDynamicArray.getSize());
        System.out.println(customDynamicArray.getCapacity());
        customDynamicArray.insert(20);
    }
}