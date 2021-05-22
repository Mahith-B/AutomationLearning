package week3.day1.overRidingoverLoading;

public class Calculator {
	
	//add
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("add 1 : " +c);
	}
	public void add(int a, int b, int c) {
		int d= a+b+c;
		System.out.println("add 2 : " + c);
	}
	
	//mul
	public void mul( int a, int b) {
		int c = a*b;
		System.out.println("mul 1 :" +c);
	}
	public void mul(int a, double b) {
		double c=  (a*b);
		System.out.println("mul 2 :" + c);
	}
	
	//sub
	public void sub(int a, int b) {
		System.out.println("sub 1 :" + (a-b));
	}
	public void sub(double a, double b) {
		System.out.println("sub 2 :" + (a-b));
	}
	
	
	//div
	public void div(int a, int b) {
		System.out.println("div 1 :" + (a/b));
	}
	public void div(double a, int b) {
		System.out.println("div 1 :" + (a/b));
	}
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10, 11);
		c.add(10, 11, 12);
		c.sub(10, 5);
		c.sub(10.55, 10.00);
		c.mul(10, 11.222);
		c.mul(10, 21);
		c.div(10, 5);
		c.div(10.55, 5);
	}

}
