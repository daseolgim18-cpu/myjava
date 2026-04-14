package example0413;

public class Ex15 {
    public static void main(String[] args) {
        int temp = 28;

        if (temp >=30)
        {
            System.out.println("폭염 주의보");
        }
        else if (temp >=25 && temp < 30)
        {
             System.out.println("야외활동 적당");
        }
        else if (temp >=10 && temp < 25)
        {
             System.out.println("쌀쌀한 날씨");
        }
        else
        {
            System.out.println("추운 날씨");
        }
    }
}
