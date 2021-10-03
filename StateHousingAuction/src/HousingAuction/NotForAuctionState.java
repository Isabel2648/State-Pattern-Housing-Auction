package HousingAuction;

public class NotForAuctionState implements State {
	AuctionHouses auctionHouses;
 
    public NotForAuctionState(AuctionHouses auctionHouses) {
        this.auctionHouses = auctionHouses;
    }
 
	public void placeBid() {
		System.out.println("This house is not for auction, no bids can be placed at this time");
	}
 
	public void rescindBid() {
		System.out.println("You cannot rescind a bid that has not been placed");
	}
 
	public void runCredit() {
		System.out.println("No bid was placed to run credit on");
	}
 
	public void bidAccepted() {
		System.out.println("Bid was not accepted");
	}
	
	public void refill() { 
		auctionHouses.setState(auctionHouses.getNoBiddingState());
	}
 
	public String toString() {
		return "This housing is not for auction";
	}
}
