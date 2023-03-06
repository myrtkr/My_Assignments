package week3day1;

public class Students {
	public int getStudentInfo(int id) {
		return id;
	}
public void getStudentInfo(int id1, String name) {
	System.out.println(id1);
	System.out.println(name);
		
	}
public void getStudentInfo(long phoneNumber, String email) {
	System.out.println(phoneNumber);
	System.out.println(email);
	
    }
public static void main(String[] arg) {
	Students student = new Students();
	int id2 = student.getStudentInfo(6745);
	student.getStudentInfo(id2, "Mayuri Thakur");
	student.getStudentInfo(89345850, "mayuri.thakur@gmail.com");
	
} 

}
