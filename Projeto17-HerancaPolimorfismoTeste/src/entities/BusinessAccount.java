package entities;

public class BusinessAccount {
	private Integer number;
	private String holder;
	private double balance;
	private double loanLimit;
	
	public BusinessAccount() {
	
	}

	public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.loanLimit = loanLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// ===================== 
		public void withdraw(double amount) {
			
		}
		
		public void deposit(double amount) {
				
		}
		
		public void loan(double amount) {
			
		}
	
	
}
