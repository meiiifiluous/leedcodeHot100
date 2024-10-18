package com.vvc.leedcode;

/**
 * 寻找两个正序数组的中位数 二分查找
 * https://leetcode.cn/problems/median-of-two-sorted-arrays/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class order4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        return (getK(nums1,nums2,0,len1-1,0,len2-1,(len1+len2+1)/2)
                +getK(nums1,nums2,0,len1-1,0,len2-1,(len1+len2+2)/2))*0.5;
    }
    static int getK(int[] nums1, int[] nums2, int l1, int r1, int l2, int r2, int k) {
        int len1 = r1-l1+1;
        int len2 = r2-l2+1;
        if(len1 == 0 ){
            return nums2[l2+k-1];
        }
        if(len2 == 0 ){
            return nums1[l1+k-1];
        }
        if (k == 1) {
            return Math.min(nums1[l1],nums2[l2]);
        }
        int index1 = l1+Math.min(len1,k/2)-1;
        int index2 = l2+Math.min(len2,k/2)-1;
        if(nums1[index1] > nums2[index2]) {
            return getK(nums1,nums2,l1,r1,index2+1,r2,k-(index2-l2+1));
        } else {
            return getK(nums1,nums2,index1+1,r1,l2,r2,k-(index1-l1+1));
        }
    }
}
