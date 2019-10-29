package ac.uk.napier.set07110Coursework;

import org.openstreetmap.gui.jmapviewer.Coordinate;

/**
 * This class is used for the postcodes.
 * The class uses inheritance with the provided Coordinate class.
 * It has a private variable, constructor, getter and a toString method that returns getSiteId.
 * 
 * @author 40399682
 *
 */
public class Postcode extends Coordinate {
	private String siteId;

	public Postcode(String siteId, double latitude, double longitude) {
		super(latitude, longitude);
		this.siteId = siteId;
	}

	public String getSiteId() {
		return siteId;
	}
	
	@Override
	public String toString() {
		return getSiteId();
	}
}
