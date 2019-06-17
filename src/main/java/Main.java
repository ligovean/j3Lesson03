import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

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

        //Task 02
        File file = new File ("123");
        String [] mass = file.list(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                return name.startsWith("1");
            }
        });
        ArrayList<InputStream> al = new ArrayList<>();
        for (String name: mass)
        {    al.add(new FileInputStream("123/" + name));
        }
        SequenceInputStream input = new SequenceInputStream(Collections.enumeration(al));
        DataOutput output = new DataOutputStream(new FileOutputStream("123/summary.txt"));
        int i;
        while ((i = input.read()) != -1) {
            output.writeByte(i);
        }
        input.close();
    }
}