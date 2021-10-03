package HousingAuction;

public class YesBiddingState implements State {
	AuctionHouses auctionHouses;
 
	public YesBiddingState(AuctionHouses auctionHouses) {
		this.auctionHouses = auctionHouses;
	}
  
	public void placeBid() {
		System.out.println("You cannot place another bid at this time");
	}
 
	public void rescindBid() {
		System.out.println("Your bid has been rescinded");
		auctionHouses.setState(auctionHouses.getNoBiddingState());
	}
 
	public void runCredit() {
		System.out.println("Running your credit now, please wait...");
		auctionHouses.setState(auctionHouses.getAcceptBidState());
	}

    public void bidAccepted() {
        System.out.println("Sorry, your bid was not accepted");
    }
    
    public void refill() { }
 
	public String toString() {
		return "wait as we process your credit";
	}
}
