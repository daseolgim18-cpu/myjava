package example0415;

public class Ex12 {
    public static void main(String[] args) {
        Calculator2 myCalc = new Calculator2();
        int result1 = myCalc.plus(4, 5);
        double result2 = myCalc.plus(4.0, 5);
        double result3 = myCalc.plus(4.0, 5.0);
        int result4 = myCalc.minus(9, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
}
