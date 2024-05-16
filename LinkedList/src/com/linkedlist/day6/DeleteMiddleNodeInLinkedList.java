package com.linkedlist.day6;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class DeleteMiddleNodeInLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		Node head = CreateLinkedList.convertArrayToLinkedList(arr);

		 if(head==null || head.next==null) System.out.println("linked list is empty");
		head = deleteMiddleNodeInLinkedList(head);

		CreateLinkedList.linkedListTraversal(head);
	}

	// TC: O(N)
	// SC: O(1)
	public static Node deleteMiddleNodeInLinkedList(Node head) {
		Node slow = head;
		Node fast = head;
		
		fast = fast.next.next;
		
		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

		}
		
		slow.next = slow.next.next;
		
		return head;
	}
}
