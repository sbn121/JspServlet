package member;

public class MemberDAO {
	//현재는 코드가 (servlet, jsp) 생소하여 어려우니 JDBC를 연동X 나중에 연습해보기.
	
	//id와 pw를 파라메터로 입력받아 id가 user pw가 user1234인 경우 true
	//그 외에는 ㄹ
	
	public boolean IsLogin(String id, String pw) {
		if("user".equals(id)&&"user1234".equals(pw)) {
			return true;
		}
			return false;
		
	}
	
}
