package in.jt;

public class PaymentProcessor {
	public static boolean payBillAmount(String cardType,double amount) {
		if("CREDITCARD".equalsIgnoreCase(cardType)) {
			CreditCardPayment ccp = new CreditCardPayment();
			return ccp.payBill(amount);
		}
		else if("DEBITCARD".equalsIgnoreCase(cardType)) {
			DebitCardPayment dcp = new DebitCardPayment();
			return dcp.payBill(amount);
		}
		else if("ZETACARD".equalsIgnoreCase(cardType)) {
			ZetaCardPayment zcp = new ZetaCardPayment();
			 return zcp.payBill(amount);
		}
		
		
		return false;
	}
}


//java.util.Optional class main intention is avoiding NPE.