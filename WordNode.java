package computerScience;

public class WordNode {
	private String wordUp;		//capable of looking at other word nodes
	private LetNode LetHead;
	private WordNode next;
	
	
	public WordNode ( )
	{
		wordUp = "";
		LetHead = null;
		next = null;
	}
	
	public WordNode (String x, WordNode p, LetNode z )
	{
		wordUp = x;
		next = p;
		LetHead = z;
	}
	
	public void setWordUp ( String c)
	{
		wordUp = c;
	}
	public void setNext (WordNode p)
	{	
		next = p;
	}
	public void setLetHead(LetNode z)
	{
		LetHead = z; 
	}
	public String getWordUp ()
	{
		return wordUp;
	}
	
	public WordNode getNext ()
	{
		return next;
	}
	public LetNode getLetHead()
	{
		return LetHead;
	}
	public static void main(String[] args) {
		
	}
}
