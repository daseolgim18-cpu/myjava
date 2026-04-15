package example0415;

public class Ex16 {
    public static void main(String[] args) {

        /*
        Sigleton obj1 = new Singleton(); // 외부에서 사용 x (컴파일 에러)
        Sigleton obj1 = new Singleton(); // 외부에서 사용 x (컴파일 에러)
        */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        
        if(obj1==obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        }
        else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
