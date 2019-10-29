package ac.uk.napier.set07110Coursework;

/**
 * This class is used for the weather readings.
 * It has private variables, constructor and getters.
 * 
 * @author 40399682
 *
 */
public class WeatherReading {
	private int year;
	private int month;
	private int date;
	private int hour;
	private int windSpeed;
	private double temperature;

	public WeatherReading(int year, int month, int date, int hour, int windSpeed, double temperature) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hour;
		this.windSpeed = windSpeed;
		this.temperature = temperature;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public int getHour() {
		return hour;
	}

	public int getWindSpeed() {
		return windSpeed;
	}

	public double getTemperature() {
		return temperature;
	}
}
