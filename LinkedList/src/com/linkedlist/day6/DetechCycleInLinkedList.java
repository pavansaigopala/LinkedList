package com.linkedlist.day6;

import java.util.HashMap;
import java.util.Map;

import com.linkedlist.day1.CreateLinkedList;
import com.linkedlist.day1.Node;

public class DetechCycleInLinkedList {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};

		Node head = CreateLinkedList.convertArrayToLinkedList(arr);
		
		Node last = head.next.next.next.next.next.next.next.next;
		last.next = head.next.next;
		
		boolean result = detectCycleUsingTortoiseHare(head);
		
		System.out.println(result);
		
	}
	
	
	// TC: O(N)
	// SC: O(1)
	public static boolean detectCycleUsingTortoiseHare(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) return true;
		}
		
		return false;
	}
	
	
	// TC: O(N)
	// SC: O(N)
	public static boolean detectCycleUsingVisitedHashMap(Node head) {
		
		Map<Node, Integer> vis = new HashMap<Node, Integer>();
		
		Node temp = head;
		
		while(temp!=null) {
			
			if(vis.get(temp)==null){
				vis.put(temp, temp.data);
			}else {
				return true;
			}
			
			temp = temp.next;
		}
		
		return false;
	}

}
