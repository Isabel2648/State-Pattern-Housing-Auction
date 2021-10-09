package HousingAuction;

public class FlatScreenBuilder extends TVBuilder {
	public FlatScreenBuilder() {
		this.name = "Flat-Screen TV";
	}
	public TVBuilder addScreenSize() {
		this.features.add("42 inch Screen");
		return this;
	}
	public TVBuilder addBrandName() {
		this.features.add("Samsung Brand");
		return this;
	}
	public TVBuilder addStreamingService() {
		this.features.add("Streams: Hulu, Netflix, Prime Video and Youtube");
		return this;
	}
	public TVBuilder addWallMount() {
		this.features.add("360 degree wall mount included");
		return this;
	}	
}
