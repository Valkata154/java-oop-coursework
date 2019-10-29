package ac.uk.napier.set07110Coursework;

import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

/**
 * This class is used for the weather stations.
 * The class uses inheritance with the provided Coordinate class.
 * It also uses one to many aggregation with the WeatherReading class.
 * It has getters and a constructor for the private variables.
 * There is an method that is used for putting the correct weather readings to the correct weather station.
 * It also has a toString method which returns the getSiteName;
 * 
 * @author 40399682
 *
 */
public class WeatherStation extends Coordinate {
	private int siteId;
	private String siteName;
	
	private ArrayList<WeatherReading> listOfReadings = new ArrayList<>();
	
	public WeatherStation(int sideId, String siteName, double latitude, double longitude) {
		super(latitude, longitude);
		this.siteId = sideId;
		this.siteName = siteName;
	}

	public int getSideId() {
		return siteId;
	}

	public String getSiteName() {
		return siteName;
	}
	
	public ArrayList<WeatherReading> getListOfReadings() {
		return listOfReadings;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass()) {
			return false;
		}
		if (((WeatherStation) obj).siteId == this.siteId) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return getSiteName();
	}
}
