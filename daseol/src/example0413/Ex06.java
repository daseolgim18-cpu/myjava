package example0413;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);  
    
    System.out.print("x값 입력: ");
    String strX = scanner.nextLine();
    int x = Integer.parseInt(strX);

    System.out.print("y값 입력: ");
    String strY = scanner.nextLine();
    double y = Double.parseDouble(strY); 

    double z = x / y;
    //double z = x % y;

    System.out.println(Double.isInfinite(z));
    System.out.println(Double.isNaN(z));

    // 잘못된 코드
    System.out.println(z+2);

    // 알맞은 코드
    if(Double.isInfinite(z) || Double.isNaN(z)) {
        System.out.println("값 산출 불가");
    }
    else {
        System.out.println(z+2);
    }
    }
   
}
