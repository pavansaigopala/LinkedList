package com.linkedlist.day3;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1,3,4,2,5,6 };

		Node head = CreateLinkedList.convertArrayToLinkedList(arr);

		//head = createOddEvenLinkedList(head);
		
		//CreateLinkedList.linkedListTraversal(head);
		System.out.println("----------------");
		head = changingLinksOfLinkedList(head);
		
		CreateLinkedList.linkedListTraversal(head);
	}
	
	public static Node changingLinksOfLinkedList(Node head) {
		
		Node odd = head;
		Node even = head.next;
		Node evenHead = even;
		
		while(even!=null && even.next!=null) {
			odd.next = odd.next.next;
			odd = odd.next;
			
			even.next = even.next.next;
			even = even.next;
		}
		odd.next = evenHead;
		
		return head;
	}
	
	public static Node createOddEvenLinkedList(Node head) {
		
		Node temp = head;
		int count = 1;
		
		Node dummyOdd = new Node(-1);
		Node dummyEven = new Node(-1);
		Node currentOdd = dummyOdd;
		Node currentEven = dummyEven;
		while(temp!=null) {
			Node newNode = new Node(temp.data);
			if(count%2==0) {
				currentEven.next =  newNode;
				currentEven = currentEven.next;
			}else {
				currentOdd.next =  newNode;
				currentOdd = currentOdd.next;
			}
			
			temp = temp.next;
			count++;
		}
		
		currentOdd.next = dummyEven.next;
		
		return dummyOdd.next;
	}

}
