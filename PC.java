package absinhpolyassignments;

public class PC extends Desktop{

	@Override
	public String computerModel() {
		// TODO Auto-generated method stub
		return super.computerModel();
	}

	@Override
	public String DesktopSize() {
		// TODO Auto-generated method stub
		return super.DesktopSize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PC p = new PC();
		String model = p.computerModel();
		String size = p.DesktopSize();
		
		System.out.println(model);
		System.out.println(size);
		
}
}
