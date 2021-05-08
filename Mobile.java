package week1.day1;

public class Mobile {
	
	int mobileWeight = 121;
	boolean isFullCharged = true;
	double mobileCost = 60000.0001;

	public void makeCall() {
		System.out.println("\n \t am making a call....");
	}
	
	public void sendMessage() {
		System.out.println("\n \t your message has been sent \n ");
	}
	
	// printing mobile model from a method
	public String getMobModel () {
		String mobileModel = "iphone11";
		System.out.println("Mobile model : " + mobileModel );
		return mobileModel;
	}
	
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.makeCall();
		mobile.sendMessage();
		mobile.getMobModel();
		//String mobModel = mobile.mobileModel;
		
		// printing mobile weight from global variable 
		System.out.println( mobile.mobileWeight );
		
		//printing mobile weight from the local variable
		int mobWeight = mobile.mobileWeight;
		boolean mobCharge = mobile.isFullCharged;
		double mobcost = mobile.mobileCost;
		
		
		//System.out.println("Mobile model : " + mobModel );
		System.out.println("Mobile weight : " + mobWeight );
		System.out.println("Mobile Charge : " + mobCharge );
		System.out.println("Mobile Cost : " + mobcost );
		System.out.println(mobile.isFullCharged);
		
			
		}
	
}
