/**
 * 
 */
package oopj;

/**
 * 
 */
public class Factorial {

	/**
	 * 
	 */
	public Factorial() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1, n = 5;
		int fact = 1; //= n * i;
		//System.out.println(i);
		for(i=1;i<=n;i++) {
			fact = fact * i ;
		}
		System.out.println("The factorial of n is "+fact);
	}

}
