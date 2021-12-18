package Data_Structures;

import java.util.Arrays;

public class SeparatesNum {
    public static void main(String[] args) {

        // create an int array of size n

        int[] num = { 25, -34, 45, 34, -54, 86, -66, -23, 96, 65, 29, -9 };

        Arrays.sort(num);

        // display negative || positive numbers
        separate(num);

    }

    // method to separate +, - numbers
    public static void separate(int[] numbers) {

        // variables
        int posCount = 0;
        int negCount = 0;
        int[] positive;
        int[] negative;

        // count positive and negative numbers
        for (int i : numbers) {
            if (i >= 0)
                ++posCount;
            else
                ++negCount;
        }

        // if array contains only positive or negative
        if (posCount == 0) {
            System.out.println("Array contains only negative numbers");
            // display array
            System.out.println("Array = " + Arrays.toString(numbers));
            return;
        } else if (negCount == 0) {
            System.out.println("Array contains only positive numbers");
            // display array
            System.out.println("Array = " + Arrays.toString(numbers));
            return;
        }

        // create positive and negative array
        positive = new int[posCount];
        negative = new int[negCount];

        // check element and insert
        int i = 0;
        int j = 0;
        for (int num : numbers) {
            if (num >= 0 && num <= 1000) {
                positive[i++] = num;

            } else {
                negative[j++] = num;

            }
        }

        // both arrays
        System.out.println("Positive numbers = " + Arrays.toString(positive));
        System.out.println("Negative numbers = " + Arrays.toString(negative));

    }

}
