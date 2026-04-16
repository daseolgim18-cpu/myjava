package example0416;

public class Car {
    //필드
    private int speed;    // 기본 초기화 값 0
    private boolean stop; // 기본 초기화 값 false

    // 생성자

    // 메소드
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if(speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
