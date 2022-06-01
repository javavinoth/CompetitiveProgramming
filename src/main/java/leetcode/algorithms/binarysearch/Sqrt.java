package leetcode.algorithms.binarysearch;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        if(x==1)
            return x;
        int start = 1;
        int end = x / 2;
        while (start <= end) {
            int mid = (start + end) /2;
            if ((mid * mid) == x) {
                return mid;
            } else if ((mid * mid) < x) {
                if(x<(mid*mid)+1 )
                    return mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
    public static int mySqr(int x) {
        if (x < 2) return x;

        int left = 2;
        int right = x/2;

        while (left <= right) {
            int mid = left + (right - left)/2;
            long square = mid * mid;

            if (square > x) {
                right = mid - 1;
            } else if (square < x) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return right;
    }
}
