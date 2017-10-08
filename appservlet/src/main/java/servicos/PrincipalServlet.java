package servicos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrincipalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrincipalServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String location = "efetuarLogin";
		response.sendRedirect(location);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		request.setAttribute("email", email);
		String location = "telaPrincipal.jsp";
		request.getRequestDispatcher(location).forward(request, response);;
	}

}
