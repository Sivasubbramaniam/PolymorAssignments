package absinhpolyassignments;

public class Student implements Department{
	
	public String studentName() {
		return "Siva";
	}
	
	public String studentDep() {
		return "ECE";
	}
	
	public int studentID() {
		return 1230987;
	}
	
	@Override
	public String CollegeName() {
		// TODO Auto-generated method stub
		return "VEC";
	}

	@Override
	public int CollegeCode() {
		// TODO Auto-generated method stub
		return 14132;
	}

	@Override
	public int CollegeRank() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String depName() {
		// TODO Auto-generated method stub
		return "ECE";
	}

public static void main(String[] args) {
	
	Student s = new Student();
	
	String colN = s.CollegeName();
	int colC = s.CollegeCode();
	int colR = s.CollegeRank();
	
	 String depN = s.depName();
	System.out.println(colN);
	System.out.println(colC);
	System.out.println(colR);
	System.out.println(depN);
	 
	System.out.println(s.studentName());
	System.out.println(s.studentDep());
	System.out.println(s.studentID());
	
	
	
}}

