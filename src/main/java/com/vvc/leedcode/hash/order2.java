package com.vvc.leedcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *  字母异位词分组
 *  https://leetcode.cn/problems/longest-consecutive-sequence/?envType=study-plan-v2&envId=top-100-liked
 */
public class order2 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            // String s = chars.toString();
            String s = new String(chars);
            if (hashMap.containsKey(s)) {
                hashMap.get(s).add(str);
            } else {
                ArrayList<String> ans = new ArrayList<>();
                ans.add(str);
                hashMap.put(s,ans);
            }
        }
        return new ArrayList<>(hashMap.values());
    }
}
