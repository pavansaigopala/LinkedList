package com.linkedlist.day2;

public class DLNode {
	
	public int data;
	
	DLNode next;
	
	DLNode prev;
	
	DLNode(int data, DLNode next, DLNode prev){
		this.data = data;
		this.next = next;
		this.prev =  prev;
	}
	
	public DLNode(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}

}
