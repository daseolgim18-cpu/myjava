package example0417;

public class Car1Example {
    public static void main(String[] args) {
        Car1 car = new Car1();

        for(int i = 1; i<=5; i++) {
            int problemLocation = car.run();
            switch(problemLocation){
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire1("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.frontRightTire = new KumhoTire1("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.backLeftTire = new HankookTire1("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    car.frontLeftTire = new KumhoTire1("뒤오른쪽", 17);
                    break;
                }
                System.out.println("--------------------------------------------------------");
        }
    }
}
