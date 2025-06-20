package week4.day1;

public class Amazon extends CanaraBank {
	
public void recordPaymentDetails()
{
System.out.println("Record Payment Details");
};

	public static void main(String[] args) {
	Amazon DetailsOfPayment = new Amazon();
	DetailsOfPayment.cashOnDelivery();
	DetailsOfPayment.upiPayments();
	DetailsOfPayment.cardPayments();
    DetailsOfPayment.internetBanking();
	DetailsOfPayment.recordPaymentDetails();
	}
	}

