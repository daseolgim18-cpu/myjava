package example0413;

public class Ex04 {
    public static void main(String[] args) {
    int x = 10;
    int y = 10;
    int z;

    System.out.println("----------------------");

    x++; // x = 11
    ++x; // x = 12
    System.out.println("x=" + x); // x =12

    System.out.println("----------------------");

    y--; // y = 9
    --y; // y = 8
    System.out.println("y=" + y); // y = 8

    System.out.println("----------------------");

    z = x++; // 후위 연산: 연산 후 증가
    System.out.println("z=" + z); // z = 12
    System.out.println("x=" + x); // x = 13

    System.out.println("----------------------");

    z = ++x; // 전위 연산: 증가 후 연산
    System.out.println("z=" + z); // z = 14
    System.out.println("x=" + x); // x = 14

    System.out.println("----------------------");

    z = ++x + y++; // 대입 연산, 전위 연산, 산술 연산, 후위 연산 ()
    System.out.println("z=" + z); // z = 15 + 8 = 23
    System.out.println("x=" + x); // x = 15
    System.out.println("y=" + y); // y = 9
    }
}
