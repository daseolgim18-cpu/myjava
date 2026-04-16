package example0416;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        // t.hour = 13; 
        t.setHour(t.getHour()+1); // 현재 시간보다 1시간 후로 변경한다.
        System.out.println(t); // System.out.println(t.toString());과 같다.
    }
}
