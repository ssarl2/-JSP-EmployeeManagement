package func;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import table.ESInfo;
import dongseo.ESDao;

/**
 * Servlet implementation class ESAdd
 */
@WebServlet("/infoAdd")
public class ESInfoAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/funcForm/ESInfoAddForm.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext sc = this.getServletContext();
			ESDao esDao = (ESDao)sc.getAttribute("esDao");
			
			esDao.insert(new ESInfo()
					.setEname(request.getParameter("ename"))
					.setSex(request.getParameter("sex"))
					.setDeptNo(Integer.parseInt(request.getParameter("deptno")))
					.setPhone(request.getParameter("phone"))
					.setAddress(request.getParameter("address"))
					);

			response.sendRedirect("info");
			
	    } catch (Exception e) {
	      e.printStackTrace();
	      request.setAttribute("error", e);
	      RequestDispatcher rd = request.getRequestDispatcher("/multiIncluding/Error.jsp");
	      rd.forward(request, response);
	    }
	  }
}
