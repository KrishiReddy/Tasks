
public class Services {

	String OnlineBanking;
	 int CashbackAmount;
	 
	 Transcations accountT;
	 public Services(){
	 }
	 
	 
	public Services(String onlineBanking, int cashbackAmount) {
		
		OnlineBanking = onlineBanking;
		CashbackAmount = cashbackAmount;
	}
	public String getOnlineBanking() {
		return OnlineBanking;
	}
	public void setOnlineBanking(String onlineBanking) {
		OnlineBanking = onlineBanking;
	}
	public int getCashbackAmount() {
		return (int) CashbackAmount;
	}
	public void setCashbackAmount(int cashbackAmount) {
		CashbackAmount = cashbackAmount;
	}
	 
	 
	 
	 
}
