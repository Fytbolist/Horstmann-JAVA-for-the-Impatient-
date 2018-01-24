import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {

	public ArrayList<Double> readValues(String fileName) throws FileNotFoundException, NumberFormatException {
		ArrayList<Double> numbers = new ArrayList<>();
		try (Scanner sc = new Scanner(new File(fileName))) {
			while (sc.hasNextLine()) {
				String nextLine = sc.nextLine();
				numbers.add(Double.parseDouble(nextLine));
			}
		}
		return numbers;
	}

    public static void main(String[] args) {


        Task1 reader = new Task1();
        String fileName = "//Users/alexvasnesov/Desktop/Java5.txt";
		try {
			System.out.println(reader.readValues(fileName));
		} catch (FileNotFoundException e) {
			Logger.getGlobal().log(Level.WARNING, "File not found", e);
		} catch (NumberFormatException e) {
			Logger.getGlobal().log(Level.WARNING, "Line is not a number", e);
		}



    }

}
