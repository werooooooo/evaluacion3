package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.PersonaBean;
import bean.UsuarioBean;
import dao.UsuarioDao;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/LoginServlet")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{	    
		     UsuarioBean user = new UsuarioBean();
		     PersonaBean per = new PersonaBean();
		     
		     user.setUsername(request.getParameter("username"));
		     user.setPassword(request.getParameter("password"));

		     // System.out.print(user.getUsername());
		     
		     user = UsuarioDao.UsuarioLogin(user, per);
			   		    
		     if (user.isValid())
		     {
		    	 HttpSession session = request.getSession(true);	    
		    	 session.setAttribute("currentSessionUser",per); 
		    	 
		         response.sendRedirect("userLogged.jsp"); 
		     } else {
		         response.sendRedirect("invalidLogin.jsp");
		     }
		} catch (Throwable theException){
			System.out.println(theException); 
		}
	}

}
