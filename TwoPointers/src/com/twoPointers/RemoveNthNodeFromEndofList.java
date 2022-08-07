package com.twoPointers;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



public class RemoveNthNodeFromEndofList {
//    public static void main(String[] args) {
//        Listnode head = new Listnode();
//    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        if (head.next == null){
            head = null;
            return head;
        }
        ListNode nextPtr = head;
        ListNode prevPtr = null;
        ListNode ptr = head;

        for (int i = 0; i < n-1; i++) {
            ptr = ptr.next;
        }

        while(ptr.next != null){
            prevPtr = nextPtr;
            nextPtr = nextPtr.next;
            ptr = ptr.next;
        }

        if(prevPtr != null){
            prevPtr.next = nextPtr.next;
        }
        else{
            prevPtr = ptr;
            head = nextPtr.next;
        }

        return head;
    }
}
