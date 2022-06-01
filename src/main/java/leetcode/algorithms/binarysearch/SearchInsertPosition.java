package leetcode.algorithms.binarysearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 6, 7, 9, 88};
        int key = 5;
        System.out.println(searchInsert(num, key));

    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int notFound = -1;
        while (start <= end) {
            int mid = (start + end) >>> 1;
            if (nums[mid] < target) {
                start = mid + 1;
                notFound = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
                notFound = mid;
            } else
                return mid;
        }
        return notFound;
    }

    public int searchInser(int[] nums, int target) {
        int end = nums.length - 1;
        int start = 0;
        int mid = 0;
        while (start < end) {
            mid = end / 2;
            if (target < nums[mid])
                end = mid / 2;
            else if (target > nums[mid]) {
                start = mid + 1;
            } else if (target == nums[mid])
                return mid;
        }
        return mid;
    }
}
