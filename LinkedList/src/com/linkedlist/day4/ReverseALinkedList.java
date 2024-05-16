package com.linkedlist.day4;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class ReverseALinkedList {

	public static void main(String[] args) {
		int[] arr = {1,3, 12, 15};
		
		Node head = CreateLinkedList.convertArrayToLinkedList(arr);
		
		head = reverseALinkedListRecursive(head);
		
		CreateLinkedList.linkedListTraversal(head);
	}
	
	
	public static Node reverseALinkedListRecursive(Node head) {
		
		if(head == null || head.next  == null) return head;
		
		Node newHead = reverseALinkedListRecursive(head.next);
		
		Node front =  head.next;
		
		front.next = head;
		
		head.next = null;
		
		return newHead;
	}
	
	public static Node reverseALinkedList(Node head) {
		Node prev = head;
		
		Node cur = prev.next;
		
		while(cur!=null) {
			
			Node next = cur.next;
			
			cur.next = prev;
			
			prev = cur;
			
			cur =  next;
			
		}
		
		head.next = null;
		
		return prev;
	}

}
