package com.vvc.leedcode.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * https://leetcode.cn/problems/3sum/?envType=study-plan-v2&envId=top-100-liked
 */
public class order3 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int i = 0 ; i < n ; i ++) {
            // 去重 【-1，-1，0，1，2】【-1，0，1】已经在答案里了
            if ( i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int r = n-1;
            int target = -nums[i];
            for (int l = i+1 ; l < r; l++) {
                // 去重【-4，-1，-1，0，1，2】【-1，0，1】已经在答案里了
                if (l != i + 1 && nums[l] == nums[l-1]) {
                    continue;
                }
                while(nums[l] + nums[r] > target && r > l) {
                    r--;
                }
                if (l==r) {
                    break;
                }
                if (nums[l] + nums[r] ==target) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                }
            }
        }
        return res;
    }
}
