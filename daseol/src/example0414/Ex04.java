package example0414;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("StringEquals java 문자열 비교");

        String strVar1 = "신민철";
        String strVar2 = "신민철";

        if(strVar1 == strVar2){
            System.out.println("StrVar1과 strVar2는 참조가 같음");
        }
        else {
            System.out.println("StrVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("StrVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String ("신민철");
        String strVar4 = new String ("신민철");

        if(strVar3 == strVar4){
            System.out.println("StrVar3과 strVar4는 참조가 같음");
        }
        else {
            System.out.println("StrVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("StrVar3과 strVar4는 문자열이 같음");
        }
    }
}
