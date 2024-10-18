package com.vvc.leedcode.TwoPointers;

/**
 * 盛最多水的容器
 * https://leetcode.cn/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-100-liked
 * 在宽度最大的情况下，保证中间的线都比两边短 此时面积就是最大的
 */
public class order2 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int res = 0;
        int area;
        while (l < r) {
            area = Math.min(height[l],height[r])*(r-l);
            res =  Math.max(area,res);
            if(height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
