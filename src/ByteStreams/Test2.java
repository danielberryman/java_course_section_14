package ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) {
//        byte[] bs = new byte[4];
//        System.out.println(bs.length);

//        try (
//                FileInputStream in = new FileInputStream("test2.txt");
//                FileOutputStream out = new FileOutputStream("test2Copy.txt")
//                ) {
//            System.out.println(in.getFD());
//            System.out.println("Number of remaining bytes:"+in.available());
//
//            int c;
//            byte[] bs = new byte[(int)8];
//            while ((c = in.read(bs)) != -1) {
//                out.write(c);
//            }
//            System.out.println("Number of remaining bytes:"+in.available());
//        } catch(IOException e) {
//            System.out.println("IO exception");
//        }

        FileOutputStream fop = null;
        FileInputStream file;
        String content = "This is the text content";

        try {

            file = new FileInputStream("test2.txt");
            fop = new FileOutputStream("test2Copy.txt");

            // get the content in bytes
            byte[] contentInBytes = new byte[file.available()];

            fop.write(file.readAllBytes());

            fop.flush();
            fop.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
