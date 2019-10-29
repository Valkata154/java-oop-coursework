package ac.uk.napier.set07110Coursework;

import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import mapgui.MapGui;
import weather.WeatherData;

/**
 * QUESTION 11
 * 
 * If you decide to answer question 11 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer11 {
	public static void main(String[] args) {
		System.out.println("Question 11");
		/*
		 * Add your code below
		 */
		int count = 0;
		WeatherStation station = null;
		ArrayList<Coordinate> coordinates = new ArrayList<>();

		// Create new postcode and station objects and populate them.
		PostcodeSet postcodes = new PostcodeSet();
		postcodes.populatePostcodes();

		WeatherStationSet stations = new WeatherStationSet();
		stations.populateStations();
		
        // Get AONACH MOR (3041) station and save it.
		for (WeatherStation st : stations.getListOfStations()) {
			if (st.getSideId() == 3041) {
				station = st;
			}
		}
		
        // Get distance between AONACH MOR (3041) and the other postcodes and if < 10KM add the postcodes to a list of coordinates and increase counter.
		for (Postcode ps : postcodes.getListOfPostcodes()) {
			if ((WeatherData.getDistanceBetweenPoints(station.getLat(), station.getLon(), ps.getLat(),
					ps.getLon()) < 10.0)) {
				count++;
				coordinates.add(ps);
			}
		}
        
		//Print the answer and show the coordinates on the map.
		System.out.println("There are " + count + " postcodes within a 10KM radius of " + station);
		MapGui.showMap(coordinates);
	}
}
