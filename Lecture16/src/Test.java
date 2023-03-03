import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;
import components.naturalnumber.NaturalNumber2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new CarType2("Rui");
		System.out.println(myCar.getOwner());
		myCar.owner = "123"; 
//		System.out.println(myCar.owner);
//		myCar.drive("123");
		NaturalNumber num1 = new NaturalNumber2(new NaturalNumber2(2));
	}

}
