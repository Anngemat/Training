package LearningTim;

public class BankAccoun {

	private int accountNumber;
	private int accountBalance;
	private String customerName;
	private String email;
	private String phoneNumber;
	public BankAccoun(int accountNumber, int accountBalance, String customerName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void depositFunds(int deposited) {
		accountBalance+= deposited; 
	}
	public void withdrawFunds(int withdrawed) {
		if (accountBalance-withdrawed<0) {
			System.out.println("You dont have enough money");
		}else {
			accountBalance -= withdrawed;
		}
	}
}
