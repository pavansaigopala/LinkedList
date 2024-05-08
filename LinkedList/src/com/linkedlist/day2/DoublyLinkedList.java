package com.linkedlist.day2;


public class DoublyLinkedList {

	public static void main(String[] args) {
		int[] arr = {1,3,2,4,5,6};
		
		// convert array into doubly linked list
		DLNode head = convertArrayToLinkedList(arr);
		
		DoublylinkedListTraversal(head);
		searchElementInLL(head, 6);
		lengthOfLL(head);
	}
	
	public static void DoublylinkedListTraversal(DLNode head) {
		// Traversal on linked list
		DLNode temp = head;

		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println("---");
	}
	
	public static void searchElementInLL(DLNode head, int val) {
		// Search a element in linked list
		DLNode temp1 = head;

		while (temp1 != null) {

			if (temp1.data == val) {
				System.out.println("value is present");
				return;
			}

			temp1 = temp1.next;
		}
		System.out.println("Sorry value is not present");
	}
	
	public static int lengthOfLL(DLNode head) {
		DLNode temp1 = head;
		int count = 0;

		while (temp1 != null) {
			count++;
			temp1 = temp1.next;
		}

		System.out.println(count);
		
		return count;
	}
	

	public static DLNode convertArrayToLinkedList(int[] arr) {
		DLNode head = new DLNode(arr[0]);
		DLNode prev = head;

		for (int i = 1; i < arr.length; i++) {
			DLNode temp = new DLNode(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}

		return head;
	}

}


