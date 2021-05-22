package week3.day1;

public class Audi extends Car {
	
	public void airbag() {
		System.out.println("air bag");
	}
	
	public static void main(String[] args) {
		Audi a = new Audi();
		a.airbag();
		a.applyBreak();
		a.handBreak();
		a.seatBelt();
		a.sounfHorn();
		
		
		
	}

}
