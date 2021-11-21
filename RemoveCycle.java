package linkedlist;
class Node2{
	int data;
	boolean flag=false;
	Node2 next;
	Node2(int x){
		data=x;
		next=null;
	}
}
public class RemoveCycle {

	public static void main(String[] args) {
		Node2 head=null;
		Node2 l1=new Node2(7);
		Node2 l2=new Node2(9);
		Node2 l3=new Node2(10);
		Node2 l4=new Node2(13);
		Node2 l5=new Node2(17);
		Node2 l6=new Node2(19);

		head=l1;
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		l6.next=l2;
		
		head=CycleRemove(head);
		Print(head);
	}
	private static Node2 CycleRemove(Node2 head) {
		
		
		Node2 slow=head;
		Node2 fast=head.next;
		while(slow!=null)
		{
			if(fast.flag==true)
			{
				slow.next=null;
			}
			fast.flag=true;
			slow=slow.next;
			fast=fast.next;
		}
		return head;
	}
	public static void Print(Node2 head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
}
