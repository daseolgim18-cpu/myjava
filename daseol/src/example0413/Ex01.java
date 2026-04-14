package example0413;

import java.util.Scanner;
public class Ex01 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = scanner.nextLine();

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();
        System.out.println(name + "님의 x + y 결과: " + result);
        System.out.println();

        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if (data.equals("+")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }

        System.out.println("종료");
    }
}

