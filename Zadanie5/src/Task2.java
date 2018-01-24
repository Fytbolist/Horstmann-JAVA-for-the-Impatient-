import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task2 {

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

	public double sumOfValues(String fileName) throws FileNotFoundException, NumberFormatException {
		ArrayList<Double> numbers = readValues(fileName);
		double sum = 0;
		for (Double d : numbers) {
			sum += d;
		}
		return sum;
	}

		public static void main(String[] args) {
			Task2 reader = new Task2();
			String fileName = "//Users/alexvasnesov/Desktop/Java5.txt";

		try {
			System.out.println(reader.sumOfValues(fileName));
		} catch (FileNotFoundException e) {
			Logger.getGlobal().log(Level.WARNING, "File not found", e);
		} catch (NumberFormatException e) {
			Logger.getGlobal().log(Level.WARNING, "Line is not a number", e);
		}


		}

	}
