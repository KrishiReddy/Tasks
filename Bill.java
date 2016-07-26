
public class Bill {
	
	String deposit= " deposit money";
	String withdrawal= " withdraw money";
	
	Customer account;
	public Bill(){
		
	}
	
	
	
	public Bill(String deposit, String withdrawal) {
		super();
		this.deposit = deposit;
		this.withdrawal = withdrawal;
		
	}



	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getWithdrawal() {
		return withdrawal;
	}
	public void setWithdrawal(String withdrawal) {
		this.withdrawal = withdrawal;
	}
	
	
	
	

	
	
}
