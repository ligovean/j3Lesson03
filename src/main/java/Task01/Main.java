package Task01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //Task 01
        byte[] buf = new byte[50];
        FileInputStream in = new FileInputStream("123/01.txt");
        int count;
        while ((count = in.read(buf)) > 0) {
            for (int i = 0; i < count; i++) {
                System.out.print((char) buf[i]);
            }
        }

    }
}