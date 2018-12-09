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
import table.ESData;

/**
 * Servlet implementation class ESDeptUpdateServlet
 */
@WebServlet("/dataUpdate")
public class ESDataUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext sc = this.getServletContext();
			ESDao esDao = (ESDao)sc.getAttribute("esDao");
			
			ESData esData = esDao.selectData(
					Integer.parseInt(request.getParameter("fno")));
			
			request.setAttribute("esData", esData);
			
			RequestDispatcher rd = request.getRequestDispatcher(
					"/funcForm/ESDataUpdateForm.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/multiIncluding/Error.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext sc = this.getServletContext();
			ESDao esDao = (ESDao)sc.getAttribute("esDao");
			
			esDao.update(new ESData()
					.setFno(Integer.parseInt(request.getParameter("fno")))
					.setPower(Integer.parseInt(request.getParameter("power")))
					.setData(request.getParameter("data"))
					);
			
			response.sendRedirect("data");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/multiIncluding/Error.jsp");
			rd.forward(request, response);
		}
	}
}
