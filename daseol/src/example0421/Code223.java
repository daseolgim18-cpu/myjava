package example0421;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Code223 {
    public static void main(String[] args) {

        // scanner로 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String content = sc.nextLine(); 

        byte[] bytes = content.getBytes();
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("data5.txt");
            fos.write(bytes);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fos.close();
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
        }
}
