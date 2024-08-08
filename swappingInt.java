package oopj;

public class swappingInt {

	public swappingInt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		// after swapping 
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
