package leetcode.algorithms.binarysearch;

public class FirstLastPosition {

    public static void main(String[] args) {
        searchRange(new int[]{1, 2, 3, 3, 4, 5}, 3);
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int left = -1;
        int right = -1;
        while (start <= end) {
            mid = start + end >>> 1;
            if (nums[mid] == target) {
                int l = mid - 1;
                int r = mid + 1;
                if (nums[l] == target && nums[r] == target) {
                    left = l;
                    right = r;
                    end = right;
                } else if (nums[l] == target) {
                    start = l;
                    end = mid;
                } else if (nums[r] == target) {
                    right = r;
                    end = right;
                }
            }
        }
        return new int[]{start, end};

    }
}
