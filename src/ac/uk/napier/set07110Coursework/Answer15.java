package ac.uk.napier.set07110Coursework;

import mapgui.MapGui;
import weather.WeatherData;

/**
 * QUESTION 15
 * 
 * If you decide to answer question 15 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer15 {
	public static void main(String[] args) {
		System.out.println("Question 15");
		/*
		 * Add your code below
		 */
		int neighborsCount = 0;
        Postcode mostDenselyPopulatedPostcode = null;
		
        // Create new postcode object and populate it.
		PostcodeSet postcodes = new PostcodeSet();
		postcodes.populateGPostcodes();
		
		// For every postcode compare with all other postcodes and find the most densely populated postcode and its neighbors count.
		for (Postcode ps1 : postcodes.getListOfGPostcodes()) {
			int tempCount = 0;
			for (Postcode ps2 : postcodes.getListOfGPostcodes()) {
				if(ps1 == ps2) {
					continue;
				}
				if(WeatherData.getDistanceBetweenPoints(ps1.getLat(),ps1.getLon(),ps2.getLat(),ps2.getLon()) <= 0.3) {
					tempCount++;
				}	
			}
			if(tempCount > neighborsCount){
				neighborsCount = tempCount;
				mostDenselyPopulatedPostcode = ps1;
			}
		}	
		
		// Print out the answer and show the postcode on the map.
		System.out.println("The most densely populated G postcode is: " + mostDenselyPopulatedPostcode + ".");
		System.out.println("It is located at: " + mostDenselyPopulatedPostcode.getLat() + ", " + mostDenselyPopulatedPostcode.getLon() + " and has: " + neighborsCount + " neighbors within a 0.3KM radius.");
		MapGui.showMap(mostDenselyPopulatedPostcode);
	}	
}
