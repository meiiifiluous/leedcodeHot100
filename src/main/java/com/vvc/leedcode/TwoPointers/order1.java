package com.vvc.leedcode.TwoPointers;

/**
 * 移动零
 * https://leetcode.cn/problems/move-zeroes/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class order1 {
    //需要一个记录往前移动到哪一个位置的指针
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (index < i) {
                nums[index] = nums[i];
            }
            index++;
        }
        for (int i = index ; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
