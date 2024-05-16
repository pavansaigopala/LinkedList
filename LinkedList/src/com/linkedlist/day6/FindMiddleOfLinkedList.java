package com.linkedlist.day6;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class FindMiddleOfLinkedList {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};

		Node head = CreateLinkedList.convertArrayToLinkedList(arr);
		
		Node middle = findMiddleNodeTortoiseHare(head);
		
		System.out.println(middle.data);
	}
	
	public static Node findMiddleNodeTortoiseHare(Node head) {
		Node slow = head;
		Node fast = head;
		
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			
			fast = fast.next.next;
			
		}
		
		
		return slow;
	}
	
	public static Node findMiddleNodeUsingNlengthApproach(Node head) {
		Node temp = head;
		
		int len = 0;
		
		while(temp!=null) {
			len++;
			
			temp = temp.next;
		}
		
		len = (len/2)+1;
		temp = head;
		
		while(len!=1) {
			len--;
			temp= temp.next;
		}
		
		return temp;
	}
}
