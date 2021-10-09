package HousingAuction;

import java.util.ArrayList;
import java.util.List;

public abstract class TVBuilder {
	
	String name;
	List<String> features = new ArrayList<String>();
	
	public abstract TVBuilder addScreenSize();
	public abstract TVBuilder addBrandName();
	public abstract TVBuilder addStreamingService();
	public abstract TVBuilder addWallMount();
	
	public TVPrize build() {
		TVPrize tvPrize = new TVPrize();
		tvPrize.setName(this.name);
		tvPrize.addFeatures(features);
		return tvPrize;
	}
}
