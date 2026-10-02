import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();
        List<Boolean> a = new ArrayList<>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                a.add(true);
            } else {
                a.add(false);
            }
        }
        System.out.println(a);
    }
}
