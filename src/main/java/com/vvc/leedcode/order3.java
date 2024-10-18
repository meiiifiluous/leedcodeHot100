package com.vvc.leedcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串 滑动窗口
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class order3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0 , right = 0;
        int res = 0;
        while (right < s.length()) {
            char c = s.charAt(right++);
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
            while(hashMap.get(c) > 1) {
                char l = s.charAt(left++);
                hashMap.put(l,hashMap.get(l)-1);
            }
            res = Math.max(res,right-left);
        }
        return  res;
    }
}

