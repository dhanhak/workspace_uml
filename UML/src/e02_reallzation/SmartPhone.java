package e02_reallzation;

public class SmartPhone implements USBType{

	@Override
	public void bootup() {
		System.out.println("실행할 수 있는 기능 목록 보여주기");
	}
	
}
