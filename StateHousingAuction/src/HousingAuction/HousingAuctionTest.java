package HousingAuction;

public class HousingAuctionTest {

	public static void main(String[] args) {
		AuctionHouses auctionHouses = new AuctionHouses(5);

        System.out.println("Please place your bid");

        auctionHouses.placeBid();
        auctionHouses.runCredit();
        auctionHouses.placeBid();
        auctionHouses.runCredit();

        System.out.println("Please place your bid");

        auctionHouses.placeBid();
        auctionHouses.runCredit();
        auctionHouses.placeBid();
        auctionHouses.runCredit();
        
        System.out.println("Please place your bid");
        
        auctionHouses.placeBid();
        auctionHouses.runCredit();
        auctionHouses.placeBid();
        auctionHouses.runCredit();

        System.out.println("Thank you for participating in the Lewis University housing auction!");
    }
}

     //Continue to program if winner was not selected this round
