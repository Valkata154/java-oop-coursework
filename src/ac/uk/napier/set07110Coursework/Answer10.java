package ac.uk.napier.set07110Coursework;

import mapGui.MapGui;
import weather.WeatherData;

/**
 * QUESTION 10
 * 
 * If you decide to answer question 10 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer10 {
	public static void main(String[] args) {
		System.out.println("Question 10");
		/*
		 * Add your code below
		 */
		
		//Create variables.
		double minTemp = 1000.0;
		double maxTemp = -1000.0;
		double variation = -1.0;
		double finalMinTemp = 0.0;
		double finalMaxTemp = 0.0;
		
		WeatherStation finalWeatherStation = null;
		WeatherStationData data = new WeatherStationData();
		
		//1st for loop runs through all weather stations.
		//2nd for loop runs through all weather readings for each station.
		//1st if statement gets maxTemp for each weather station.
		//2nd if statement gets minTemp for each weather station.
		//3rd if statement compares variation for each station.
		for (Integer key : data.getStations().keySet()) {
			WeatherStation ws1 = data.getStations().get(key);
			for (int i = 0; i < ws1.getWeatherReadings().size() - 1; i++) {
				if (ws1.getWeatherReadings().get(i).getTemperature() > maxTemp) {
					maxTemp = ws1.getWeatherReadings().get(i).getTemperature();
				}
				if (ws1.getWeatherReadings().get(i).getTemperature() < minTemp) {
					minTemp = ws1.getWeatherReadings().get(i).getTemperature();
				}
			}
			if(maxTemp - minTemp > variation) {
				variation = maxTemp - minTemp;
				finalWeatherStation = ws1;
				finalMaxTemp = maxTemp;
				finalMinTemp = minTemp;
			}
			minTemp = 1000.0;
			maxTemp = -1000.0;
		}
		//Print answers and plot station on map
		MapGui.showMap(finalWeatherStation);
		System.out.println(finalWeatherStation);
		System.out.println("Minimum Temperature: " + finalMinTemp);
		System.out.println("Maximum Temperature: " + finalMaxTemp);
		
	}	
}