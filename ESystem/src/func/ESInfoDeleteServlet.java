package func;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dongseo.ESDao;

@WebServlet("/infoDelete")
public class ESInfoDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext sc = this.getServletContext();
			ESDao esDao = (ESDao)sc.getAttribute("esDao");
			
			esDao.deleteInfo(Integer.parseInt(request.getParameter("eno")));
			
			response.sendRedirect("info");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/multiIncluding/Error.jsp");
			rd.forward(request, response);
		}
	}
}
