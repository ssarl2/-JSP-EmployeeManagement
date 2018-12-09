package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dongseo.ESDao;
import table.ESCommute;

/**
 * Servlet implementation class ESCommute
 */
@WebServlet("/commute")
public class ESCommuteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext sc = this.getServletContext();
			ESDao esDao = (ESDao)sc.getAttribute("esDao");
			
			request.setAttribute("esCommute", esDao.selectListCommute());
			
			response.setContentType("text/html; charset=UTF-8");
			RequestDispatcher rd = request.getRequestDispatcher(
											"/mainView/ESCommute.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/multiIncluding/Error.jsp");
			rd.forward(request, response);
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		ServletContext sc = this.getServletContext();
		ESDao esDao = (ESDao)sc.getAttribute("esDao");
		
		esDao.update(new ESCommute()
				.setEno(Integer.parseInt(request.getParameter("eno")))
				.setCin(request.getParameter("cin"))
				.setCout(request.getParameter("cout"))
				);
		
		response.sendRedirect("commute");
		
	} catch (Exception e) {
		e.printStackTrace();
		request.setAttribute("error", e);
		RequestDispatcher rd = request.getRequestDispatcher("/multiIncluding/Error.jsp");
		rd.forward(request, response);
	}
	}

}
