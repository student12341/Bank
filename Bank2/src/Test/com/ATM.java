package Test.com;

import java.util.Scanner;

public class ATM {
	
	private int balance;
	public ATM(int initialBalance) {
		this.balance = initialBalance;
		}
	public int getBalance() {
		return this.balance;
	}
	public boolean withdraw(int amount) {
		if(amount > this.balance) {
			return false;
		}
		this.balance  -= amount;
		return true;
	}
	public void deposit(int amount) {
		this.balance += amount;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ins = new Scanner(System.in);
		
		ATM atm = new ATM(1000);
		while(true) {
			System.out.println("1. View Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposite");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice :");
			int choice = ins.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Your Balance is :"+atm.getBalance());
				break;
			case 2:
				System.out.println("Enter the Amount to Withdraw :");
				int wdamount = ins.nextInt();
				boolean success = atm.withdraw(wdamount);
				if(success) {
					System.out.println("Withdraw Succeefull");
				}else {
					System.out.println("Insufficient Balance...");
					
					}
				break;
			case 3:
				System.out.println("Enter the amount to deposite ");
				int dpamount = ins.nextInt();
				atm.deposit(dpamount);
				System.out.println("Deposite Successfull..");
				break;
			case 4:
				System.out.println("Thanks of using ATM");
				System.exit(0);
				break;
				default:
					System.out.println("Invalid Choice");
				
			}
			
		}

	}


}
