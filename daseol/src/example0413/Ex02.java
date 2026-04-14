package example0413;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
         
        System.out.println("--------계산기 프로그램 만들기 미션----------");   

        System.out.print("수행할 연산: ");
        String strZ = scanner.nextLine();

        if(strZ.equals("exit"))
        {
            System.out.println("프로그램을 종료합니다.");
            break;

        }

        System.out.print("x값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY); 

        int result = 0;
        double result5 = 0.0;

        if (strZ.equals("+"))
        {
            result = x + y;
            System.out.println("x + y: " + result);
        }

        else if (strZ.equals("-"))
        {
            result = x - y;
            System.out.println("x - y: " + result);
        }

        else if (strZ.equals("*"))
        {
            result = x * y;
            System.out.println("x * y: " + result);
        }

        else if (strZ.equals("/"))
        {
            if (y == 0)
            {
                System.out.print("y값은 0보다 커야 합니다.");
                continue; // chatgpt 도움 받음
            }
            result5 = x / y;
            System.out.println("x / y: " + result5);
        }
        }     
    }
}