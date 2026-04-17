package example0417;

public class Car2Example {
    public static void main(String[] args) {
        Car2 car = new Car2();

        for(int i = 1; i<=5; i++) {
            int problemLocation = car.run();
            if(problemLocation != 0) {
                System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체");
                car.tires[problemLocation-1] = new HankookTire1(car.tires[problemLocation-1].location, 15);
            }
        }    
    }
}
