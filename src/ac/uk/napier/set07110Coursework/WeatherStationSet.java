package ac.uk.napier.set07110Coursework;
import java.util.ArrayList;
import weather.WeatherData;

/**
 * 
 * This class is used to add the weather stations to a list of stations.
 * The list has a getter so that it can be accessed in the answer classes.
 * 
 * @author 40399682
 *
 */
public class WeatherStationSet {
	private ArrayList<WeatherStation> listOfStations = new ArrayList<>();

	public ArrayList<WeatherStation> getListOfStations() {
		return listOfStations;
	}

	public void populateStations() {
		String[] weatherData = WeatherData.getData();

		for (int i = 1; i < weatherData.length - 1; i++) {
			String[] data = weatherData[i].split(",");

			WeatherStation station = new WeatherStation(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]),
					Double.parseDouble(data[3]));

			if (!listOfStations.contains(station)) {
				listOfStations.add(station);
			}

			WeatherReading reading = new WeatherReading(Integer.parseInt(data[4]), Integer.parseInt(data[5]),
					Integer.parseInt(data[6]), Integer.parseInt(data[7]), Integer.parseInt(data[8]),
					Double.parseDouble(data[9]));

			listOfStations.get(listOfStations.indexOf(station)).getListOfReadings().add(reading);
		}
	}
}
