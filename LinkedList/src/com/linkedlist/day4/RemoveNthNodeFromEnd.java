package com.linkedlist.day4;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		
		int[] arr = {1,2};
		int n = 2;
		Node head = CreateLinkedList.convertArrayToLinkedList(arr);
		head= removeNthNodeFromEnd(head, 1);
		CreateLinkedList.linkedListTraversal(head);
	}
	
	public static Node removeNthNodeFromEnd(Node head, int n) {
		Node fast = head;
		
		Node slow = head;
		
		while(n!=0) {
			n--;
			fast = fast.next;
		}
		
		System.out.println("fast: "+fast.data);
		System.out.println("slow: "+slow.data);
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			
			fast = fast.next;
		}
		
		if(slow == head && fast==null) return slow.next;
		else {
			slow.next = slow.next.next;
			return head;
		}
	}

}
