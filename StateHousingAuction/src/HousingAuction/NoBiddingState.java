package HousingAuction;

public class NoBiddingState implements State {
	AuctionHouses auctionHouses;
 
    public NoBiddingState(AuctionHouses auctionHouses) {
        this.auctionHouses = auctionHouses;
    }
 
	public void placeBid() {
		System.out.println("You bid has been placed");
		auctionHouses.setState(auctionHouses.getYesBiddingState());
	}
 
	public void rescindBid() {
		System.out.println("You haven't placed your bid yet");
	}
 
	public void runCredit() {
		System.out.println("No bid was placed to run credit on");
	 }
 
	public void bidAccepted() {
		System.out.println("You first need to place your bid");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for bid";
	}
}
