
public class CarType2 extends CarType1 {
	
	private String owner;
	
	public CarType2(String owner) {
		this.owner = owner;
		System.out.println("Car type 2 is being built");
	}
	
	public void updateOwner(String newOwner) {
		//
		this.owner = newOwner; 
	}
	public String getOwner() {
		return this.owner; 
	}
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
//		super.drive();
		System.out.println("Car type 2 is driving");
	}
	
	public void drive(int mile) {
		System.out.println("Car type 2 is driving at: " + mile );
	}
	
	public void drive(String mile) {
		System.out.println("Car type 2 is driving at: (string)" + mile );
	}
	
}
