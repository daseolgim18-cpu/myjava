package example0415;

class Animal{
    String name;

    public void setName(String name) { // 클래스 내 객체 메서드
        this.name = name;
    }
}

class AddSample {
    int sum(int a, int b) { // 입력값과 리턴값이 있는 메서드
        return a+b;
    }
}

class Add1Sample {
    void sum(int a, int b) { // 입력값과 리턴값이 없는 메서드
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
    }
}

class StrSample { // 입력값과 리턴값이 있는 메서드
    String say(){
        return "Hi";
    }
}

class Str1Sample {
    void say(){ // 입력값과 리턴값이 없는 메서드
        System.out.println("Hi");
    }
}

class ReturnSample {
    void sayNick(String nick){
        if ("바보".equals(nick)){ // String형 nick값이 "바보"이면 true 
            return; // 메서드 종료 return
        }
        System.out.println("나의 별명은 " + nick + "입니다.");
    }
}

class TestSample {
    void varTest(int i) {
        i++;
    }

    int varTest1(int j) {
        j++;
        return j;
    }
}

public class Sample {
    public static void main(String[] args) {
        Animal cat = new Animal();
        System.out.println(cat.name);
        cat.setName("boby");
        System.out.println(cat.name);

        Animal dog = new Animal();
        System.out.println(dog.name);
        dog.setName("happy");
        System.out.println(dog.name);

        if(dog != cat){
            System.out.println("서로 다른 객체입니다.");
        }
        else{
            System.out.println("서로 같은 객체입니다.");
        }

        int a = 3;
        int b = 4;

        AddSample result = new AddSample();
        int c = result.sum(a,b);
        int d = result.sum(4, 6);

        System.out.println(c);
        System.out.println(d);

        StrSample str = new StrSample();
        String value = str.say();
        System.out.println(value);

        Add1Sample result1 = new Add1Sample();
        result1.sum(10, 20);

        Str1Sample str1 = new Str1Sample();
        str1.say();

        ReturnSample str2 = new ReturnSample();
        str2.sayNick("야호");
        str2.sayNick("바보"); // return으로 메서드 종료, 출력되지 않음
    
        int i = 1;
        TestSample result2 = new TestSample();
        result2.varTest(i);
        System.out.println(i); // 메서드 안에서 사용한 매개변수 i는 메서드 안에서만 쓰이는 변수
    
        int j = 1;
        TestSample result3 = new TestSample();
        int x =result3.varTest1(j);
        System.out.println(x);
    }
}
