package com.linkedlist.day2;

public class DeletionInDoublyLinkedList {

	public static void main(String[] args) {
		int[] arr = { 11, 20, 30, 40, 50 };

		DLNode head = DoublyLinkedList.convertArrayToLinkedList(arr);
		//System.out.println("Before Deleting head: " + head.data);
		//DLNode newHead = deleteHead(head);
		//System.out.println("After Deleting head : new Head: " + newHead.data);
		
		//DLNode newTail = deleteTail(head);
		//DLNode newNode= deleteKthElelement(head, 3);
		DLNode newNode = deleteGivenNodeInDLL(head, 20);
		DoublyLinkedList.DoublylinkedListTraversal(newNode);
		int newLength = DoublyLinkedList.lengthOfLL(newNode);
		System.out.println("newLength:" + newLength);
		
	}

	public static DLNode deleteTail(DLNode head) {
		
		if(head==null || head.next==null) return null;
		
		DLNode temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		DLNode prev = temp.prev;
		temp.prev = null;
		prev.next = null;

		return head;
	}

	public static DLNode deleteHead(DLNode head) {

		if (head == null || DoublyLinkedList.lengthOfLL(head) == 1)
			return null;
		
		DLNode prev = head;
		head = head.next;
		head.prev = null;
		prev.next = null;

		return head;
	}
	
	public static DLNode deleteKthElelement(DLNode head, int k) {
		if(head==null) return head;
		DLNode temp = head;
		int count=0;
		while(temp!=null) {
			count++;
			
			if(count==k)break;
			
			temp = temp.next;
		}
		
		DLNode prev = temp.prev;
		DLNode next = temp.next;
		// if count == 1
		// single element
		if(prev==null && next==null) return null;
		else if(prev==null) return deleteHead(head);
		else if(next==null) return deleteTail(head);
		else {
			prev.next = next;
			next.prev = prev;
			temp.next = null;
			temp.prev = null;
		}
		
		return head;
	}
	
	public static DLNode deleteGivenNodeInDLL(DLNode head, int data) {
		DLNode temp = head;
		
		while(temp!=null) {
			
			if(temp.data == data) break;
			
			temp = temp.next;
		}
		
		DLNode prev =  temp.prev;
		DLNode next = temp.next;
		
		if(next == null) {
			prev.next = null;
			temp.prev = null;
		}else {
			prev.next =  next;
			next.prev =  prev;
			temp.next = null;
			temp.prev = null;
		}
		
		return head;
	}

}
