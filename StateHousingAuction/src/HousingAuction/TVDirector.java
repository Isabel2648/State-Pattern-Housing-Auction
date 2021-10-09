package HousingAuction;

public class TVDirector {
	 
		public static void main(String[] args) {
			
			TVBuilder prizeBuilder = new FlatScreenBuilder();

			TVPrize prize = prizeBuilder.addBrandName().addStreamingService().addScreenSize().addWallMount().build();
			prize.selectTV();
			prize.packageTV();
			prize.deliveryMethod();
			prize.installation();
			System.out.println(prize);

			StringBuilder sb = new StringBuilder();
			sb.append("\nTesting String Builder\n").append(prize).insert(0, "====").toString();
			System.out.println(sb);
		}
	}
