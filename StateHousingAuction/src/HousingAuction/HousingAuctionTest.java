package HousingAuction;

public class HousingAuctionTest {

	public static void main(String[] args) {
		AuctionHouses auctionHouses = new AuctionHouses(4);

        System.out.println("Please place your bid");

        auctionHouses.placeBid();
        auctionHouses.rescindBid();

        System.out.println("Please place your bid");

        auctionHouses.placeBid();
        auctionHouses.rescindBid();
        auctionHouses.rescindBid();
        auctionHouses.placeBid();

        System.out.println("Please place your bid");

        auctionHouses.placeBid();
        auctionHouses.placeBid();
        auctionHouses.rescindBid();
        auctionHouses.placeBid();
        auctionHouses.rescindBid();
        auctionHouses.placeBid();
        auctionHouses.placeBid();

        System.out.println("Thank you for participating in the Lewis University housing auction!");
    }

}

