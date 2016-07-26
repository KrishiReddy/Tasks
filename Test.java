
public class Test {
	
	public static void main(String[] args) {
		
		Customer account1=new Customer("customer", "male", 7006, "address");
		Bill account2=new Bill("deposit", "withdrawal");
		Transcations account3=new Transcations(500, "july27", 54225);
		Services account4=new Services("username",2);
		
		account2.account=account1;
		account3.accountB=account2;
		account4.accountT=account3;
		
		System.out.println("Name = " + account2.account.name);
		System.out.println("ID Number =  " + account2.account.id);
		System.out.println("Address = " + account2.account.getAddress());
		System.out.println("Gender = " + account2.account.gender);
		System.out.println("Bill Generated When = " + account3.accountB.deposit);
		System.out.println("Bill Generated When = " +  account3.accountB.withdrawal);
		System.out.println("Transcation Account  Number = " +account4.accountT.TranscationAccountNumber);
		System.out.println("Amount Transcated = " + account4.accountT.TranscationAmount);
		System.out.println("Transcation receiver Account  Number = "  + account4.accountT.TranscationAccountNumber);
		System.out.println("services available " + account4.OnlineBanking);
		System.out.println("cash back amount  " + account4.CashbackAmount );
		
	}

}
