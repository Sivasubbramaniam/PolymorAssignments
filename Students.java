package absinhpolyassignments;

public class Students {
	
	
public void getStudentInfo(int ID) {
		
		
		System.out.println(ID);
}
	
	public void getStudentInfo(int ID,String name) {
		

		System.out.print(ID);
		System.out.print(name);
	}
	
	public void getStudentInfo(String email,String num) {
		String studEmail = "John@amazon.com";
		String phnum = "0987654321";
		System.out.println(studEmail);
		System.out.println(phnum);
		
	}

public static void main(String[] args) {

	Students S = new Students();
	S.getStudentInfo(123);
	S.getStudentInfo(123, "John");
	S.getStudentInfo("john@amazon.com", "0987654321");
	
	
	
}}