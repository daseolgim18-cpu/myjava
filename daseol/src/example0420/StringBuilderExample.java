package example0420;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("Program Study");
        System.out.println(sb.toString());

        sb.insert(4, "2");
        System.out.println(sb.toString());

        sb.setCharAt(4, '6');
        System.out.println(sb.toString());

        // 인덱스 6부터 12까지 삭제하고 그자리에 "Book"을 넣음
        sb.replace(6, 13, "Book"); 
        System.out.println(sb.toString());

        sb.delete(4, 5);
        System.out.println(sb.toString());

        int length = sb.length();
        System.out.println("총문자수: " + length);

        String result = sb.toString();
        System.out.println(result);
    }
}
