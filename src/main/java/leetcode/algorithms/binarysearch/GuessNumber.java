package leetcode.algorithms.binarysearch;

import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {

    public static void main(String[] args) {

    }
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = (start+end)>>>1;
            int pick = getPick(mid);
            if (pick == 0) {
                return mid;
            }
            if (pick == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }

    private static int getPick(int i){
//        if(i<)
        return ThreadLocalRandom.current().nextInt(1, 100);

    }
}
