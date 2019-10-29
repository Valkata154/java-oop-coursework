package ac.uk.napier.set07110Coursework;

import java.text.DecimalFormat;
import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import mapgui.MapGui;

/**
 * QUESTION 13
 * 
 * If you decide to answer question 13 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer13 {
	public static void main(String[] args) {
		System.out.println("Question 13");
		/*
		 * Add your code below
		 */
		WeatherStation stationBlackpool = null;
		WeatherStation stationEdinburgh = null;
		ArrayList<Coordinate> coordinates = new ArrayList<>();
		double tempSum = 0.0;
		int tempCount = 0;
		double meanTempBlackpool = 0.0;
		double meanTempEdinburgh = 0.0;
		
		// Create new station object and populate it.
		WeatherStationSet stations = new WeatherStationSet();
		stations.populateStations();
		
		// Get BLACKPOOL (3318) and EDINBURGH/GOGARBANK (3166) stations and store them.
		for (WeatherStation st : stations.getListOfStations()) {
			if (st.getSideId() == 3318) {
				stationBlackpool = st;
				coordinates.add(st);
			}
			if (st.getSideId() == 3166) {
				stationEdinburgh = st;
				coordinates.add(st);
			}
		}
		
		// For station Blackpool during January get the sum of temperatures and the count of readings.
		for (int i = 0; i < stationBlackpool.getListOfReadings().size(); i++) {
			if(stationBlackpool.getListOfReadings().get(i).getMonth() == 1) {
				tempCount++;
				tempSum = tempSum + stationBlackpool.getListOfReadings().get(i).getTemperature();
			}
		}
		
		// Find the mean temperature for Blackpool and reset the tempSum and tempCount.
		meanTempBlackpool = tempSum / tempCount;
		tempSum = 0.0;
		tempCount = 0;
		
		// For station Edinburgh/Gogorbank during January get the sum of temperatures and the count of readings.
		for (int i = 0; i < stationEdinburgh.getListOfReadings().size(); i++) {
			if(stationEdinburgh.getListOfReadings().get(i).getMonth() == 1) {
				tempCount++;
				tempSum = tempSum + stationEdinburgh.getListOfReadings().get(i).getTemperature();
			}
		}
		
		// Find the mean temperature for Edinburgh/Gogorbank.
		meanTempEdinburgh = tempSum / tempCount;
		
		// Print out the answer and show the stations on the map.
		DecimalFormat form = new DecimalFormat("#.##");
		System.out.println("The difference in mean temperature during January between " + stationBlackpool + " and " + stationEdinburgh + " is: " + form.format((meanTempBlackpool - meanTempEdinburgh)));
		MapGui.showMap(coordinates);
	}	
}
