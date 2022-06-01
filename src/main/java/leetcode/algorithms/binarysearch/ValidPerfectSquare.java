package leetcode.algorithms.binarysearch;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(binSqrt(25));
//        System.out.println(isPerfectSquare(25));
    }

    private static boolean binSqrt(int num) {
        if (num == 1) {
            return true;
        }
        int start = 1;
        int end = num / 2;
        while (start <= end) {
            int mid = (start + end) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static boolean isPerfectSquare(int num) {
        int s = 0;
        int e = num;
        while (s <= e) {
            long mid = s + (e - s) / 2;

            if (num < mid * mid) {
                e = (int) mid - 1;
            } else if (num > mid * mid) {
                s = (int) mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    private static double sqrt(double X) {
        for (int i = 1; i < X; ++i) {
            int p = i * i;
            if (p == X) {
                // perfect square
                return i;
            }
            if (p > X) {
                // found left part of decimal
                return sqrt(X, i - 1, i);
            }
        }
        return Double.NaN;
    }


    private static double sqrt(double X, double low, double high) {
        double mid = (low + high) / 2;
        double p = mid * mid;
        // uncomment below line to see how we reach the final answer
        // System.out.println(low + " " + high + " " + mid + " " + p);

        if (p == X || (Math.abs(X - p) < 0.0000001)) {
            return mid;
        }
        if (p < X) {
            return sqrt(X, mid, high);
        }
        return sqrt(X, low, mid);
    }

}
