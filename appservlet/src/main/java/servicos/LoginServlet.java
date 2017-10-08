package servicos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String location = "formularioLogin.jsp";
		response.sendRedirect(location);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email;
		String senha;
		String location;
		
		email = request.getParameter("email");
		senha = request.getParameter("senha");
		
		if (email.equals("admin@hotmail.com") && senha.equals("admin")) {
			request.setAttribute("email", email);
			request.setAttribute("senha", senha);
			location = "principal";
			request.getRequestDispatcher(location).forward(request, response);;
		} else {
			location = "formularioLogin.jsp";
			response.sendRedirect(location);
		}
	}

}
