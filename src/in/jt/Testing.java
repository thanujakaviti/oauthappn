package in.jt;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Card Type");
		String cardType = scanner.next();				//AC
		
		System.out.println("Enter how much amount need to pay");
		double amount = scanner.nextDouble();			//2000
		
		boolean status = PaymentProcessor.payBillAmount(cardType, amount);
		
		if(!status) {
			System.out.println("Kindly Enter Card Type Name Properly...!!!");
		}
	}
}
