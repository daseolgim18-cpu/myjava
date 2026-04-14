public class App { // App은 활용 클래스
    public static void main(String[] args) throws Exception { // main 메서드는 라이브러리를 호출해서 사용, public는 어디서든 공용으로 사용
                                                              /* String[] args는 cmd에서 값을 받아서 처리하지만, 
                                                                여기서는 f5 누르면 머신이 자동으로 값을 입력해줌*/
                                                              /* 예기치 않은 상황에서 예외 처리 떠넘기기*/    
        System.out.println("Hello, World!"); /* System 클래스에는 out 변수 안에 있는 터미널 출력을 담담하는 println을 호출
                                                   println은 하나의 string을 입력받아서 출력 */ 
    }
}
