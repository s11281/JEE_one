

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/rejestracja")
public class rejestracja extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public rejestracja() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();

		if(name!=null && !name.equals(""))
		{
			session.setAttribute("name",name);
			context.setAttribute("name",name);
		}

		response.getWriter().println("Hello"+name+"!");
		response.getWriter().println("Hello from session"+session.getAttribute("name"));
		response.getWriter().println("Hello from context"+context.getAttribute("name"));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
