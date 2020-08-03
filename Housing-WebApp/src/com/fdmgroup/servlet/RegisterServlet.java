package com.fdmgroup.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.dao.LandlordDao;
import com.fdmgroup.dao.TenantDao;
import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.Citizenship;
import com.fdmgroup.model.Landlord;
import com.fdmgroup.model.Tenant;
import com.fdmgroup.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		String message = "Signup was successful!";
		request.setAttribute("msg", message);
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");

		String userType = request.getParameter("user-type");
		System.out.println("Usertype is " + userType);

		if (userType.equals("t")) {
			System.out.println("inside tenant createing");

			String citizen = request.getParameter("citizenship");
			Tenant tenant = new Tenant();
			tenant.setEmail(email);
			tenant.setFirstName(firstName);
			tenant.setLastName(lastName);
			tenant.setUsername(username);
			tenant.setPassword(pass);
			tenant.setStatus(Citizenship.valueOf(citizen));
			System.out.println("object created");
			TenantDao tenantdao = new TenantDao();
			tenantdao.create(tenant);
		}
		if (userType.equals("l")) {
			String comp = request.getParameter("company");
			Landlord landlord = new Landlord();
			landlord.setEmail(email);
			landlord.setFirstName(firstName);
			landlord.setLastName(lastName);
			landlord.setUsername(username);
			landlord.setPassword(pass);
			landlord.setCompanay(comp);
			LandlordDao landlorddao = new LandlordDao();
			landlorddao.create(landlord);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/login.jsp");
		rd.forward(request, response);
	}

}
