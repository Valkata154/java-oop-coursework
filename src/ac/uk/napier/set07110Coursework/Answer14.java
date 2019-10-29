package ac.uk.napier.set07110Coursework;

import java.text.DecimalFormat;

import mapGui.MapGui;
import weather.WeatherData;

/**
 * QUESTION 14
 * 
 * If you decide to answer question 14 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer14 {
	public static void main(String[] args) {
		System.out.println("Question 14");
		/*
		 * Add your code below
		 */
		Postcode mostIsolatedPostcode = null;
		double mostIsolatedPostcodeDistanceToNeighbor = 0;
		
		// Create new postcode object and populate it.
		PostcodeSet postcodes = new PostcodeSet();
		postcodes.populateGPostcodes();
		
		// For each postcode find its nearest neighbor and compare the distance between them and at the end store only the smallest distance and postcode.
		for (Postcode ps1 : postcodes.getListOfGPostcodes()) {
			double smallestDistance = 1000;
			for (Postcode ps2 : postcodes.getListOfGPostcodes()) {
				if(ps1 == ps2){
					continue;
				}
				
				double distance = WeatherData.getDistanceBetweenPoints(ps1.getLat(),ps1.getLon(),ps2.getLat(),ps2.getLon());
				
				if(distance < smallestDistance ) {
					smallestDistance = distance;
				}
			}
			if(mostIsolatedPostcodeDistanceToNeighbor < smallestDistance){
				mostIsolatedPostcode = ps1;
				mostIsolatedPostcodeDistanceToNeighbor = smallestDistance;
			}					
		}		
		
		// Print out the answer and show the postcode on the map.
		DecimalFormat form = new DecimalFormat("#.##");
		System.out.println("The most isolated G postcode is: " + mostIsolatedPostcode + " located at: " + mostIsolatedPostcode.getLat() + ", " + mostIsolatedPostcode.getLon() + ".");
		System.out.println("The distance to its closest neighbor is: " + form.format(mostIsolatedPostcodeDistanceToNeighbor) + "KM.");		
		MapGui.showMap(mostIsolatedPostcode);
	}	
}
