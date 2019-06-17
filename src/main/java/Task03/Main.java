package Task03;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println();
        System.out.println("=====================/Book Reader/=====================");
        System.out.println();
        int page = 1;

        RandomAccessFile book = new RandomAccessFile("123/book.txt", "r");

            while (true) {
                System.out.println();
                System.out.println("Введите номер страницы или \"END\", чтобы закрыть книгу.");
                Scanner nPage = new Scanner(System.in);
                String res = nPage.next();
                if (res.equals("END")){
                    book.close();
                    break;
                }else
                    try{
                        page = Integer.parseInt(res);
                    }catch (NumberFormatException e){
                        System.out.println();
                        System.out.println("Не верно введен номер страницы!");
                        System.out.println();
                    }
                book.seek(1800 * (page-1));
                byte[] onePage = new byte[1800];
                book.read(onePage);
                System.out.println(new String(onePage));
            }
    }
}
