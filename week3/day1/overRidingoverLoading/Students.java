package week3.day1.overRidingoverLoading;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(" student information ID is : " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println(" student information id and name " + id + " " + name);
	}
	
	public void getStudentInfo(String emailID, long phoneNum) {
		System.out.println(" student information email and phonenum " + emailID + " and " + phoneNum);
	}
	
	
	public static void main(String[] args) {
		Students S = new Students();
		S.getStudentInfo(21);
		S.getStudentInfo(21, "Mahith");
		S.getStudentInfo("mahi.india1994@gmail.com", 1234567890);
		
	}
	
}
