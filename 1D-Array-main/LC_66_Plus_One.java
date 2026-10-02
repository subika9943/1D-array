import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                break;
            }
            digits[i] = 0;
        }
        if (digits[0] == 0) {
            int[] b = new int[digits.length + 1];
            b[0] = 1;
            digits = b;
        }
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}
