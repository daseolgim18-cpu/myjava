package example0415;

public class Ex09 {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int[] values1 = {1, 2, 3};
        int result1 = myCom.sum1(values1);
        System.out.println("result1: " + result1);

        int[] values2 = new int[] {1, 2, 3, 4, 5};
        int result2 = myCom.sum1(values2);
        System.out.println("result2: " + result2);
    }
}
