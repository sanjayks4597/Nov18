package linkedlist;

public class FindMiddleNode {

	public static void main(String[] args) {
		
		Node head=null;
		Node l1=new Node(1);
		Node l2=new Node(2);
		Node l3=new Node(3);
		Node l4=new Node(4);
		Node l5=new Node(5);
		
		//link the nodes
		head=l1;
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;

		head=PrintFromMiddle(head);
		Print(head);
	}

	private static void Print(Node head) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		
	}

	private static Node PrintFromMiddle(Node head) {
		
		Node curr=head;
		int count=-1;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		if(count%2!=0)
		{
			count=count/2+count%2;
		}
		else
			count=count/2;
		while(count>0)
		{
			head=head.next;
			count--;
		}
		return head;
		
	}

}
