package example0420;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override // Object의 equals()를 내가 Member용으로 재정의
    public boolean equals(Object obj) {
        if(obj instanceof Member) { // obj가 Member 객체가 맞는지 확인
            Member member = (Member) obj;
            if(id.equals(member.id)){
                return true;
            }
        }
        return false;
    }
}