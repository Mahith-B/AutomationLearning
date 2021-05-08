package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8, firstNum=0, secNum=1, sum;
		System.out.println(firstNum );
		System.out.println(secNum );
		for(int i=0; i<n; i++) {
			sum=firstNum+secNum; //1
			firstNum=secNum; //1
			secNum=sum;
			System.out.println(sum); //0 
		}
		
		}

}
