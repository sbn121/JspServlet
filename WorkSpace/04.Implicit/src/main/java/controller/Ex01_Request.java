package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex01_Request")
public class Ex01_Request extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		
		// id != null 조건을 추가해주면 똑같은 처리가 가능함.
		if("admin".equals(id)&&"admin1234".equals(pw)) {
			// id<-String변수가 null일 경우 equals를 사용하면 nullpoinerException발생
			
			System.out.println("아이디 비밀번호 맞음 로그인");
		}else {
			System.out.println("아이디 또는 비번 틀림.");
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST실행");
		doGet(request, response);
	}

}
