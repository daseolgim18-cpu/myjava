package example0417;

public class KumhoTire1 extends Tire1{
       //필드
    //생성자
    public KumhoTire1(String location, int maxRotation) {
        super(location, maxRotation);
    }

    //메소드
    public boolean roll() {
        ++accumlatedRotation;
        if(accumlatedRotation<maxRotation) {
            System.out.println(location + " KumhoTire 수명: " + (maxRotation-accumlatedRotation) + "회");
            return true;
        } else {
            System.out.println("***" + location + " KumhoTire 펑크 ***");
            return false;
        }
    }
      
}
