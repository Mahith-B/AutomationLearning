package week3.day1.overRidingoverLoading;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("amount is deposited");
	}
	
	public static void main(String[] args) {
		
		AxisBank b = new AxisBank();
		b.deposit();
	}

}
