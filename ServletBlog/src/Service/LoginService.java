package Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.MemberDAO;
import DTO.MemberDTO;
import Interface.ServiceForward;
import Interface.ServiceInterface;

public class LoginService implements ServiceInterface{

	@Override
	public ServiceForward excute(HttpServletRequest request, HttpServletResponse response) {
		ServiceForward forward = new ServiceForward();
		forward.setRedirect(true);
		forward.setPath("./index.jsp");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pwd);
		
		boolean b = new MemberDAO().login(dto);
		
		if(b){ // 로그인에 성공 했을때
			System.out.println("로그인 성공");
			HttpSession session = request.getSession();
			session.setAttribute("member", dto);
		}else{
			System.out.println("로그인 실패");
		}
		
		return forward;
	}

}
