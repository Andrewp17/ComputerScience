package computerScience;

public class Node {
	private int data;
	private Node next;
	
	
	public Node ( )
	{
		
	}
	
	public Node (int x, Node p )
	{
		data = 0;
		next = null;
	}
	
	public void setData ( int c)
	{
		data = c;
	}
	public void setNext (Node p)
	{	
		next = p;
	}
	
	public int getData ()
	{
		return data;
	}
	
	public Node getNext ()
	{
		return next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node Matt = new Node();
		Node Aidan = new Node();
		Node Andrew = new Node();
		Node Ian = new Node();
	
	Matt.setData(20);	
	System.out.println(Matt); // this should be the address
	System.out.println(Matt.getData()); // this should be the info
	
	Matt.setNext(Aidan);
	Aidan.setData(80);
	System.out.println(Aidan); // this should be the address
	System.out.println(Aidan.getData()); // this should be the info
	
	Aidan.setNext(Andrew);
	Andrew.setData(100);
	System.out.println(Andrew); // this should be the address
	System.out.println(Andrew.getData()); // this should be the info
	
	Andrew.setNext(Ian);
	Ian.setData(12);
	System.out.println(Ian); // this should be the address
	System.out.println(Ian.getData()); // this should be the info
	
		
		
	}// ends main
}// ends class



