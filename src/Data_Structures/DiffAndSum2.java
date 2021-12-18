package Data_Structures;

import java.util.Arrays;
import java.util.Scanner;

public class DiffAndSum2 {
    public static void main(String[] args) {
        int rows, cols, sumRow, num1, num2, diffCol;

        Scanner input = new Scanner(System.in);

        boolean key1;
        boolean key2;

        do {
            System.out.print("Enter row size from 1-10 only: ");

            rows = input.nextInt();
            key1 = rows > 10 || rows == 0;
            if (rows > 10 || rows == 0) {
                System.out.println("Invalid size of Rows.Try Again.");
            }
        } while (key1);

        do {
            System.out.print("Enter column size from 1-10 only: ");
            cols = input.nextInt();

            key2 = cols > 10 || cols == 0;
            if (cols > 10 || cols == 0) {
                System.out.println("Invalid size of Columns.Try Again.");
            }
        } while (key2);

        // set array
        int[][] a = new int[rows][cols];

        // set elements

        System.out.println("Enter elements from 1-100 only:");

        boolean loop;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                do {
                    a[i][j] = input.nextInt();
                    loop = a[i][j] > 100;
                    if (loop) {
                        System.out.println("Invalid element. Try Again");
                    }
                } while (loop);
            }

        }
        System.out.print((Arrays.deepToString(a)) + "\n");
        System.out.println();

        // calculate rows
        if (rows == 1) {
            System.out.println("Cannot add rows.");
        } else {
            for (int i = 0; i < rows; i++) {
                sumRow = 0;
                for (int j = 0; j < cols; j++) {
                    sumRow = sumRow + a[i][j];
                }
                System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
            }
        }

        // calculate columns
        if (rows == 1) {
            System.out.println("Cannot subtract Columns.");
        } else {
            for (int i = 0; i < cols; i++) {
                diffCol = 0;
                num2 = 0;

                for (int j = 0; j < rows; j++) {
                    num1 = a[j][i];

                    if (diffCol == 0) {
                        diffCol = num1 - num2;
                    } else {
                        diffCol -= num1;
                    }

                }

                System.out.println("Difference of " + (i + 1) + " column: " + diffCol);
            }
        }
        input.close();
    }
}
