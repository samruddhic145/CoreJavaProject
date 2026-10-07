package bankmanagement.serviceImpl;
import java.util.Scanner;

import bankmanagement.model.Account;
import bankmanagement.service.*;

public class Sbi implements Rbi {
	Scanner sc = new Scanner(System.in);
	Account acc = new Account();
	public void createAccount() {
		System.out.println("Create Account");
		System.out.println("Enter Account Number:");
		  acc.setaccNo(sc.nextInt());
		  sc.nextLine();
		  
	    System.out.println("Enter Name :");
		  acc.setname(sc.nextLine());
		 System.out.println("Enter Mobile No:");
		  acc.setmobNo(sc.nextLine());
		 System.out.println("Enter Adhar No :");
		  acc.setadharNo(sc.nextLine());
		 System.out.println("Enter Gender :"); 
		   acc.setgender(sc.nextLine());
	     System.out.println("Enter Age :");
	        acc.setage(sc.nextInt());
		 System.out.println("Enter Opening Balance :");   
		     acc.setbalance(sc.nextDouble());
		 System.out.println("Account Created Successfully !!!");
	}
		 
    public void displayAllDetails() {
    	System.out.println("Account details");
    	System.out.println("Account Number:"+ acc.getaccNo());
    	System.out.println("name:"+ acc.getname());
    	System.out.println("Mobile No:"+ acc.getmobNo());
    	System.out.println("Aadhar Number:"+acc.getadharNo());
    	System.out.println("Gender:"+ acc.getgender());
    	System.out.println("Age"+ acc.getage());
    	System.out.println("Balance:"+ acc.getbalance());
    }

	@Override
	public void depositMoney() {
		System.out.println("Enter Amount to Deposit:");
		  double amount = sc.nextDouble();
		  acc.setbalance(acc.getbalance()+amount);
	    System.out.println("Money Deposited Successfully!!!");
	    System.out.println("Current Balance:"+acc.getbalance());
}

	@Override
	public void withdrawal() {
		System.out.println("Enter Amount to WithDraw:");
		double amount = sc.nextDouble();
		if(amount <= acc.getbalance()) {
			 acc.setbalance(acc.getbalance()-amount);
			 System.out.println("WithDrawal Successful!!!");	 
			 System.out.println("Remaining Balance:"+ acc.getbalance());
		}else {
			System.out.println("Insufficient Balance!!!");
		}
		
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("Current Balance:"+acc.getbalance());
}
	}
