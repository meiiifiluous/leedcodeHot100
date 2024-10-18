package com.vvc.leedcode.hash;

import java.util.HashSet;

/**
 * 最长连续序列
 * https://leetcode.cn/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class order3 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            hashSet.add(i);
        }
        int count = 0;
        int res = 0;
        for (int i : nums) {
            //没有之前的数字，说明这个数字为头
            if (!hashSet.contains(i-1)) {
                count = 1;
                int cur = i;
                //判断是否有后置数字
                while(hashSet.contains(cur+1)) {
                    //存在说明是中间数字
                    count++;
                    cur++;
                }
            }
            //结束了 说明到尾部
            res = Math.max(res,count);
        }
        return res;
    }
}
