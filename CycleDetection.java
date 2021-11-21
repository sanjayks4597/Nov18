package linkedlist;

class Node1{
	int data;
	boolean flag=false;
	Node1 next;
	Node1(int x){
		data=x;
		next=null;
	}
	
}
public class CycleDetection {

	public static void main(String[] args) {
		
		Node1 head=null;
		Node1 l1=new Node1(7);
		Node1 l2=new Node1(9);
		Node1 l3=new Node1(10);
		Node1 l4=new Node1(13);
		Node1 l5=new Node1(17);
		Node1 l6=new Node1(19);
		
		//link this nodes
		
		head=l1;
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		l6.next=l3;
		
		
		boolean cycle=isCycle(head);
		System.out.println(cycle);
		
		
		

	}
	
	private static boolean isCycle(Node1 head) {
		
		while(head!=null)
		{
			if(head.flag==true)
			{
				return true;
			}
			head.flag=true;
			head=head.next;
			
		}
		return false;
	}
	public static void Print(Node1 head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
}
