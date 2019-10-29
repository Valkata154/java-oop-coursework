package ac.uk.napier.set07110Coursework;

import mapgui.MapGui;

/**
 * QUESTION 12
 * 
 * If you decide to answer question 12 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer12 {
	public static void main(String[] args) {
		System.out.println("Question 12");
		/*
		 * Add your code below
		 */
		int numberOfReadings = 0;
		WeatherStation station = null;
		
		// Create new station object and populate it.
		WeatherStationSet stations = new WeatherStationSet();
		stations.populateStations();
		
		// For every reading for every station check if the wind speed is more than 50MPH and find which station had the most consecutive readings.
		for (WeatherStation st : stations.getListOfStations()){
			int tempCounter = 0;
			for (int i = 0; i < st.getListOfReadings().size(); i++) {		
				if(st.getListOfReadings().get(i).getWindSpeed() > 50)	{
					tempCounter++;
					if(tempCounter > numberOfReadings){
						numberOfReadings = tempCounter;
						station = st;
					}
				}
				else {
					tempCounter = 0;
				}
			}
		}
		
		// Print the answer and show the station on the map.
		System.out.println(station + " sustained a wind speed of more than 50 MPH for the most consecutive readings: " + numberOfReadings);
		MapGui.showMap(station);
	}	
}
