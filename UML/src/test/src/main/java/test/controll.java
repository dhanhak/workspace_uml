package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.Member;

@WebServlet("/controll")
public class controll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String memberId = request.getParameter("id");

		String memberPw = request.getParameter("pw");

		String memberName = request.getParameter("name");

		Member member= new Member();

		MemberDAO dao = new MemberDAO();

		int result = dao.insertMember(member);

		String msg = "";

		if(result > 0) {

		msg = "회원가입 성공";

		}else {

		msg = "회원가입 실패";

		}

		request.setAttribute("msg", msg);
		request.getRequestDispatcher("").forward(request, response);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/joinResult.jsp");

		dispatcher.forward(request, response);

		}
	
	

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
