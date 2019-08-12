package ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        try (
                FileInputStream in = new FileInputStream("look.jpeg");
                FileOutputStream out = new FileOutputStream("lookCopy.jpeg")
                ) {
            int c;
            while((c = in.read()) != -1) {
                out.write(c);
            }
        } catch(IOException e) {
            System.out.println("IOException thrown");
        }
    }
}
