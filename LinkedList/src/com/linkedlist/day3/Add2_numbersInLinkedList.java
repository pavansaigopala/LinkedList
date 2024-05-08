package com.linkedlist.day3;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class Add2_numbersInLinkedList {

	public static void main(String[] args) {
		int[] arr1 = {3,5};
		int[] arr2 = {4,5,9,9};

		Node head1 = CreateLinkedList.convertArrayToLinkedList(arr1);
		Node head2 = CreateLinkedList.convertArrayToLinkedList(arr2);
		
		Node head = add2NumbersDummyNode(head1 , head2);
		
		CreateLinkedList.linkedListTraversal(head);
	}
	
	public static Node add2NumbersDummyNode(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		
		Node dummyNode = new Node(-1);
		Node current = dummyNode;
		if(head1== null || head2 == null) return null;
		int carry = 0;
		
		
		while(temp1!=null || temp2 != null) {
			
			int sum = carry;
			if(temp1!=null)sum += temp1.data;
			if(temp2!=null)sum += temp2.data;
			
			Node newNode = new Node(sum%10);
			
			carry = sum/10;
			
			if(temp1!=null) temp1 = temp1.next;
			if(temp2!=null)temp2 = temp2.next;
			
			current.next = newNode;
			current = current.next;
			
		}

		if(carry!=0) {
			Node newNode = new Node(carry);
			current.next = newNode;
		}
		
		
		return dummyNode.next;
	}
	
	public static Node add2Numbers(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		
		
		if(head1== null || head2 == null) return null;
		int carry = 0;
		Node newNode = new Node(carry);
		Node head = newNode;
		while(true) {
			
			int num = newNode.data;
			if(temp1!=null)num += temp1.data;
			if(temp2!=null)num += temp2.data;
			
			carry = num/10;
			
			newNode.data = (num%10);
			
			if(temp1==null && temp2 == null && carry==0) break;
			newNode.next = new Node(carry);
			
			newNode = newNode.next;
			if(temp1!=null) temp1 = temp1.next;
			if(temp2!=null)temp2 = temp2.next;
			
			
			
		}
		return head;
	}

}
