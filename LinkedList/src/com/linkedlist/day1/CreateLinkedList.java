package com.linkedlist.day1;

public class CreateLinkedList {

	public static void main(String[] args) {
		int[] arr = { 11, 41, 52, 67 };

		Node head = convertArrayToLinkedList(arr);
		
		linkedListTraversal(head);
		
		String ans = searchElementInLL(head, 52);
		System.out.println(ans);

		int len = lengthOfLL(head);
		System.out.println(len);
	}

	public static void linkedListTraversal(Node head) {
		// Traversal on linked list
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
	}

	public static String searchElementInLL(Node head, int val) {
		// Search a element in linked list
		Node temp1 = head;

		while (temp1 != null) {

			if (temp1.data == val)
				return "value is present";

			temp1 = temp1.next;
		}
		return "Sorry value is not present";
	}

	public static int lengthOfLL(Node head) {
		Node temp1 = head;
		int count = 0;

		while (temp1 != null) {
			count++;
			temp1 = temp1.next;
		}

		return count;
	}

	public static Node convertArrayToLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;

		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}

		return head;
	}

}
