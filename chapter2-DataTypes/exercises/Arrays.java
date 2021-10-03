// can you remember how to set up your main function?

import java.util.ArrayList;

class Arrays {
    public static void main(String[] args) {
        // declare an array of Strings and print it
        String[] arr = {"An", "array", "of", "strings"};
        for(String word : arr) {
            System.out.println(word + " ");
        }

        // declare an array of integers and print it
        int[] numArr = { 5, 3, 4, 5, 7, 10};
        for(int num : numArr) {
            System.out.println(num + " ");
        }

        // declare an ArrayList of integers, add numbers to it, and then print it
        ArrayList<Integer> moreNums = new ArrayList<Integer>();
        moreNums.add(1);
        moreNums.add(2);
        moreNums.add(3);
        moreNums.add(4);
        System.out.println(moreNums);

    }

}

