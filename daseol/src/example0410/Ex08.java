package example0410;

public class Ex08 {
    public static void main(String[] args) {
        // 실수값 저장
        double var1 = 3.14;
        // float var2 = 3.14; // 리터럴 실수값은 double형이므로 작은 크기의 float 공간에 넣을 수 없음
                              // 컴파일 에러 (값 손실)
        float var3 = 3.14F;

        // 정밀도 테스트
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;

        System.out.println("var1: " + var1);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
    }
}
