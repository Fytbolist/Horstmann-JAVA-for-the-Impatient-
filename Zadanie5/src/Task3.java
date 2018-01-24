import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 {


    public ArrayList<Double> readValues(String fileName) {
        ArrayList<Double> numbers = new ArrayList<>();
        int count = 1;
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                numbers.add(Double.parseDouble(nextLine));
                count++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getGlobal().log(Level.WARNING, "File not found", ex);
        } catch (NumberFormatException ex) {
            Logger.getGlobal().log(Level.WARNING, "Line " + count + " is not a number", ex);
            return null;
        }
        return numbers;
    }

    public double sumOfValues(String fileName) {
        ArrayList<Double> numbers = readValues(fileName);
        if (numbers == null) {
            return Double.NaN;
        }
        double sum = 0;
        for (Double d : numbers) {
            sum += d;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task3 reader = new Task3();
        String fileName = "//Users/alexvasnesov/Desktop/Java5.txt";
        
        System.out.println(reader.readValues(fileName));
        System.out.println(reader.sumOfValues(fileName));

    }
}