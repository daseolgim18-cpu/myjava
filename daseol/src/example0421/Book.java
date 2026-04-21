package example0421;

public class Book implements Manageable {
    
    private int id; // 도서 식별 번호
    private String title; // 도서 제목
    private String author; // 저자명
   
    //  저장 시 사용할 CSV 포맷 문자열 반환 메서드
    public void toFileString(){
        return id + "," + title + "," + author;
    }
}
