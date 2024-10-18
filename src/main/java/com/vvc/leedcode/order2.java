package com.vvc.leedcode;

/**
 * 链表两数相加
 * https://leetcode.cn/problems/add-two-numbers/?envType=study-plan-v2&envId=top-100-liked
 */
public class order2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        int temp = 0; //进位
        while (l1 != null || l2 != null || temp!= 0) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            temp += val1;
            temp += val2;
            ListNode next = new ListNode(temp % 10);
            cur.next = next;
            cur = next;
            temp /= 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummyNode.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
