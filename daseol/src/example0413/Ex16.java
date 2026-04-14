package example0413;

public class Ex16 {
    public static void main(String[] args) {
        /*
        int x = 1000000;
        int y = 1000000;
        int z = x * y; // 오버플로우 발생 (4바이트 크기 넘어감)
        System.out.println(z);
    */
    
    /*long x = 1000000;
    long y = 1000000;
    long z = x * y; 
    System.out.println(z);*/  // 방법 1
        
    int x = 1000000;
    int y = 1000000;
    long z = (long)x * (long)y; 
    System.out.println(z);     // 방법 2
    }
}
   
