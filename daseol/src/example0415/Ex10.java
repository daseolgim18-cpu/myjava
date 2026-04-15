package example0415;

public class Ex10 {
    public static void main(String[] args) {
        Car4 myCar = new Car4(); // 기본 생성자 호출

        myCar.setGas(5); // Car4의 setGas() 메소드 호출

        boolean gasState = myCar.isLeftGas(); // Car4의 isLeftGas() 메소드 호출
        if(gasState){
            System.out.println("출발합니다.");
            myCar.run(); // Car4의 run() 메소드 호출
        }

        if(myCar.isLeftGas()){ // Car4의 isLeftGas() 메소드 호출
        if(gasState){
            System.out.println("gas를 주입할 필요가 없습니다.");
        }
        else{
            System.out.println("gas를 주입하세요.");
        }
    }
}
}
