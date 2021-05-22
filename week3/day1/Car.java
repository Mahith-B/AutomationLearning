package week3.day1;

public class Car  extends Vehicle  {

	public void handBreak( ) {
		
		System.out.println("apply handBreak");
	}
	
	public void seatBelt() {
		System.out.println("wear seat belt");
	}
	
	
	
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Car c = new Car();
		v.applyBreak();
		v.sounfHorn();
		c.applyBreak();
		c.sounfHorn();
		c.handBreak();
		c.seatBelt();
		
		
	}
	
	
	
}

