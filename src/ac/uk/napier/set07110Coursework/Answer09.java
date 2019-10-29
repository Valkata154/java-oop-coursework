package ac.uk.napier.set07110Coursework;

import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import mapGui.MapGui;
import weather.WeatherData;

/**
 * QUESTION 09
 * 
 * If you decide to answer question 09 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer09 {
	public static void main(String[] args) {
		System.out.println("Question 09");
		/*
		 * Add your code below
		 */
		
		//Create an ArrayList to store coordinates of weather stations with readings of 30 degrees or over.
		int count = 0;
		ArrayList<Coordinate> coordinates = new ArrayList<>();
		
		WeatherStationData data = new WeatherStationData();
		
		//1st for loop runs through the entire set of weather stations.
		//2nd for loop runs through the entire set of weather readings for each station.
		//If statement to check which stations have recorded temperatures of 30 degrees or above.
		for(Integer key : data.getStations().keySet()) {
			WeatherStation ws1 = data.getStations().get(key);
			for(int i = 0; i < ws1.getWeatherReadings().size() - 1; i++) {
				if(ws1.getWeatherReadings().get(i).getTemperature( ) >= 30) {
					count++;
					coordinates.add(ws1);
					break;
				}
			}
		}
		//Print answers and plot coordinates on map.
		MapGui.showMap(coordinates);
		System.out.println(count + " weather stations recorded a temperature of 30 degrees or over.");
	}	
}
