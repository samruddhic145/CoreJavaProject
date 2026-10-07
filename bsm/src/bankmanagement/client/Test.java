package bankmanagement.client;
import java.util.Scanner;

import bankmanagement.service.*;
import bankmanagement.serviceImpl.*;
public class Test {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Rbi bank = new Sbi();
		int choice;
		do {
			 System.out.println("BANK MANAGEMENT SYSTEM");
			 System.out.println(         );
			 System.out.println("1.Create Account");
			 System.out.println("2.Display account details");
			 System.out.println("3.Deposit Money");
			 System.out.println("4.Withdraw money");
			 System.out.println("5.Balance Check");
			 System.out.println("6.Exit");
			 System.out.println("Enter Your Choice:");
			   choice = sc.nextInt();
			   if (choice ==1) {
				   bank.createAccount();
			   }else if (choice ==2) {
				   bank.displayAllDetails();			
			   }else if (choice ==3) {
				   bank.depositMoney();
			   }else if(choice==4) {
				   bank.withdrawal();
			   }else if(choice ==5) {
				   bank.balanceCheck();
			   }else if (choice==6) {
				   System.out.println("Thank You for Using Bank Management System!!!!");
			   }else {
				  System.out.println("Invalid choice Please Try Again");
			   }
			     
		}while(choice != 6);
		 sc.close();
		
	}

}
