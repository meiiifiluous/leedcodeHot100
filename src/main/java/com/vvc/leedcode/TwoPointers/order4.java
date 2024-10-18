package com.vvc.leedcode.TwoPointers;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class order4 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(height);
    }
    public static int trap(int[] height) {
        int n = height.length;
        int[] plus = new int[n+1];

        for (int i = 0; i < n; i++) {
            plus[i] = height[i];
        }
        Deque<Integer> stack = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            while (!stack.isEmpty() && plus[stack.peek()] < plus[i]) {
                int currIndex = stack.pop();
                if (!stack.isEmpty()) {
                    int w = i - stack.peek() - 1;
                    int h = Math.min(plus[i], plus[stack.peek()]) - plus[currIndex];
                    sum += w * h;
                }
            }
            stack.push(i);
        }
        return sum;
    }
}
