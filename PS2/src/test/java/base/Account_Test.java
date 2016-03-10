package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Account_Test {
	
	Account c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@Before
	public void setUp() throws Exception {
		c = new Account(1122, 20000);
		c.setAnnualInterestRate(.045);
	}
	
	@After
	public void tearDown() throws Exception {
		c = null;
	}
	@Test
	public void testAccount() {//default constructor testing
		Account a =new Account();
		assertEquals(a.getId(),0);
		assertTrue(a.getBalance()==0);
		assertTrue(0==a.getBalance());
		assertTrue(a.getAnnualInterestRate()==0);
		assertFalse(a.getBalance()==1);
		assertFalse(a.getBalance()!=0);
		assertFalse(a.getAnnualInterestRate()==1);
		
		a.setBalance(10);
		a.setId(10);
		a.setAnnualInterestRate(10);
		
		assertTrue(a.getBalance()==10);
		assertTrue(a.getId() == 10);
		assertTrue(a.getAnnualInterestRate()== 10);
		// TODO
	}

	@Test
	public void testAccountArg() throws InsufficientFundsException {
		assertEquals(c.getId(),1122);
		assertTrue(c.getBalance()==20000);
		assertTrue(c.getAnnualInterestRate() == .045);
		
		c.withdraw(2500);
		c.deposit(3000);
		assertTrue(c.getBalance()==20500);
		System.out.println("The balance is $"+c.getBalance()+" the monthly interest is"+c.getMonthlyInterestRate()+"and the date"
				+"the account was created is"+c.getDateCreated());
		
		
		
	}
	@Test(expected=InsufficientFundsException.class)
	public void testAccountArgTwo() throws InsufficientFundsException {
		assertEquals(c.getId(),1122);
		assertTrue(c.getBalance()==20000);
		assertTrue(c.getAnnualInterestRate() == .045);
		
		c.withdraw(210000);
		
		
	}


}
