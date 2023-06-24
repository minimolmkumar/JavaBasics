package demo;
/** Demo for final keyword When we declare a variable using final, 
the value cannot be changed; any attempts 
at doing so will cause an error to occur:
*/
public class FinalKeyword {

	
		public static void main(String[] args) { 
	    final  double pi = 3.14;
	     // pi = 4.12; Error thrown as final value cannot be reassigned with another value
	      System.out.println(pi);
			
		}
	
}
