package computerScience;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordLinkedList {
private WordNode head;
	
	public WordLinkedList(){
		head = null;
		
	}
	public WordLinkedList(WordNode p){
		head = p;
		
	}
	public static String getInput()throws Exception{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer1 = new BufferedReader(input);
		return buffer1.readLine();
	}
	public void addWordNodeEnd(WordNode p){
		WordNode snaker = head;
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
	public void printThatWordNode(WordNode p){
		System.out.println("location of the word node:" + p);
		System.out.println("location of the next word node:" + p.getWordUp()); 
		System.out.println("location of the letter list within:" + p.getLetHead());
	}
	public void printItAll(){		
		WordNode snaker = head;
		System.out.println(snaker.getWordUp());
		while(snaker!=null&&snaker.getNext()!=null){
			snaker = snaker.getNext();
			System.out.println(snaker.getWordUp());
			
		}
	}
	public int countNodes(){
		int counter = 1;
		WordNode snaker = head;
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
		
		LetterLinkedList myLetList = new LetterLinkedList();
		WordLinkedList myWordList = new WordLinkedList();
		String answer = "";
		int userResponse = 0;
		String secondAnswer = "";
		String storingThis = "";
		boolean letsGo = true;
		int x = 0;
		int wordLength = 0;
		String loc = "";
		
	
		System.out.println("Enter a string");
		answer = getInput();
		
		
		while(answer.charAt(x)!=46){		//until theres a period
			LetNode firstLetNode = new LetNode();
			WordNode firstWordNode = new WordNode();
		
			
			if(x==0){	//at the very start
				firstWordNode.setLetHead(firstLetNode);
				
				
			}
			
			if(answer.charAt(x)!=32){		//if not a space
				
				firstLetNode.setLet(answer.charAt(x));
				myLetList.addLetNodeEnd(firstLetNode);
				
					
			}
							
			if(answer.charAt(x)==32){							//if space
				//System.out.println("SPACE");
				firstWordNode.setLetHead(firstLetNode);
				loc = firstWordNode.getWordUp();
				System.out.println("GET WORDUP YIELDS" + loc);
				//firstWordNode.setNext();
			}
			
			System.out.println(x + "---------");
			x++;
			myWordList.printThatWordNode(firstWordNode);
			myLetList.printThatLetNode(firstLetNode);
			//myLetList.printItAll();
		}
		
		//myLetList.printItAll();
				
	}
}
