package HousingAuction;

public class LuckyPrizeState implements State {
	AuctionHouses auctionHouses;
	TVDirector tvDirector;
 
	public LuckyPrizeState(AuctionHouses auctionHouses) {
		this.auctionHouses = auctionHouses;
	}
  
	public void placeBid() {
		System.out.println("You cannot place another bid at this time");
	}
 
	public void rescindBid() {
		System.out.println("Your bid has been rescinded");
	}
 
	public void runCredit() {
		System.out.println("Running your credit now, please wait...");
	}

    public void bidAccepted() {
    	auctionHouses.processingCredit();
		if (auctionHouses.getCount() == 0) {
			auctionHouses.setState(auctionHouses.getNotForAuctionState());
		} else {
			auctionHouses.processingCredit();
			System.out.println("CONGRATS on your new home!!! You have won a brand new flat screen TV as a house warming gift from your realtor.");
			tvDirector.main(null);
			
			
			if (auctionHouses.getCount() > 0) {
				auctionHouses.setState(auctionHouses.getNoBiddingState());
			} else {
            	System.out.println("Sorry, but you cannot place anymore bids at this time.");
            	auctionHouses.setState(auctionHouses.getNotForAuctionState());
			}
		}
    }
    
    public void refill() { }
 
	public String toString() {
		return "wait as we process your credit";
	}
}
