package HousingAuction;

public class AcceptBidState implements State {
 
	AuctionHouses auctionHouses;
 
    public AcceptBidState(AuctionHouses auctionHouses) {
        this.auctionHouses = auctionHouses;
    }
       
	public void placeBid() {
		System.out.println("Please wait, your bid was already accepted");
	}
 
	public void rescindBid() {
		System.out.println("Sorry, but your bid has already been processed");
	}
 
	public void runCredit() {
		System.out.println("Credit will not be ran again on a bid that has already been accepted");
	}
 
	public void bidAccepted() {
		auctionHouses.processingCredit();
		if (auctionHouses.getCount() > 0) {
			auctionHouses.setState(auctionHouses.getNoBiddingState());
		} else {
			System.out.println("No more auction houses available.");
			auctionHouses.setState(auctionHouses.getNotForAuctionState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "Congradulations! Your bid was accepted";
	}
}
