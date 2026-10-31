package ControlStatement;
import java.util.Scanner;
public class ATMWithdraw {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int correctPin = 1234;
	        int balance = 5000;

	        System.out.print("Enter your PIN: ");
	        int pin = sc.nextInt();
	        if (pin != correctPin) {
	            System.out.println("Incorrect PIN");
	        } else {
	            System.out.print("Enter withdrawal amount: ");
	            int amount = sc.nextInt();

	            if (amount <= balance) {
	                balance = balance - amount;
	                System.out.println("Withdrawal Successful");
	                System.out.println("Remaining Balance: ₹" + balance);
	            } else {
	                System.out.println("Insufficient Balance");
	            }
	        }

	        sc.close();
	    }
	}

