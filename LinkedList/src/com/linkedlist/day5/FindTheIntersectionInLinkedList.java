package com.linkedlist.day5;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class FindTheIntersectionInLinkedList {

	public static void main(String[] args) {
		int[] arr1 = {3};
		int[] arr2 = {2};

		Node head1 = CreateLinkedList.convertArrayToLinkedList(arr1);
		Node head2 = CreateLinkedList.convertArrayToLinkedList(arr2);
		head2.next = head1;
		
		CreateLinkedList.linkedListTraversal(head1);
		System.out.println("=====");
		CreateLinkedList.linkedListTraversal(head2);
		
		
		Node node = findIntersectionInLL(head1, head2);
		System.out.println("NODE: "+node);
	}
	
	
	//TC: O(n1 +n2)
	public static Node findIntersectionInLL(Node head1, Node head2) {
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		while(temp1!=temp2) {
			
			temp1 = temp1.next;
			temp2 = temp2.next;
			
			if(temp1 == temp2) return temp1;
			
			
			
			if(temp1==null) {
					temp1 = head2;
				}
				
				
			if(temp2==null)
			{
				temp2 = head1;
			}
		}
		
		return null;
	}

}
