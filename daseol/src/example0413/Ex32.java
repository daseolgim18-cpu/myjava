package example0413;

public class Ex32 {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            System.out.println(i + " ");
        }

        int sum = 0;
        int j = 0;
        for(j = 1; j<=100; j++) {
            sum += j;
        }
        System.out.println("1부터" + " " + (j -1) + "까지" + " " + "합: " + sum);

        int a, b = 0;
        for (a = 1; a <= 9; a++){
            System.out.println("----"+ a + "단" + "----");
            for(b = 1; b <= 9; b++){
                System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + a*b);
            }
        }
    }
}
