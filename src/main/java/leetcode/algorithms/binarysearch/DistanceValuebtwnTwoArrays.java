package leetcode.algorithms.binarysearch;

import java.util.Arrays;

public class DistanceValuebtwnTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        System.out.println(bin(arr1, arr2, d));
    }

    //brute force
    private static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println("|" + arr1[i] + "-" + arr2[j] + "|");
                if (Math.abs(arr1[i] - arr2[j]) <= d)
                    return i;
            }
        }
        return -1;
    }
//not working
    private static int bin(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            int start = 0;
            int end = arr2.length-1;
            while (start <= end) {
                int mid = (start + end) >>> 1;
                if (Math.abs(arr1[i] - arr2[mid]) <= d) {
                    return i;
                } else if (arr2[mid] < arr1[i])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }
//working
    public static int findTheDistanceValueBin(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            int left = 0;
            int right = arr2.length - 1;
            while (left <= right) {
                int mid = (left + right) >>> 1;
                if (Math.abs(arr1[i] - arr2[mid]) <= d) {
                      ans--;
                    break;
                } else if (arr2[mid] < arr1[i])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return ans;
    }
}
