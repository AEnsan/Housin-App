package com.fdmgroup.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.dao.PropertyDao;
import com.fdmgroup.model.Image;
import com.fdmgroup.model.Property;

@WebServlet("/filter")
public class FilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FilterServlet() {
		super();

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
		PropertyDao propertyDao = new PropertyDao();

		String typeParam = request.getParameter("type");
		String cityParam = request.getParameter("city");
		String priceParam = request.getParameter("price");
		String bedroomParam = request.getParameter("bedroom");
		String type = typeParam;
		String city = cityParam;
		int bedroom = 0;
		double priceMin = 0;
		double priceMax = 10000;
		
		
	

		// if-else statements for price
		if (priceParam.equals("a")) {
			priceMin = 500;
			priceMax = 1000;
		} else if (priceParam.equals("b")) {
			priceMin = 1000;
			priceMax = 1500;
		} else if (priceParam.equals("c")) {
			priceMin = 1500;
			priceMax = 2000;
		} else if (priceParam.equals("d")) {
			priceMin = 2000;
			priceMax = 2500;
		} else if (priceParam.equals("e")) {
			priceMin = 2500;
			priceMax = 3000;
		} else if (priceParam.equals("f")) {
			priceMin = 3000;
			priceMax = 10000000;
		}

		// if-else for bedroom
		if (bedroomParam.equals("zero")) {
			bedroom = 0;
		} else if (bedroomParam.equals("one")) {
			bedroom = 1;
		} else if (bedroomParam.equals("two")) {
			bedroom = 2;
		} else if (bedroomParam.equals("more")) {
			bedroom = 3;
		}

		
//		System.out.println("min price: "+ priceMin);
//		System.out.println("max price: "+ priceMax);
//		System.out.println("bedroom: "+ bedroom);
//		System.out.println("type: "+ type);
//		System.out.println("city: "+ city);
//		
		
//
	List<Property> properties = propertyDao.filterProperty(priceMin, priceMax, bedroom, type, city);

//
		HashMap<Integer, ArrayList<String>> paths = new HashMap<Integer, ArrayList<String>>();
//
		
//		ServletOutputStream sos=null;
//		sos=response.getOutputStream();
//		sos.write(image.getPicture());
		
		
		
		for (Property property : properties) {
			List<Image> propertyImages = property.getImages();
			ArrayList<String> imageNames = new ArrayList<String>();
			for (Image image : propertyImages) {
				FileOutputStream fout = new FileOutputStream("/Users/alireza_ensan/Documents/outputimages/"+image.getImage_name(), false);
				fout.write(image.getPicture());
				imageNames.add(image.getImage_name());

			}
			paths.put(property.getPropertyId(), imageNames);

		}
		
//		for (Integer item :paths.keySet() ){
//			
//			for (String str: paths.get(item)){
//				System.out.println(item + ":"+ str);
//				
//			}
//		}
		
	  	    request.setAttribute("imageNames", paths);
////
         request.setAttribute("posts", properties);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/tenantSearch.jsp");
		rd.forward(request, response);

	}

}
