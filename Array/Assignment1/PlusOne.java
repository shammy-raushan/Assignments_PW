package AssignmentsPW;

import java.util.Scanner;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        digits[n - 1] += 1;

        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }

        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of digits in the array: ");
        int length = scanner.nextInt();
        int[] digits = new int[length];

        System.out.println("Enter the digits of the integer (from left to right):");
        for (int i = 0; i < length; i++) {
            digits[i] = scanner.nextInt();
        }

        PlusOne incrementor = new PlusOne();
        int[] result = incrementor.plusOne(digits);

        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}
