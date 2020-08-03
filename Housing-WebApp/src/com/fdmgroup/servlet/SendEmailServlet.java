package com.fdmgroup.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.User;

/**
 * Servlet implementation class SendEmailServlet
 */
@WebServlet("/email")
public class SendEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SendEmailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	UserDao userdao=new UserDao();
	HttpSession se=request.getSession();
	User u=(User) se.getAttribute("user");
	String ownerUser= (String) se.getAttribute("userOwner");
	User owner=userdao.findByUsername(ownerUser);
	
	String tenatUserName=u.getUsername();
	String tenantPassword=u.getPassword();
	String ownerUsername=owner.getUsername();
	String message=request.getParameter("msg");
	sendMessage(message, u.getEmail(), owner.getEmail());
	
//	String tenatUserName=request.getParameter("tenantUsername");
//	String tenantPassword=request.getParameter("password");
//	String ownerUsername=request.getParameter("ownerusr");
//	String message=request.getParameter("msg");
//	sendMessage(message, "", "");
	
	
	PrintWriter out = response.getWriter();
	out.println("<html>"
			+"<body>"
			+"<h2> Thank you " + u.getFirstName() + " "+ u.getLastName()
			+ " </h2>" 
			+"<p> Your message " + "'" + message+ "'" 
			+ " "
			+ " has been sent! <a href='" + "login?username="+u.getUsername()+"&password="+ u.getPassword() + "'> Go back</a> to the previous page</p>"
			+"</body>"
			+"</html>");
}
		

	
	public void sendMessage(String message, String from, String to){
		
	}

}
