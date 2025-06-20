package week4.day1;

public abstract class CanaraBank implements Payments {

	
	public abstract void recordPaymentDetails();
	
	public void cashOnDelivery()
	{
		System.out.println("Cash On Delivery");
	};
	public void upiPayments()
	{
		System.out.println("UPI Payments");
	};
	public void cardPayments()
	{
		System.out.println("Card Payments");
	};
	public void internetBanking()
	{
		System.out.println("Internet Banking");
	};
	
}
