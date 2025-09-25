class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]merge = new int[nums1.length+nums2.length];
        int l = 0,r = 0,k = 0;
        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] <= nums2[r]) {
                merge[k++] = nums1[l++];
            } else {
                merge[k++] = nums2[r++];
            }
        }

        // Copy remaining elements
        while (l < nums1.length) {
            merge[k++] = nums1[l++];
        }
        while (r < nums2.length) {   // fixed here
            merge[k++] = nums2[r++];
        }

        int n = merge.length;
        if (n % 2 == 1) {
            return merge[n / 2]; // odd length → middle element
        } else {
            return (merge[n / 2 - 1] + merge[n / 2]) / 2.0;
    }
}
}