//buddy

//tis is just a sample of the
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public class Hash {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("Learning Task 1.A:");
        System.out.println("----------------------------------------------");
        String[] array = { "1953-01-21", "1943-03-01", "1955-06-08", "1973-08-21", "1984-05-14", "1934-05-17",
                "1966-08-07", "1956-01-31", "1936-09-12", "1969-12-28", "1973-03-26", "1912-09-07", "1928-12-10",
                "1927-12-12", "1984-01-11", "1938-12-23", "1937-10-28", "1954-12-30" };
        // 18
        for (String a : array) {

            System.out.print(a.hashCode() & 0xFFFFFFF % 100);
            System.out.print(",");
        }
        System.out.println("\n----------------------------------------------");
        System.out.println("Learning Task 1.B:");
        System.out.println("----------------------------------------------");
        String[][] array2 = {
                // {"tens/ones", "0", "1", "2", "3", "4", "5", "6", "7"},

                { "A", "S", "V", "U", "C", "W", "C", "D" }, { "I", "F", "R", "O", "X", "N", "J", "B" },
                { "&", "M", "H", "@", "%", "!", "E", "U" }, { "J", "!", "#", "B", "I", "U", "I", "T" },
                { "T", "Z", "N", "C", "T", "F", "K", "M" }, { "E", "C", "L", "I", "Q", "V", "K", "!" },
                { "G", "*", "H", "D", "N", "C", "$", "P" }, { "R", "D", "G", "E", "$", "A", "O", "^" },
                { "D", "C", "W", "U", "E", "F", "S", "S" }, { "F", "G", "^", "Y", "B", "W", "$", "@" },

        };

        System.out.println("Before sort: \n");
        for (String[] x : array2) {
            for (String y : x) {
                System.out.print(y + "");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        System.out.println("\nAfter sort: ");
        AtomicReference<ArrayList<String>> list = new AtomicReference<>(new ArrayList<>());

        // Add all strings to list.
        for (String[] row : array2) {
            list.get().addAll(Arrays.asList(row));
        }

        Collections.sort(list.get()); // Sort the list.

        System.out.print("\n" + list);
        System.out.println("\n----------------------------------------------");
        System.out.println("Learning Task 2:");
        System.out.println("----------------------------------------------");
        // 18 sets of strings year/month/day
        // 53 each
        String strings = "1953-01-21-1943-03-01-1955-06-08-1973-08-21-1984-05-14-1934-05-17-1966-08-07-1956-01-31-1936-09-12-1969-12-28-1973-03-26-1912-09-07-1928-12-10-1927-12-12-1984-01-11-1938-12-23-1937-10-28-1954-12-30";

        hashFunction(strings);

    }

    static void hashFunction(String strings) {
        // Split string into 3 substrings based from the regex -
        int num1, num2, num3, u, maxNum, I;

        String[] parts = strings.split("-");
        System.out.println("parts length:" + parts.length);

        maxNum = 57;

        u = 3;

        num1 = 0;

        num2 = 1;

        num3 = 2;

        for (I = 0; I < maxNum; I++) {

            String part1 = parts[num1];
            String part2 = parts[num2];
            String part3 = parts[num3];
            // Parsed sub strings to integer
            int firstPart = Integer.parseInt(part1);
            int secondPart = Integer.parseInt(part2);
            int thirdPart = Integer.parseInt(part3);
            // add folding method
            int value = folding(firstPart, secondPart, thirdPart);
            // parsed summed value to string
            String str = Integer.toString(value);

            // Initialize an int variable for your hash to 0
            int hash = 0;
            // Loop to each character index of the String
            for (int i = 0; i < str.length(); i++) {
                hash = 31 * hash + str.charAt(i);
                System.out.print((hash & 0xFFFFFFF) % 20);
                System.out.print(",");
            }

            num1 += u;
            num2 += u;
            num3 += u;

            System.out.println();

        }

    }

    static int folding(int one, int two, int three) {

        return one + two + three;
    }

}
