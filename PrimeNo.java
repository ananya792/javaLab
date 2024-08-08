/**
 * 
 */
package oopj;

/**
 * 
 */
public class PrimeNo {

	/**
	 * 
	 */
	public PrimeNo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 7,count = 0;
		for(int i=1;i<n+1;i++) {
			if(n%i==0){
				count++;
			}
		}if(count == 2) {
			System.out.println("Prime Number");
		}else
			System.out.println("not a prime number");

	}

}
