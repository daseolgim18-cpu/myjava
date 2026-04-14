package example0413;

public class Ex08 {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        //char c3 = c2 + 1;  // 컴파일 에러 (char형의 연산은 무조건 int형)
        char c3 = (char) (c2 + 1);
        System.out.println("c1: " + c1);
        System.out.println("c1: " + c2);
        System.out.println("c3: " + c3);
    }
}
