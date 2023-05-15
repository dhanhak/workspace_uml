package test;

public class Benz extends Car {

	private static int price;
	
	public Benz() {
		
	}
	public Status autoDrive() {
		return new Status();
	}

	@Override
	protected void specialFunction() {
		System.out.println("추상메서드 구현입니다.");
	}
}
