import java.util.Scanner;

public class Account {
	
	String username;
	int password;
	double balance=0;
	
	
	public Account(String username, int password, double balance) {
		this.username=username;
		this.password=password;
		this.balance=balance;
	}
	
	
// Method for deposit	
public void deposit() {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter the amount for deposit.");
	double amount =input.nextDouble();
		if(amount<=0)
			System.out.println("Invalid input! Please try again.");
		else
			balance+=amount;
			System.out.println("Transaction complete! Your new balance status is:" + balance);
}



// Method for withdrawal
public void withdraw() {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter the amount for withdraw.");
	double amount =input.nextDouble();
		if(amount>balance) {
			System.out.println("Insufficient funds!");
			}
		else if(amount<=0) {
			System.out.println("Invalid input");
		}
		else {
			balance-=amount;
			System.out.println("Transaction complete! Your new balance status is:" + balance);
			}	
		}

public double getBalance() {
	return balance;
}


public String getUsername() {
	return username;
}


public int getPassword() {
	return password;
}

	
	
	


}
	

