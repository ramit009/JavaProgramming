package Basics;

public class HelloWorld {
	
	public static void main(String[] args) {
		int s=0;
		for(int i=0;i<args.length;i++) {
			s= s + Integer.parseInt(args[i]);
			System.out.println("sum is " + s);		
		}
	
		System.out.println("Hello World");
		int a=2,b=3;
		System.out.print("Sum is " + (a+b) );

	}


}
