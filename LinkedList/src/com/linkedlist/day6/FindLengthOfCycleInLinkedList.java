package com.linkedlist.day6;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class FindLengthOfCycleInLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Node head = CreateLinkedList.convertArrayToLinkedList(arr);

		Node last = head.next.next.next.next.next.next.next.next;
		last.next = head.next.next;

		int result = detectCycleUsingTortoiseHare(head);

		System.out.println(result);

	}

	// TC: O(N)
	// SC: O(1)
	public static int detectCycleUsingTortoiseHare(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return findLenghtOfCycle(slow, fast);
			}
				
		}

		return 0;
	}
	
	public static int findLenghtOfCycle(Node slow, Node fast) {
		int count = 1;
		fast = fast.next;
		while(slow!=fast) {
			fast = fast.next;
			count++;
		}
		return count;
	}

}
