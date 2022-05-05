

import java.util.*;
public class Reverse{
	//ListNode = head;
	static class ListNode{
		private int data;
		private ListNode next;
	}
	   void ListNode(int data){
			this.data=data;
			ListNode next = null;
		}
		public ListNode reverse (ListNode head){
			if (head == null){
				return head;
		}
		ListNode current;
		ListNode previous = null;
		Listnode next = null;
		while (current != null){
			next= current.next;
			current.next=previous;
			previous = current;
			current=next;
		}
		return previous;
		void display(){
		ListNode current = head;
		while(current!=null){
			System.out.print(current.data + "");
			current=current.next;
		}
		System.out.print("null");
		}
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(2);
		ListNode fifth = new ListNode(3);
		ListNode sixth = new ListNode(4);
		ListNode seventh = new ListNode(5);
		head.next = second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=seventh;
		Reverse r = new Reverse();
		Reverse.display(head);
		ListNode reverseList = r.reverse(head);
		r.display(reverseList);
		
	}
	
}
