package base;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Sorry, you cannot withdrawl that amount with your current balance. Your balance must be greater than "
				+ "or equal to the amount you want to withdrawl.");
	}

}
