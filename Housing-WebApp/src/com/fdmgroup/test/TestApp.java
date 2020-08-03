package com.fdmgroup.test;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.ejb.criteria.PathSource;

import com.fdmgroup.dao.ImageDao;
import com.fdmgroup.dao.LandlordDao;
import com.fdmgroup.dao.PropertyDao;
import com.fdmgroup.dao.TenantDao;
import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.Citizenship;
import com.fdmgroup.model.Image;
import com.fdmgroup.model.Landlord;
import com.fdmgroup.model.Property;
import com.fdmgroup.model.Tenant;
import com.fdmgroup.model.User;
import com.mysql.cj.Query;

import javafx.scene.shape.Path;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		  String to = "sonoojaiswal1988@gmail.com";//change accordingly  
	      String from = "sonoojaiswal1987@gmail.com";  
	      String host = "localhost";//or IP address  
	  
	     //Get the session object  
	      Properties properties = System.getProperties();  
	      properties.setProperty("mail.smtp.host", host);  
//	      Session session = Session.getDefaultInstance(properties);  
//	  
//	     //compose the message  
//	      try{  
//	         MimeMessage message = new MimeMessage(session);  
//	         message.setFrom(new InternetAddress(from));  
//	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
//	         message.setSubject("Ping");  
//	         message.setText("Hello, this is example of sending email  ");  
//	  
//	         // Send message  
//	         Transport.send(message);  
//	         System.out.println("message sent successfully....");  
//	  
//	      }catch (MessagingException mex) {mex.printStackTrace();}  
	   } 
		
		
		
		
//		List<Property> properties = propertyDao.filterProperty(1500, 2000, 2, "Condo", "Toronto");
//		for (Property p:properties){
//			System.out.println(p);
//		}

		
		
		//fetch data
//		PropertyDao propoertydao=new PropertyDao();
//		Property property=propoertydao.findProperty("1200 Broadway Street");
//		byte [] myimg=property.getImages().get(0).getPicture();
//		FileOutputStream fout=new FileOutputStream("WebContent/outputimages/sample.jpg",false);  
//		fout.write(myimg);  
//		              
//		fout.close();
		
//		 File file = new File("/Users/alireza_ensan/Desktop/im2.jpg");
//		
//		 byte[] bArray1 = readFileToByteArray(file);
//		
//		 Image image1=new Image();
//		 image1.setPicture(bArray1);
//		 File file2 = new File("/Users/alireza_ensan/Desktop/im3.jpg");
//			
//		 byte[] bArray2 = readFileToByteArray(file2);
//		
//		 
//		 
//		 Image image2=new Image();
//		 image2.setPicture(bArray1);
//		 
//		 
//		
//		 List<Image>images=new ArrayList<Image>();
//		 images.add(image1);
//		 images.add(image2);
//		
//		//
//		 
//		 Landlord tenant = new Landlord();
//		 tenant.setUsername("dbrown");
//		 tenant.setEmail("david@google.ca");
//		 tenant.setPassword("pppp");
//		 tenant.setFirstName("David");
//		 tenant.setLastName("Brown");
//		 LandlordDao ld=new LandlordDao();
//		 ld.create(tenant);
//		 UserDao udao=new UserDao();
//		 User u=udao.findByUsername("dbrown");
////		 
//	 Property property=new Property();
////		 property.setImages(images);
//		 property.setAddress("333 King Street");
//		 property.setPrice(2200);
//		 property.setBedroom(2);
//	 property.setCity("Vancouver");
//		 property.setType("Condo");
//		 property.setOwner((Landlord) u);
//		
//		 PropertyDao propoertydao=new PropertyDao();
//		 propoertydao.insertProperty(property);
//		//
//	
		// PropertyDao propertydao=new PropertyDao();
		// propertydao.insertProperty(property);

		// UserDao userdao = new UserDao();
		// User user=userdao.findByUsername( "dtompson");
		// System.out.print(user.getDecriminatorValue());
		// Tenant user=(Tenant)userdao.findByUsername( "tmx");
		// System.out.print(user);
		// TenantDao tenantdao = new TenantDao();
		// User user=new User();
		// user.setFirstName("john");
		// user.setLastName("Brown");
		// user.setPassword("1234");
		// user.setEmail("sample@google.com");
		// user.setUsername("jbrown");
		// userdao.create(user);
		// // userdao.remove("jbrown");

		// Tenant tenant = new Tenant();
		// tenant.setUsername("sjones");
		// tenant.setEmail("sara@yahoo.ca");
		// tenant.setPassword("5y67");
		// tenant.setFirstName("Sara");
		// tenant.setLastName("Jones");
		// tenant.setStatus(Citizenship.Canadian);
		//
		// tenantdao.create(tenant);

		// List<User> users= userdao.findAllUser();
		// for (User user:users){
		// System.out.println(user);
		// }



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
