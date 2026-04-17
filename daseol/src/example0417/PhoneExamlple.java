package example0417;

public class PhoneExamlple {
    public static void main(String[] args) {
    
    //Phone phone = new Phone(); 추상 클래스는 객체 생성 불가

    SmartPhone smartPhone = new SmartPhone("홍길동");

    smartPhone.turnOn();
    smartPhone.intersearch();
    smartPhone.turnOff();
    }
 

}
