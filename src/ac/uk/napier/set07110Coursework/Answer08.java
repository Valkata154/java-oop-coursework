package ac.uk.napier.set07110Coursework;

import mapGui.MapGui;
import weather.WeatherData;

/**
 * QUESTION 08
 * 
 * If you decide to answer question 08 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer08 {
	public static void main(String[] args) {
		System.out.println("Question 08");
		/*
		 * Add your code below
		 */
		
		//maxTemp to -100 as a low value and minTemp to 100 as a high value
		WeatherStationData data = new WeatherStationData();
		WeatherStation ws = data.getStations().get(3063);
		int readingsCount = 0;
		double tempSum = 0.0;
		double maxTemp = -100;
		double minTemp = 100;
		
		//For loop iterates through all readings from siteId 3063
		//1st if statement looks through the readings taken at 11AM July 2015
		//2nd if statement looks through readings for maxTemp
		//3rd if statement looks through readings for minTemp
		for(int i = 0; i < ws.getWeatherReadings().size()-1; i++) {
			if(ws.getWeatherReadings().get(i).getHour() == 11 && ws.getWeatherReadings().get(i).getMonth() == 7 && ws.getWeatherReadings().get(i).getYear() == 2015) {
				readingsCount++;
				tempSum = tempSum + ws.getWeatherReadings().get(i).getTemperature();
				if(maxTemp < ws.getWeatherReadings().get(i).getTemperature()) {
					maxTemp = ws.getWeatherReadings().get(i).getTemperature();
				}
				if(minTemp > ws.getWeatherReadings().get(i).getTemperature()) {
					minTemp = ws.getWeatherReadings().get(i).getTemperature();
				}
			}
		}
		//Print answers and plot station on map
		MapGui.showMap(ws);
		System.out.println("Number of Readings: " + readingsCount);
		System.out.println("Maximum Temperature: " + maxTemp);
		System.out.println("Minimum Temperature: " + minTemp);
		System.out.printf("Average Temperature: " + "%.2f",tempSum / readingsCount);
	}	
}
