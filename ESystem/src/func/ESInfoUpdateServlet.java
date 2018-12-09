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
import table.ESInfo;

@WebServlet("/infoUpdate")
public class ESInfoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext sc = this.getServletContext();
			ESDao esDao = (ESDao)sc.getAttribute("esDao");
			
			ESInfo esInfo = esDao.selectInfo(
					Integer.parseInt(request.getParameter("eno")));
			
			request.setAttribute("esInfo", esInfo);
			
			RequestDispatcher rd = request.getRequestDispatcher(
					"/funcForm/ESInfoUpdateForm.jsp");
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
			
			esDao.update(new ESInfo()
					.setEno(Integer.parseInt(request.getParameter("eno")))
					.setPower(Integer.parseInt(request.getParameter("power")))
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
