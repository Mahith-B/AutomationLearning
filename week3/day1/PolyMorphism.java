package week3.day1;

public class PolyMorphism {

	public void printEmpDetails(int EmpID) {
		System.out.println(EmpID);
	}
	
	public void printEmpDetails(String EmpName, int EmpID) {
		System.out.println(EmpID + EmpName);
	}
	
	public void printEmpDetails(int EmpID, String EmpName) {
		System.out.println(EmpID + EmpName);
	}
	
	/*  will throw error - same method name and same args
	 * public void printEmpDetails(int EmpNum, String name) {
	 * System.out.println(EmpID + EmpName); }
	 */
	
	
	
	
	public static void main(String[] args) {
		PolyMorphism p = new PolyMorphism();
		p.printEmpDetails(10);
		p.printEmpDetails(11, "Mahith");
		p.printEmpDetails("Mahi", 21);
		p.printEmpDetails(22);
	}
	
	
	
}
