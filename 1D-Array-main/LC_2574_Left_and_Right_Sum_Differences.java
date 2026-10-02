import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int l = 0;
            int r = 0;
            for (int j = 0; j < i; j++) {
                l += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                r += nums[j];
            }
            int ab = Math.abs(l - r);
            a[i] = ab;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
