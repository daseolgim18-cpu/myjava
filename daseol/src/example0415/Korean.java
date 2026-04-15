package example0415;

public class Korean {
    //필드
    String nation = "대한민국"; // 명시적 초기화
    String name;
    String ssn;

    //생성자
    /*public Korean(String n, String s) {
    name = n;
    ssn = s;
    } */

    public Korean(String name, String ssn) { // 생성자명이랑 클래스명은 대소문자 동일
        this.name = name; //  생성된 객체 위치의 name
        this.ssn = ssn; // 생성된 객체 위치의 ssn
    }
}
