package Wiley_core_java;

interface Bank{
	void account();
}

interface Bank1 {
	void account();
}

interface ATM extends Bank,Bank1{
	void inserCard();
	void selectOption();
	void enterPassword();
}

interface AA{
	void m1();
	
}

abstract class NewATM implements ATM,AA
{
	public void accounts() {
}
	public void m1() {
}
}
		
public class InterfaceBank extends NewATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inserCard() {
		// TODO Auto-generated method stub
		System.out.println("insert card");
	}

	@Override
	public void selectOption() {
		// TODO Auto-generated method stub
		System.out.println("select option");
	}

	@Override
	public void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("enter password");
	}

	@Override
	public void account() {
		// TODO Auto-generated method stub
		
	}

}

