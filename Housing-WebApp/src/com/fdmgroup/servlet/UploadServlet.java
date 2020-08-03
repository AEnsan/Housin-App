package com.fdmgroup.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.dao.PropertyDao;
import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.Image;
import com.fdmgroup.model.Landlord;
import com.fdmgroup.model.Property;
import com.fdmgroup.model.User;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("user");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String type = request.getParameter("type");
		int bedroom = Integer.parseInt(request.getParameter("bedroom"));
		double price = Double.parseDouble(request.getParameter("price"));
//		System.out.println(username);
//		System.out.println(address);
//		System.out.println(city);
//		System.out.println(type);
//		
		
//		// Image
		File file = new File("/Users/alireza_ensan/Desktop/im4.jpg");
		byte[] bArray1 = readFileToByteArray(file);
		Image image1 = new Image();
		image1.setImage_name(file.getName());
		image1.setPicture(bArray1);
		List<Image> images = new ArrayList<Image>();
		images.add(image1);
//		//
		UserDao userdao=new UserDao();
		User user=userdao.findByUsername(username);
		String password=user.getPassword();
		Property property=new Property();
		property.setAddress(address);
		property.setBedroom(bedroom);
		property.setCity(city);
		property.setPrice(price);
		property.setType(type);
		property.setImages(images);
		property.setOwner((Landlord) user);
//		//
//		
		PropertyDao propoertydao=new PropertyDao();
		propoertydao.insertProperty(property);
		
	
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+"<body>"
				+"<h2> Upload was successful! <a href='" + "login?username="+username+"&password="+ password + "'>Go back to the main page</a> </h2>"
				+"</body>"
				+"</html>");
	
	}
		

	private static byte[] readFileToByteArray(File file) {
		FileInputStream fis = null;
		// Creating a byte array using the length of the file
		// file.length returns long which is cast to int
		byte[] bArray = new byte[(int) file.length()];
		try {
			fis = new FileInputStream(file);
			fis.read(bArray);
			fis.close();
		} catch (IOException ioExp) {
			ioExp.printStackTrace();
		}
		return bArray;
	}
}
