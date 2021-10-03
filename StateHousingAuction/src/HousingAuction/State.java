package HousingAuction;

public interface State {
	
	public void placeBid();
	public void rescindBid();
	public void runCredit();
	public void bidAccepted();
	
	public void refill();
}
