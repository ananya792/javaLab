package oopj;

public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int r, temp;
		int sum = 0, n = 6565;
		temp = n;
		while(n>0) {
			r = n%10;
			sum = (sum *10) + r;
			n = n/10;
			
		}
		if(temp==sum) {
			System.out.println("The number is a Palindrome");
		}else 
			System.out.println("The number is not a Palindrome");			
	}

}
