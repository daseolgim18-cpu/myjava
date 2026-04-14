package example0413;

public class Ex19 {
    public static void main(String[] args) {
        System.out.println("학년(오름차순) 반(내림차순) 출력 프로그램");
        for (int i = 3; i <= 6; i++){
            System.out.println(i + "학년");
            for (int j = 5; j >=1; j--)
            {
                System.out.println(i + "학년" + j + "반");
            }
        }
    }
}
