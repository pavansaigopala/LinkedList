package com.linkedlist.day2;

public class InsertionInDoublyLinkedList {

	public static void main(String[] args) {
		int[] arr = { 11, 20, 30, 40, 50 , 60};

		DLNode head = DoublyLinkedList.convertArrayToLinkedList(arr);
		
		//DLNode	newHead =	insertingBeforeTail(head, 55);
		
		//head = insertingBeforeKthElement(head, 1, 5);
		
		head = insertingBeforeGivenElement(head, 20, 15);
		
		DoublyLinkedList.DoublylinkedListTraversal(head);
	}
	
	public static DLNode insertingBeforeGivenElement(DLNode head, int givenNode, int data) {
		DLNode temp =  head;
		while(temp!=null) {
			if(temp.data == givenNode)break;
			
			temp = temp.next;
		}
		
		DLNode prev = temp.prev;
		
		if(prev == null) {
			return insertingBeforeHead(head, data);
		}else {
			DLNode newNode = new DLNode(data, temp, prev);
			temp.prev = newNode;
			prev.next = newNode;
		}
		
		return head;
	}
	public static DLNode insertingBeforeKthElement(DLNode head, int kth, int data) {
		if(head==null) return head;
		DLNode temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			
			if(count == kth)break;
			
			temp = temp.next;
		}
		
		DLNode prev = temp.prev;
		if(prev == null) {
			return insertingBeforeHead(head, data);
		}
		else if(temp.next==null) {
			return insertingBeforeTail(head, data);
		}
		else {
			DLNode newNode = new DLNode(data, temp, prev);
			temp.prev = newNode;
			prev.next = newNode;
		}
		return head;
	}
	public static DLNode insertingBeforeTail(DLNode head, int data) {
		
		//if(head.prev == null) return insertingBeforeHead(head, data);
		DLNode temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		DLNode prev = temp.prev;
		
		DLNode newNode = new DLNode(data, temp, prev);
		
		temp.prev = newNode;
		
		prev.next = newNode;
		
		return head;
	}
	
	public static DLNode insertingBeforeHead(DLNode head, int data) {
		
		DLNode dHead =  head;
		DLNode newHead = new DLNode(data, dHead, null);
		dHead.prev = newHead;

		return newHead;
	}

}
