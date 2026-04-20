package example0420;

import java.util.Objects;

public class NullExample {
     public static void main(String[] args) {
        String name1 = "홍길동";
        String name2 = null;

        // 1. 정상 값 검사
        if (Objects.nonNull(name1)) {
            System.out.println("name1는 " + name1 + "입니다.");
        }

        // 2. null 체크
        if (Objects.isNull(name2)) {
            System.out.println("name2는 null입니다.");
        }

        // 3. try-catch와 같이 사용
        try {
            if (Objects.isNull(name2)) {
                throw new NullPointerException("이름이 없습니다.");
            }
            System.out.println(name2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
