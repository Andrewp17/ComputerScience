package computerScience;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LetterLinkedList {
private LetNode headLet;
	
	public LetterLinkedList(){
		headLet = null;
		
	}
	public LetterLinkedList(LetNode p){
		headLet = p;
		
	}
	public static String getInput()throws Exception{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer1 = new BufferedReader(input);
		return buffer1.readLine();
	}
	public void addLetNodeEnd(LetNode p){
		LetNode snaker = headLet;
		if(headLet == null){
			headLet = p;
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
	public void printThatLetNode(LetNode p){
		//System.out.println(p);
		System.out.println(p.getLet()); 
	}
	public void printItAll(){		
		LetNode snaker = headLet;
		System.out.println(snaker.getLet());
		while(snaker!=null&&snaker.getNext()!=null){
			snaker = snaker.getNext();
			System.out.println(snaker.getLet());
			
		}
	}
	public int countNodes(){
		int counter = 1;
		LetNode snaker = headLet;
		while(snaker!=null&&snaker.getNext()!=null){
			snaker = snaker.getNext();
			//System.out.println(counter);
			counter++;
		}
		return counter;
	}
	public static void main(String[]args) throws Exception{
		
		LetterLinkedList myList = new LetterLinkedList();
		String answer = "";
		int userResponse = 0;
		String secondAnswer = "";
		char storingThis = 0;
		boolean letsGo = true;
		int x = 0;
		int wordLength = 0;
		
	
		System.out.println("Enter a string");
		answer = getInput();
		
		while(answer.charAt(x)!=46){
			//System.out.println(answer);
			storingThis = answer.charAt(x);
			System.out.println(storingThis);
			LetNode firstLetNode = new LetNode();
			firstLetNode.setLet(storingThis);
			myList.addLetNodeEnd(firstLetNode);
			x++;
			
			
		}
			
			
			
			
			
			
			
			
			/*
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
		}*/
		
		
	}
}
