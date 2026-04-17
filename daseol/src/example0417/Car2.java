package example0417;

public class Car2 {
   
    /* 배열 형태로 필드 생성 */
    Tire1[] tires = {
        new Tire1("앞왼쪽", 6),
        new Tire1("앞오른쪽", 2),
        new Tire1("뒤왼쪽", 3),
        new Tire1("뒤오른쪽", 4),
    };

    //생성자

    //메소드
    int run(){
        System.out.println("[자동차가 달립니다.]");
      
        for(int i = 0; i < tires.length; i++) {
            if(tires[i].roll()==false) {
                stop();
                return (i+1);
            }
        }
        return 0;
    } 

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
