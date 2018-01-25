package atm;

import org.junit.Assert;
import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldHaveDefaultBalance() {
		// arrange
		Atm underTest = new Atm();

		// act
		double balance = underTest.getBalance();

		// assert
		Assert.assertEquals(500.00, balance, 0.001);
	}

	@Test
	public void shouldWithdrawFifty() {
		Atm underTest = new Atm();
		underTest.withdraw(50);
		double balance = underTest.getBalance();
		Assert.assertEquals(450.00, balance, 0.001);
	}
	
	@Test
	public void shouldHaveStartingBalance() {
		Atm underTest = new Atm(2700.00);
		double balance = underTest.getBalance();
		Assert.assertEquals(2700.00, balance, 0.001);

	}
	
	@Test
	public void shouldAllowAccessByPin() {
		Atm underTest = new Atm();
		boolean check = underTest.allowAccess("1234");
//		Assert.assertEquals(true, check);
		Assert.assertTrue(check);
	}
	
	@Test
	public void shouldDenyAccessByPin() {
		Atm underTest = new Atm();
		boolean check = underTest.allowAccess("3289");
//		Assert.assertEquals(false, check);
		Assert.assertFalse(check);
	}	
	
	@Test
	public void shouldDepositFifty() {
		Atm underTest = new Atm();
		underTest.deposit(50);
		double balance = underTest.getBalance();
		Assert.assertEquals(550.00, balance, 0.001);
	}
	
	@Test
	public void cannotDepositNegativeAmount() {
		Atm underTest = new Atm();
		underTest.deposit(-50);
		double balance = underTest.getBalance();
		Assert.assertEquals(450.00, balance, 0.001);
	}

}