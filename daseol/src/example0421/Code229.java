package example0421;

class Data<T> { // 클래스명 옆에 제네릭 기호 <>를 사용
    T obj;      // 인스턴스 변수 obj의 자료형은 T
    Data(T ob) { // 생성자 Data는 자료형이 T인 매개변수 ob를 받아 초기화 (클래스 뒤에 있는 제네릭 기호 자동 생성)
        obj = ob;
    }
    T getObj() { // 인스턴스 변수 obj의 자료형은 T
        return obj;
    }
    void showType(){
        System.out.println("Type of T:" + obj.getClass().getName());
    }
}

public class Code229 {
    public static void main(String[] args) {
        Data<Integer> d1 = new Data<Integer>(100); // 정수 100 인수
        System.out.println(d1.getObj());
        d1.showType();

        Data<String> d2 = new Data<String>("JAVA"); // 문자열 "JAVA"인수
        System.out.println(d2.getObj());
        d2.showType();
    }    
}
