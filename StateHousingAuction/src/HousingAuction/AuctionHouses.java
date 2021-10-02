package HousingAuction;

public class AuctionHouses {
	
	final static int NotForAuction = 0;
    final static int NO_Bid = 1;
    final static int YES_Bid = 2;
    final static int SOLD = 3;

    int state = NotForAuction;
    int count = 0;

    public AuctionHouses(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_Bid;
        }
    }

    public void placeBid() {
        if (state == YES_Bid) {
            System.out.println("You cannot place another auction bid at this time");
        } else if (state == NO_Bid) {
            state = YES_Bid;
            System.out.println("Your auction bid has been placed");
        } else if (state == NotForAuction) {
            System.out.println("Unable to place bid. House not available for auction");
        } else if (state == SOLD) {
            System.out.println("Please wait while we process your bid");
        }
    }

    public void rescindBid() {
        if (state == YES_Bid) {
            System.out.println("Your auction bid has been rescinced");
            state = NO_Bid;
        } else if (state == NO_Bid) {
            System.out.println("You have not placed your auction bid");
        } else if (state == SOLD) {
            System.out.println("Sorry, but your bid as already been processed");
        } else if (state == NotForAuction) {
            System.out.println("Your bid was never placed for you to rescind");
        }
    }
  
    private void bidAccepted() {
        if (state == SOLD) {
            System.out.println("Congradulations! Your bid has been accepted");
            count = count - 1;
        } else if (state == NO_Bid) {
            System.out.println("Sorry, but you must have placed your bid before");
        } else if (state == NotForAuction) {
            System.out.println("Sorry, your bid was not accepted");
        } else if (state == YES_Bid) {
            System.out.println("Sorry, your bid was not accepted");
        }
    }
}
