package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sbn.SbnDAO;


@WebServlet("*.bat") // 어떤 이름 문자열 아무거나 상관없음 뒤에가 .bat로 끝나는 문자열이면 이 클래스의 메소드를 실행함
public class MybatisController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//System.out.println("MybatisController");
			SbnDAO dao = new SbnDAO();
			dao.test();
		
	}

}
