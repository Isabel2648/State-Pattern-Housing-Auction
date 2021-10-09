package HousingAuction;

public class AuctionHouses {

    State notForAuctionState;
    State noBiddingState;
    State yesBiddingState;
    State acceptBidState;
    State luckyPrizeState;           //new

    State state = notForAuctionState;    //modify
    int count = 0;

    public AuctionHouses(int numberOfBids) {
    	notForAuctionState = new NotForAuctionState(this);
    	noBiddingState = new NoBiddingState(this);
    	yesBiddingState = new YesBiddingState(this);
    	acceptBidState = new AcceptBidState(this);
    	luckyPrizeState = new LuckyPrizeState(this);  //new
       
        this.count = numberOfBids;
        if (numberOfBids > 0) {
            state = noBiddingState;
        }
    }

    public void placeBid() {
        state.placeBid();
    }

    public void rescindBid() {
        state.rescindBid();
    }

    public void runCredit() {
        state.runCredit();
        state.bidAccepted();
    }
    
    void setState(State state) {			//new placement
    	this.state = state;					//new
    }

    void processingCredit() {
        System.out.println("Please wait while we process your credit.");
        if (count > 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The ballot machine was just refilled; its new count is: " + this.count);
        state.refill();
    }
    
    public State getState() {
        return state;
    }

    public State getNotForAuctionState() {
        return notForAuctionState;
    }

    public State getNoBiddingState() {
        return noBiddingState;
    }

    public State getYesBiddingState() {
        return yesBiddingState;
    }

    public State getAcceptBidState() {
        return acceptBidState;
    }
    
    public State getLuckyPrizeState() {				//new
        return luckyPrizeState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nFlores Realty, Inc.");
        result.append("\nJava-enabled Auction House Ballot #2319");
        result.append("\nInventory: " + count + " Bid");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Ballot is " + state + "\n");
        return result.toString();
    }
}
