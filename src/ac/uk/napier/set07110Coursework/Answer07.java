package ac.uk.napier.set07110Coursework;

import mapGui.MapGui;
import weather.WeatherData;

/**
 * QUESTION 07
 * 
 * If you decide to answer question 07 then the main method below should be used as the entry point for your application
 * You may use as many other classes as you feel necessary as long as all code is supplied 
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run configurations in eclipse
 */
public class Answer07 {
	public static void main(String[] args) {
		System.out.println("Question 07");
		/*
		 * Add your code below
		 */
		
		//Setting all values to 0 allows for changes later when finding highest temperature.
		WeatherStation finalWeatherStation = null;
		double tempTemperature = 0;
		int year = 0;
		int month = 0;
		int date = 0;
		int hour = 0;
		
		//For loop runs through all weather readings from siteId 3166.
		//If statement gets the highest temperature recording from siteId 3166.
		//If statement gets the year, month, date and hour recording was taken.
		WeatherStationData data = new WeatherStationData();
		WeatherStation ws = data.getStations().get(3166);
		for(int i = 0; i < ws.getWeatherReadings().size() - 1; i++) {
			if(ws.getWeatherReadings().get(i).getTemperature() > tempTemperature) {
				tempTemperature = ws.getWeatherReadings().get(i).getTemperature();
				year = ws.getWeatherReadings().get(i).getYear();
				month = ws.getWeatherReadings().get(i).getMonth();
				date = ws.getWeatherReadings().get(i).getDate();
				hour = ws.getWeatherReadings().get(i).getHour();
				finalWeatherStation = ws;
			}
		}
		//Print answers and plot weather station on map
		MapGui.showMap(finalWeatherStation);
		System.out.println("The highest temperature recorded at Edinburgh/Gogarbank (3166) was " + tempTemperature);	
		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Date: " + date);
		System.out.println("Hour: " + hour);
		
	}	
}
