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
import table.ESDept;

/**
 * Servlet implementation class ESDeptAddServlet
 */
@WebServlet("/deptAdd")
public class ESDeptAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/funcForm/ESDeptAddForm.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext sc = this.getServletContext();
			ESDao esDao = (ESDao)sc.getAttribute("esDao");
			
			esDao.insert(new ESDept()
					.setDeptNo(Integer.parseInt(request.getParameter("deptno")))
					.setDeptName(request.getParameter("deptname"))
					.setManager(request.getParameter("manager"))
					);

			response.sendRedirect("dept");
			
	    } catch (Exception e) {
	      e.printStackTrace();
	      request.setAttribute("error", e);
	      RequestDispatcher rd = request.getRequestDispatcher("/multiIncluding/Error.jsp");
	      rd.forward(request, response);
	    }
	  }
}