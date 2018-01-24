
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        String fromFile = "//Users/alexvasnesov/Desktop/Java5.txt";
        String toFile = "//Users/alexvasnesov/Desktop/edit5.txt";

        copyFile(fromFile, toFile);
    }

    public static void copyFile(String fromFile, String toFile) {
        Scanner in = null;
        PrintWriter write = null;
        try {
            in = new Scanner(Paths.get(fromFile));
            write = new PrintWriter(toFile);
            while (in.hasNext()) {
                write.println(in.nextLine());
            }
            System.out.println("Скопировано");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (write != null) {
                write.close();
            }
        }
    }

}