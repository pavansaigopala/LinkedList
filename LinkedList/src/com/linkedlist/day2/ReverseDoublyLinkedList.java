package com.linkedlist.day2;

public class ReverseDoublyLinkedList {

	public static void main(String[] args) {
		int[] arr = { 11, 20, 30, 40, 50 };

		DLNode head = DoublyLinkedList.convertArrayToLinkedList(arr);
		
		head = reverseDoublyLinkedListOpt(head);
		
		DoublyLinkedList.DoublylinkedListTraversal(head);
		
	}
	
	public static DLNode reverseDoublyLinkedListOpt(DLNode head) {
		DLNode current = head;
		DLNode last = current.prev;
		while(current!=null) {
			
			last = current.prev;
			
			current.prev = current.next;
			
			current.next =  last;
			current =  current.prev;
		}
		System.out.println(last.data);
		return last.prev;
	}
	
	public static DLNode reverseDoublyLinkedList(DLNode head) {
		DLNode temp = head;
		
		while(temp!=null) {
			
			DLNode prev = temp.prev;
			DLNode next = temp.next;
			
			temp.prev = next;
			temp.next = prev;
			
			head = temp;
			temp = temp.prev;
			
		}
		System.out.println(head.next.data);
		System.out.println(head.data);
		return head;
	}

}
