package sbn;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import customer.CustomerVO;

public class SbnDAO {
	public void test() {
		String resource = "mybatis/conn.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  int dualInt = session.selectOne("sbn.dual");
			  //session.method(-> .insert, update, delete, selectOne, selectList )
			  //selectOne . selectList
			  //데이터 한 건, 여러 건 조회
			  //selectOne("")=> parameter (statement)
			  //mapper namespace.id
			  //vo : getter & setter를 만들면 자동으로 되는 것은 bean(Spring 객체 만들 때만 사용됨)
//			 SbnVO vo = session.selectOne("sbn.voselect");
//			 System.out.println("==");
			  //List<SbnVO> voList = session.selectList("sbn.listselect");
			  //System.out.println("리스트 사이즈 : "+voList.size());
			  
			  //파라메터의 전송은 단 하나의 객체만 가능하자 => String, int, ArrayList, HashMap...
			  
			  //메소드가 같은 이름으로 여러 개 정의된 것 : 메소드 오버로딩
			  // $, # <=
			  // $ 표시는 ex) vo를 파라메터로 넘기면 vo에 값을 그대로 출력(조건으로 사용)
			  //		where id = field1 (x) field1이라는 컬럼이 없기 때문에 오류
			  // # 표시는 데이터 타입에 맞춰서 처리가 된다.
			  //		where id = 'field1' (o) 값 비교이기 때문에 오류 x
			  
			  // 파라메터는 어떤 타입이든 상관없지만 하나만 전송할 수 있음. (Parameter Object)
			  // 변수를 어러 개 가지고 있는 클래스를 만든다(구조가 DB와 같은 것 ==> VO, DTO 활용)
			  //String data = session.selectOne("sbn.selectwhere1", 1);
			  //System.out.println(data);
			  
			  
//			  List<CustomerVO> list = session.selectList("sbn.selectwhere3");
//			  System.out.println(list);
//			  for(CustomerVO vo : list) {
//				  System.out.println(vo.getId() + vo.getName() + vo.getEmail() + vo.getPhone());
//			  }
			  
			  // 내가 VO를 가지고 있지 않음. 
			  //PLAYER_NUM, PLAYER_NAME, TABLE KOREA
			  // 7, '손흥민'
			  // HashMap<K, V> <=Key, Value 둘 다 클래스타입 가능
			  // ArrayList<E> <=>
			  HashMap<String, Object> params = new HashMap<>();
			  params.put("num", 1);
			  params.put("name", "손흥민");
			  
			  
			  String playerName = session.selectOne("sbn.mapselect", params);
			  System.out.println(playerName);
			  
			  
			  
			  
			}
	}
}
