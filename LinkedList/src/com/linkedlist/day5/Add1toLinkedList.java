package com.linkedlist.day5;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;
import com.linkedlist.day4.ReverseALinkedList;

public class Add1toLinkedList {

	public static void main(String[] args) {
		int[] arr = {9,9,9,9};

		Node head = CreateLinkedList.convertArrayToLinkedList(arr);
		
		int carry = add1ToLinkedListRecursion(head);
		
		if(carry==1) {
			Node newNo = new Node(carry);
			newNo.next = head;
			head = newNo;
		}
		
		CreateLinkedList.linkedListTraversal(head);
		
	}
	
	
	// back tracking approach
	// TC: O(N)
	public static int add1ToLinkedListRecursion(Node node) {
		if(node==null) return 1;
		
		int carry = add1ToLinkedListRecursion(node.next);
		
		if(node.data+carry>=10) {
			node.data=0;
			return 1;
		}else {
			return 0;
		}
	}
	
	// TC: O(3N)
	public static Node add1toLinkedList(Node head) {
		Node temp = head;
		
		Node newNode = ReverseALinkedList.reverseALinkedList(temp);
		
		Node tempNew = newNode;
		int carry = 1;
		
		while(tempNew!=null) {
			int data = tempNew.data + carry;
			
			if(data >= 10) {
				tempNew.data = 0;
				carry = 1;
			}else {
				tempNew.data = tempNew.data + carry;
				carry = 0;
				break;
			}
			
			tempNew = tempNew.next;
		}
		
		head = ReverseALinkedList.reverseALinkedListRecursive(newNode);
		
		if(carry==1) {
			Node newNo = new Node(carry);
			newNo.next = head;
			return newNo;
		}else return head;
	}

}
