package example0416;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();

        parent.method2();

        //parent/method3(); 부모 객체 메서드가 아니므로 호출 불가능
    }
}
