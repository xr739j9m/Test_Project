package Data_Structures;

import java.util.Arrays;
import java.util.Scanner;

public class SeparatesNum2 {
    public static void main(String[] args) {
        // create Scanner class object to take input
        int n;
        Scanner input = new Scanner(System.in);

        boolean loop;
        do {
            System.out.print("Enter array size from 1-100 only: ");
            n = input.nextInt();

            loop = n > 100 || n == 0;
            if (n > 100 || n == 0) {
                System.out.println("Invalid Array size. Try Again");
            }

        } while (loop);

        // create an int array of size n

        int[] num = new int[n];

        // read size of the array
        boolean loop1 = true;
        do {
            System.out.println("Enter array elements: ");

            for (int i = 0; i < n; ++i) {

                num[i] = input.nextInt();
                loop1 = num[i] > 100;
                if (loop1) {
                    System.out.println("Invalid Array size. Try again.");
                }

            }
        } while (loop1);
        // take input for the array
        //this is to invo
        Arrays.sort(num);

        // display negative num
        separate(num);

        // close Scanner
        input.close();

    }

    // method to separate +ve, -ve numbers
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
