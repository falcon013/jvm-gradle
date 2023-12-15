package org.example2;
// Each element in a linked list is a node and has a pointer to the next element.
// + you can add and remove elements at any position, not having fixed sizes
// - there is no random access, to access the 150,000th element => to start at the head and iterate 150,000 times


import java.util.List;

public class LinkedList_Main {
    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;

        ListNode head = one;

        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);

    }
}
