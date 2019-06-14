import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
//        File file = new File ("123/4");
//        file.mkdirs();
//
//        String [] mass = file.list(new FilenameFilter() {
//
//            public boolean accept(File dir, String name) {
//                return name.startsWith("1");
//            }
//        });
//        for (String name: mass)
//        {
//            System.out.println(name);
//        }

        File file = new File("123/2newFile.txt");
        //f.createNewFile();
        //file.renameTo(new File("123/2newFile.txt"));
        System.out.println(file.getPath());

    }
}