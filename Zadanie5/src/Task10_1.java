import java.io.FileNotFoundException;
import java.io.ObjectStreamConstants;
import java.io.ObjectStreamException;
import java.net.ProtocolException;

public class Task10_1 {


    public static void main(String[] args) throws ObjectStreamException, FileNotFoundException, ProtocolException {
        if (Math.random() > 0.5) {
            throw new FileNotFoundException();
        } else {
            throw new ProtocolException();
        }


}

}