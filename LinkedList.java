package computerScience;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Node.java;

public class LinkedList {
	
	
	private Node head;
	
	public LinkedList(){
		head = null;
		
	}
	public LinkedList(Node p){
		head = p;
		
	}
	public static String getInput()throws Exception{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer1 = new BufferedReader(input);
		return buffer1.readLine();
	}
	public void addNodeEnd(Node p){
		Node snaker = head;
		if(head == null){
			head = p;
		}
		else{
			while(snaker.getNext()!=null){		// what is the difference between snaker and snaker.getnext() here
				//System.out.println(snaker.getData());
				snaker = snaker.getNext();
			}
			snaker.setNext(p);
				
		}	
		
		
		
			
	}
	public void addNodeFront(Node n){
		
	}
	public boolean isEmpty (){
		boolean flag = false;
		return flag;
		
	}
	public void printThatNode(Node p){
		System.out.println(p);
		System.out.println(p.getData()); 
	}
	public void printItAll(){		
		Node snaker = head;
		System.out.println(snaker.getData());
		while(snaker!=null&&snaker.getNext()!=null){
			snaker = snaker.getNext();
			System.out.println(snaker.getData());
			
		}
	}
	public int countNodes(){
		int counter = 1;
		Node snaker = head;
		while(snaker!=null&&snaker.getNext()!=null){
			snaker = snaker.getNext();
			//System.out.println(counter);
			counter++;
		}
		return counter;
	}
	public void addFront (){
		
	}
	public static void main(String[]args) throws Exception{
		
		LinkedList myList = new LinkedList();
		String answer = "";
		int userResponse = 0;
		String secondAnswer = "";
		int storingThis = 0;
		boolean letsGo = true;
	
		
		
		while(letsGo){
			System.out.println("Please enter a value: 1 to continue or 0 to stop or 2 to print or 3 to count nodes");
			answer = getInput();
			userResponse = Integer.parseInt(answer);
			
			if(userResponse == 1){
				System.out.println("what number do you want to store?");
				secondAnswer = getInput();
				storingThis = Integer.parseInt(secondAnswer);
				Node firstNode = new Node();
				firstNode.setData(storingThis);
				myList.addNodeEnd(firstNode);
				//myList.printItAll(firstNode);
				
			}
			if(userResponse == 2){
				myList.printItAll();
			}
			
			if(userResponse == 0){
				System.out.println("ok bye");
				letsGo = false;
			}
			if(userResponse == 3){
				int x =myList.countNodes();
				System.out.println(x);
			}
		}
		
		
	}
}
