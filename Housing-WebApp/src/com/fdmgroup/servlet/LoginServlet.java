package com.fdmgroup.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao userDao = new UserDao();
		String usrname = request.getParameter("username");
		System.out.println(usrname);
		String pwd = request.getParameter("password");
		
		if (usrname.equals("admin") && pwd.equals("1234")){
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/admin.jsp");
			rd.forward(request, response);
			return;
			
		}
		User user = userDao.findByUsername(usrname);
		if(user != null && user.getPassword().equals(pwd)) {
			System.out.println("Login was successful!");
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			//session.setMaxInactiveInterval(300);
			if(user.getDecriminatorValue().equals("Tenant")){
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/tenant.jsp");
			rd.forward(request, response);
			return;
			}
		
		if(user.getDecriminatorValue().equals("Landlord")){
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/landlord.jsp");
			rd.forward(request, response);
			return;
		}
		}
		System.out.print("Login was NOT successful!");
		request.setAttribute("errorMsg", "Username/Password is not valid!!");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/login.jsp");
		rd.forward(request, response);
	}

}



