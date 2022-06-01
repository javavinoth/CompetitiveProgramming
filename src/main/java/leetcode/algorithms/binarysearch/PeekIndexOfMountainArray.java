package leetcode.algorithms.binarysearch;

import java.util.Arrays;

public class PeekIndexOfMountainArray {

    public static void main(String[] args) {
        int[] num = {24, 69, 100, 99, 79, 78, 67,36, 26, 19};
//        Invalid mountain array?
//        int[] num = {24, 69, 100, 99, 79, 78, 67, 200,36, 26, 19};
//        System.out.println(getPeak(num));
        System.out.println(search(num,0,num.length-1));

    }

    public static int search(int[] nums, int l, int r) {
        if (l == r)
            return l;
        int mid = (l + r) / 2;
        if (nums[mid] > nums[mid + 1])
            return search(nums, l, mid);
        return search(nums, mid + 1, r);
    }

    private static int getPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) >>> 1;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else
                end = mid;
        }
        return start;

    }
}
