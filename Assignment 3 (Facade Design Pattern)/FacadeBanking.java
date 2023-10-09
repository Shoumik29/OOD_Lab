import java.util.*;  
import java.util.Scanner;


interface Manager{
	void checkBalance(int insertAccountNumber);
	void saveDeposit(int insertAccountNumber, int amount);
	void makeInvestment(int insertAccountNumber, int amount);
}


class BranchRajshahi implements Manager{

	int accountNumber = 1234;
	int balance = 1000;
	int deposit = 0;
	int investment = 0;
	
	public int getAccountNumber(){ 
		return accountNumber;
	} 	
	public void checkBalance(int insertAccountNumber){
		if(insertAccountNumber == getAccountNumber()){
			System.out.println("Account is available");
			System.out.println("Balance: "+balance);
			System.out.println("Deposit: "+deposit);
			System.out.println("Investment: "+investment);
		}
		else{
			System.out.println("Account is not available");
		}
	}
	public void saveDeposit(int insertAccountNumber, int amount){
		if(insertAccountNumber == getAccountNumber()){
			deposit += amount;
			System.out.println("Branch Rajshahi");
		}
		else System.out.println("Wrong Account Number");
	}
	public void makeInvestment(int insertAccountNumber, int amount){
		if(insertAccountNumber == getAccountNumber()){
			investment += amount;
			System.out.println("Branch Rajshahi");
		}
		else System.out.println("Wrong Account Number");
	} 
}

class BranchRangpur implements Manager{

	int accountNumber = 1234;
	int balance = 1000;
	int deposit = 0;
	int investment = 0;
	
	public int getAccountNumber(){ 
		return accountNumber;
	} 	
	public void checkBalance(int insertAccountNumber){
		if(insertAccountNumber == getAccountNumber()){
			System.out.println("Account is available");
			System.out.println("Balance: "+balance);
			System.out.println("Deposit: "+deposit);
			System.out.println("Investment: "+investment);
		}
		else{
			System.out.println("Account is not available");
		}
	}
	public void saveDeposit(int insertAccountNumber, int amount){
		if(insertAccountNumber == getAccountNumber()){
			deposit += amount;
			System.out.println("Branch Rangpur");
		}
		else System.out.println("Wrong Account Number");
	}
	public void makeInvestment(int insertAccountNumber, int amount){
		if(insertAccountNumber == getAccountNumber()){
			investment += amount;
			System.out.println("Branch Rangpur");
		}
		else System.out.println("Wrong Account Number");
	} 
}

class BranchDhaka implements Manager{
	
	int accountNumber = 1234;
	int balance = 1000;
	int deposit = 0;
	int investment = 0;
	
	public int getAccountNumber(){ 
		return accountNumber;
	} 	
	public void checkBalance(int insertAccountNumber){
		if(insertAccountNumber == getAccountNumber()){
			System.out.println("Account is available");
			System.out.println("Balance: "+balance);
			System.out.println("Deposit: "+deposit);
			System.out.println("Investment: "+investment);
		}
		else{
			System.out.println("Account is not available");
		}
	}
	public void saveDeposit(int insertAccountNumber, int amount){
		if(insertAccountNumber == getAccountNumber()){
			deposit += amount;
			System.out.println("Branch Dhaka");
		}
		else System.out.println("Wrong Account Number");
	}
	public void makeInvestment(int insertAccountNumber, int amount){
		if(insertAccountNumber == getAccountNumber()){
			investment += amount;
			System.out.println("Branch Dhaka");
		}
		else System.out.println("Wrong Account Number");
	} 
}


class Bank{
	
	private Manager rajshahi;
	private Manager rangpur;
	private Manager dhaka;
	
	public Bank(){
		rajshahi = new BranchRajshahi();
		rangpur = new BranchRangpur();
		dhaka = new BranchDhaka();
	}
	
	public void checkBalanceRajshahi(int accountNumber){
		rajshahi.checkBalance(accountNumber);
	}
	
	public void checkBalanceRangpur(int accountNumber){
		rangpur.checkBalance(accountNumber);
	}
	
	public void checkBalanceDhaka(int accountNumber){
		dhaka.checkBalance(accountNumber);
	}
	
	public void saveDepositRajshahi(int accountNumber, int amount){
		rajshahi.saveDeposit(accountNumber, amount);
	}
	
	public void saveDepositRangpur(int accountNumber, int amount){
		rangpur.saveDeposit(accountNumber, amount);
	}
	
	public void saveDepositDhaka(int accountNumber, int amount){
		dhaka.saveDeposit(accountNumber, amount);
	}
	
	public void makeInvestmentRajshahi(int accountNumber, int amount){
		rajshahi.makeInvestment(accountNumber, amount);
	}
	
	public void makeInvestmentRangpur(int accountNumber, int amount){
		rangpur.makeInvestment(accountNumber, amount);
	}
	
	public void makeInvestmentDhaka(int accountNumber, int amount){
		dhaka.makeInvestment(accountNumber, amount);
	}
}



class FacadeBanking{
   public static void main(String args[]){
   
      Bank bank = new Bank(); 
      
      bank.checkBalanceDhaka(1234);	
      System.out.println();
      bank.saveDepositDhaka(1234, 200);
      bank.checkBalanceDhaka(1234);
      System.out.println();
      bank.makeInvestmentDhaka(1234, 900);
      bank.checkBalanceDhaka(1234);
      System.out.println();
      bank.checkBalanceDhaka(1235);
   }
}





/**/
