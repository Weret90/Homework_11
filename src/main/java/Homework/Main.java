package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(swapElements(new String[] {"One", "Two"})));
        ArrayList<Integer> nums = convertToArrayList(new Integer[] {1,2,3,4,5});
        System.out.println(nums);
    }

    public static <A> A[] swapElements(A[] array) {
        A a = array[1];
        array[1] = array[0];
        array[0] = a;
        return array;
    }

    public static <B> ArrayList<B> convertToArrayList(B[] array) {
        ArrayList<B> arrayList = new ArrayList<>(Arrays.asList(array));
        return arrayList;
    }
}
