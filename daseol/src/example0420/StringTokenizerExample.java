package example0420;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        
        String text = "홍길동/이수홍/박연수";
        StringTokenizer st;
        st = new StringTokenizer(text, "/");

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

        /* for (; st.hasMoreTokens(); ) {
            String token = st.nextToken();
            System.out.println(token);
        } */
    }
}
