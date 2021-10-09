package HousingAuction;

import java.util.*;

public class TVPrize {
	
	String name;
	
	List<String> features;
	
	void addFeatures(List<String> features) {
		this.features = features;
	}
 
	void selectTV() {
		
		System.out.println("The " + name + " you won has been selected from our inventory.");
		
		System.out.println("The TV features included are: ");
		for (String feature : features) {
			System.out.println("   " + feature);
		}
	}
  
	void packageTV() {
		System.out.println("Your new TV is being packaged with care.");
	}
 
	void deliveryMethod() {
		System.out.println("Delivery Method: Standard ground shipping. Your package should be delievered between 3-4 business days.");
	}
  
	void installation() {
		System.out.println("This purchase includes free installation");
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		for (String feature : features) {
			display.append(feature + "\n");
		}
		return display.toString();
	}
}

