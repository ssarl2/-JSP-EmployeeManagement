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


@WebServlet("/dataSearch")
public class ESDataSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*ServletContext sc = this.getServletContext();
		ESDao esDao = (ESDao)sc.getAttribute("esDao");
		
		ESInfo esInfo = esDao.selectInfo(
				Integer.parseInt(request.getParameter("eno")));
		
		request.setAttribute("esInfo", esInfo);
		
		RequestDispatcher rd = request.getRequestDispatcher(
				"/funcForm/ESInfoUpdateForm.jsp");
		rd.forward(request, response);*/
		try {
			ServletContext sc = this.getServletContext();
			ESDao esDao = (ESDao)sc.getAttribute("esDao");
			int eno = Integer.parseInt(request.getParameter("eno"));
			//ESData esData = esDao.searchData(Integer.parseInt(request.getParameter("eno"))); 
			request.setAttribute("esData", esDao.searchData(eno));
			
			response.setContentType("text/html; charset=UTF-8");
			RequestDispatcher rd = request.getRequestDispatcher("/funcForm/ESDataSearchForm.jsp");

			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/multiIncluding/Error.jsp");
			rd.forward(request, response);
		}
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*try {
			ServletContext sc = this.getServletContext();
			ESDao esDao = (ESDao)sc.getAttribute("esDao");
			
			esDao.searchData(Integer.parseInt(request.getParameter("eno")));
			
			RequestDispatcher rd = request.getRequestDispatcher("/funcForm/ESDataSearchForm.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/multiIncluding/Error.jsp");
			rd.forward(request, response);
		}*/
	}
}