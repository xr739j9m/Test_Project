package Data_Structures;

public class DiffAndSum {
    public static void main(String[] args) {
        int rows, cols, sumRow, num1, num2, operation;

        // Initialize matrix a
        int[][] a = { { 35, 42, 59, 64, 76, }, { 8, 9, 10, 11, 12, }, { 20, 18, 28, 31, 23, }, { 6, 13, 17, 19, 21, }

        };

        // Calculates number of rows and columns present in given matrix

        rows = a.length;
        cols = a[0].length;

        // Calculates sum of each row of given matrix

        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + a[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }
        // Calculates difference of each column

        // Cannot subtract if row is set to zero or 1.
        // if (rows == 1 || rows == 0) {
        // System.out.println("Cannot subtract Columns.");
        // } else {
        // for (int i = 0; i < cols; i++) {
        // operation = 0;
        // num2 = 0;
        //
        //
        // for (int j = 0; j < rows; j++) {
        // num1 = a[j][i];
        //
        //
        // if (operation == 0) {
        // operation = num1 - num2;
        // } else {
        // operation -= num1;
        // }
        //
        //
        // }
        //
        //
        // System.out.println("Difference of " + (i + 1) + " column: " + operation);
        // }
        // }

        // Calculates difference of each column
        // when array is more than 1
        for (int i = 0; i < cols; i++) {
            operation = 0;
            num2 = 0;

            for (int j = 0; j < rows; j++) {
                num1 = a[j][i];

                if (operation == 0) {
                    operation = num1 - num2;
                } else {
                    operation -= num1;
                }

            }

            System.out.println("Difference of " + (i + 1) + " column: " + operation);

        }
    }
}
