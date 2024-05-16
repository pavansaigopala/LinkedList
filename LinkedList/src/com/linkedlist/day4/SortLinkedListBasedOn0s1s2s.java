package com.linkedlist.day4;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class SortLinkedListBasedOn0s1s2s {

	public static void main(String[] args) {
		int[] arr = {1,0,1,2,0,2,1};

		Node head = CreateLinkedList.convertArrayToLinkedList(arr);
		
		head = sortLinkedListBasedOn0s1s2sRearrangeLinks(head);
		
		CreateLinkedList.linkedListTraversal(head);

	}
	
	public static Node sortLinkedListBasedOn0s1s2sRearrangeLinks(Node head) {
		
		Node zeroHead= new Node(-1); 
		Node zero= zeroHead;
		Node oneHead= new Node(-1); 
		Node one= oneHead;
		Node twoHead= new Node(-1); 
		Node two = twoHead;
		
		Node temp = head;
		
		while(temp!=null) {
			//System.out.println("temp: data: "+temp.data);
			if(temp.data == 0) {
					zero.next = temp;
					zero = zero.next;
			}
			else if(temp.data == 1) {
				one.next = temp;
				one = one.next;
			}
			else{
				two.next = temp;
				two = two.next;
			}
			
			temp = temp.next;
		}
		
		
		zero.next = (oneHead.next!=null)? oneHead.next : twoHead.next;
		
		one.next = twoHead.next;
		
		two.next = null;
		
		return zeroHead.next;
	}

}
