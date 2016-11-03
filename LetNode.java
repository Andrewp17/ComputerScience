package computerScience;

public class LetNode {
		private char let;
		private LetNode next;
		
		
		public LetNode ( )
		{
			
		}
		
		public LetNode (char x, LetNode p )
		{
			let = 0;
			next = null;
		}
		
		public void setLet ( char c)
		{
			let = c;
		}
		public void setNext (LetNode p)
		{	
			next = p;
		}
		
		public int getLet ()
		{
			return let;
		}
		
		public LetNode getNext ()
		{
			return next;
		}
		
		public static void main(String[] args) {
			
		}
	
}
