package e02_reallzation;

public class ExternalStorage implements USBType{

	@Override
	public void bootup() {
		System.out.println("폭더 내용 보여주기 실행!");
	}
	
}
