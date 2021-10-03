package HousingAuction;

public class HousingAuctionTest {

	public static void main(String[] args) {
		AuctionHouses auctionHouses = new AuctionHouses(4);

        System.out.println("Please place your bid");

        auctionHouses.placeBid();
        auctionHouses.runCredit();

        System.out.println("Please place your bid");

        auctionHouses.placeBid();
        auctionHouses.runCredit();
        auctionHouses.placeBid();
        auctionHouses.runCredit();
        
        auctionHouses.refill(3);
        auctionHouses.placeBid();
        auctionHouses.runCredit();

        System.out.println("Thank you for participating in the Lewis University housing auction!");
    }

}

