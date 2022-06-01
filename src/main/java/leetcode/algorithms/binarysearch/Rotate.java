package leetcode.algorithms.binarysearch;

public class Rotate {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
//        System.out.println(search(nums, target));
//        System.out.println(search(nums,0,nums.length-1,target));
    }

//    static int search(int arr[], int start, int end, int key)
//    {
//        if (start > end)
//            return -1;
//
//        int mid = (start + end) >>> 1;
//        if (arr[mid] == key)
//            return mid;
//
//        /* If arr[l...mid] first subarray is sorted */
//        if (arr[start] <= arr[mid]) {
//            /* As this subarray is sorted, we
//               can quickly check if key lies in
//               half or other half */
//            if (key >= arr[start] && key <= arr[mid])
//                return search(arr, start, mid - 1, key);
//            /*If key not lies in first half subarray,
//           Divide other half  into two subarrays,
//           such that we can quickly check if key lies
//           in other half */
//            return search(arr, mid + 1, end, key);
//        }
//
//        /* If arr[l..mid] first subarray is not sorted,
//           then arr[mid... h] must be sorted subarray*/
//        if (key >= arr[mid] && key <= arr[h])
//            return search(arr, mid + 1, h, key);
//
//        return search(arr, l, mid - 1, key);
//    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) >>> 1;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                return mid;

        }
        return -1;
    }
}
