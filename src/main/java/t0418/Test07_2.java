package t0418;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/T07_2")  //여기서 지정한 컨트롤러명으로 옴
public class Test07_2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");  //한글처리 두줄 필수
		response.setContentType("text/html; charset=UTF-8");
		
		String mid =request.getParameter("mid");
		String pwd =request.getParameter("pwd");

		PrintWriter out = response.getWriter();  //브라우저에 출력하려면 무조건 생성
		
		out.println("아이디2: "+mid+"<br/>");
		out.println("비밀번호2: "+pwd+"<br/>");
		out.println("<a href='/javagreenJ/0418/test07.jsp'>돌아가기 </a>");
	}
}
