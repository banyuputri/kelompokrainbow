class Node 
{
	public int data;
	public Node next;
	public Node prev;
	public Node (int id)
	{
		data = id;
	}
	
	public void displayLink()
	{
		System.out.print("{"+ data + "}");
	}
}

class LinkList
{
	private Node head;
	private Node tail;
	public LinkList()
	{
		head=tail=null;
	}
	public boolean isEmpty()
	{
		return (head==null);
	}
	public void insertBack(int id)
	{
		Node newNode = new Node (id);
		if (tail == null)
		{
		head = tail = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	public Node deleteFirst()
	{
		Node temp = head;
		head.prev = null;
		head = head.next;
		return temp;
	}
	
	public void displayForward()
	{
		Node current = head;
		while (current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println(" ");
	}
	
	public void displayBackward()
	{
		Node current = tail;
		while(current != null)
		{
			current.displayLink();
			current=current.prev;
		}
		System.out.println("");
	}
}
class DoubleLink
{
	public static void main (String[] args)
	{
		LinkList theList = new LinkList();
		System.out.println("Initializing Double Linked List :");
		theList.insertBack(22);
		theList.insertBack(24);
		theList.insertBack(66);
		theList.insertBack(88);
		System.out.print("Display Forward:");
		theList.displayForward();
		System.out.print("\n DIsplay Backward:");
		theList.displayBackward();
		System.out.println("");
		System.out.println("Delete List From Head");
		while ( !theList.isEmpty() )
		{
			Node aLink = theList.deleteFirst();
			System.out.print("Delete");
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayForward();
	}
}
		