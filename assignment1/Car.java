package assignment1;

public class Car {

	public void carBreak() {
		System.out.println("apply break");
		
	}
	public void carGear() {
		System.out.println("apply gear");
		
	}
	public void carAclartor() {
		System.out.println("increase aclator");
		
	}
	public void carAc() {
		System.out.println("switch on ac");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car input=new Car();
		input.carAc();
		input.carAclartor();
		input.carBreak();
		input.carGear();

	}

}
