package com.linkedlist.day5;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;
import com.linkedlist.day4.ReverseALinkedList;
public class PalindromeCheck {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,5,4,3,2,1};

		Node head = CreateLinkedList.convertArrayToLinkedList(arr);
		
		boolean result = palindromeCheck(head);
		
		System.out.println(result);
	}
	
	public static boolean palindromeCheck(Node head) {
		
		Node temp = head;
		
		// tow pointer approach
		Node slow = temp;
		Node fast = temp;
		
		while(fast.next!=null && fast.next.next!=null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
		}
		Node newHead = ReverseALinkedList.reverseALinkedList(slow.next);
		temp = head;
		Node tempNew = newHead;
		boolean result = true;
		while(tempNew!=null) {
			if(temp.data != tempNew.data) {
				result = false;
				break;
			}
			temp = temp.next;
			tempNew = tempNew.next;
		}
		
		ReverseALinkedList.reverseALinkedListRecursive(newHead);
		
		return result;
	}

}
