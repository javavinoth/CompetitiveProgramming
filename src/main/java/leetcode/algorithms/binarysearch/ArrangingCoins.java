package leetcode.algorithms.binarysearch;

public class ArrangingCoins {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(arrangeCoins(n));
        System.out.println((int) (Math.sqrt(2 * (long) n + 0.25) - 0.5));
        System.out.println("************");
    }

    public static int arrangeCoins(int n) {
        long start = 0, end = n;
        long mid, curr;
        while (start <= end) {
            mid = (start + end) >>> 1;
            curr = mid * (mid + 1) / 2;

            if (curr == n) return (int) mid;

            if (n < curr) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) end;
    }
}
