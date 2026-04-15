package example0415;

public class Ex17 {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa"; 필드에서 final로 선언되어있음
        //p1.ssn = "654321-7654321"; 필드에서 final로 선언되어있음
        p1.name = "을지문덕"; 
        System.out.println(p1.name);
    }
}
