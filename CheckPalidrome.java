package linkedlist;

import java.util.Stack;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
		next=null;
	}
}
public class CheckPalidrome {

	public static void main(String[] args) {
		
		ListNode head=null;
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(8);
		ListNode l4=new ListNode(7);
		ListNode l5=new ListNode(8);
		ListNode l6=new ListNode(2);
		ListNode l7=new ListNode(1);
		//1287821
		head=l1;
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		l6.next=l7;
		
		boolean b=isPalidrome1(head);
		System.out.println(b);
	}

	private static boolean isPalidrome1(ListNode head) {
	
		Stack<Integer> stk=new Stack<>();
		boolean isPali=true;
		ListNode slow=head;
		while(slow!=null)
		{
			stk.push(slow.val);
			slow=slow.next;
		}
		while(head!=null)
		{
			int i=stk.pop();
			if(head.val==i)
			{
				isPali=true;
			}
			else
			{
				isPali=false;
				break;
				
			}
			head=head.next;
		}
		return isPali;
	}

	private static boolean isPalidrome(ListNode head) {
		
		ListNode slow=head;
        ListNode fast=head;
        ListNode mid=null;
        ListNode s=null;
        ListNode revsered=null;
     while(fast!=null && fast.next!=null)
     {
    	 
       fast=fast.next.next;
       slow=slow.next;
     }
       mid=slow; 
        s=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode curr=s;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        revsered=prev;
        
        while(head!=null)
        {
            if(head.val!=revsered.val)
            {
                return true;
            }
            head=head.next;
        }
        return false;
	}

}
