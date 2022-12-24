package absinhpolyassignments;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("this is fixed deposit");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//overriding
		AxisBank AB = new AxisBank();
		AB.deposit();
		

	}

}
