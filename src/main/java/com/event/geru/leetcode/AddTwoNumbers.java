package com.event.geru.leetcode;

import com.event.geru.leetcode.lib.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * @author vikram
 *
 */
public class AddTwoNumbers {

	public static ListNode sumList(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		int carry = 0;
		ListNode result = dummyHead;

		while (l1 != null || l2 != null) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;

			int sum = x + y + carry;
			carry = sum / 10;

			result.next = new ListNode(sum % 10);
			result = result.next;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;

			System.out.println(x + " " + y);

		}
		if (carry > 0) {
			result.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

	public static void main(String args[]) {

		ListNode l1;
		ListNode a = new ListNode(1);
		l1 = a;
		a.next = new ListNode(2);
		a = a.next;
		a.next = new ListNode(7);

		ListNode l2;
		a = new ListNode(3);
		l2 = a;
		a.next = new ListNode(5);

		a = a.next;
		a.next = new ListNode(6);

		ListNode result = sumList(l1, l2);

		while (l1 != null) {
			System.out.print(" " + l1.val);

			l1 = l1.next;
		}

		System.out.println();

		while (l2 != null) {
			System.out.print(" " + l2.val);
			l2 = l2.next;
		}

		System.out.println();

		while (result != null) {
			System.out.print(" " + result.val);
			result = result.next;
		}

	}

}
