package ac.uk.napier.set07110Coursework;

import mapGui.MapGui;
import weather.WeatherData;

/**
 * QUESTION 06
 * 
 * If you decide to answer question 06 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer06 {
	public static void main(String[] args) {
		System.out.println("Question 06");
		/*
		 * Add your code below
		 */
		
		WeatherStationData data = new WeatherStationData();
		
		//Begin tempCount at a very high number. No stations will have that many readings.
		int tempCount = 1000000;
		WeatherStation finalWeatherStation = null;
		
		//For loop reads through all data stations. 
		//If statement changes tempCount value to lowest value until lowest value is found (1360).
		for(Integer key : data.getStations().keySet()) {
			WeatherStation ws1 = data.getStations().get(key);
			if (ws1.getWeatherReadings().size() < tempCount) {
				tempCount = ws1.getWeatherReadings().size();
				finalWeatherStation = ws1;
			}
		}
		//Print answers and plot weather station on map.
		MapGui.showMap(finalWeatherStation);
		System.out.println(finalWeatherStation);
		System.out.println("Nr. of Readings: " + tempCount);
	}	
}