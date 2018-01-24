import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;



public class Task7 {
    public static void parseData(String inputFileName) {
        int c = 0;
        try (Scanner in = new Scanner(Paths.get(inputFileName))) {
            while (in.hasNextLine()) {
                in.nextLine().split("\\s+");
                Thread.sleep(100);
                if (c > 100) throw new IOException("eto IOException");
                c++;
            }
            in.close();
            IOException iox = in.ioException();
            if (iox != null) {
                System.err.println("in.ioException(): ");
            } else {
                System.err.println("in.ioException() is null");
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("caughtException: ");
            Throwable[] suppressed = e.getSuppressed();
            if (suppressed.length == 0) {
                System.err.println("no suppressed exceptions");
            } else {
                System.err.println("suppressed exceptions:");
                for (Throwable t : suppressed)
                    System.err.println(t);
            }
        }
    }

    public static void main(String[] args) {

        String i = "//Users/alexvasnesov/Desktop/Java5.txt";

        parseData(i);
    }
}