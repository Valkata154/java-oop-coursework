package ac.uk.napier.set07110Coursework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class is used to add both the postcodes and the Glasgow postcodes to two different lists.
 * The lists have getters so that they can be accessed in the answer classes.
 * 
 * @author 40399682
 *
 */
public class PostcodeSet {
	private ArrayList<Postcode> listOfGPostcodes = new ArrayList<>();
	private ArrayList<Postcode> listOfPostcodes = new ArrayList<>();
	
	public ArrayList<Postcode> getListOfPostcodes() {
		return listOfPostcodes;
	}

	public ArrayList<Postcode> getListOfGPostcodes() {
		return listOfGPostcodes;
	}

	public void populateGPostcodes() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("g.csv")));

			String line;

			while ((line = reader.readLine()) != null) {

				String[] data = line.split(",");

				Postcode postcode = new Postcode(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]));
				listOfGPostcodes.add(postcode);
			}

			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public void populatePostcodes() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("postcodes.csv")));

			String line;

			while ((line = reader.readLine()) != null) {

				String[] data = line.split(",");

				Postcode postcode = new Postcode(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]));
				listOfPostcodes.add(postcode);
			}

			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
