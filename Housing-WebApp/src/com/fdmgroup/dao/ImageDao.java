package com.fdmgroup.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.persistence.EntityManager;

import org.hibernate.engine.jdbc.BlobProxy;

import com.fdmgroup.model.Image;
import com.fdmgroup.model.Landlord;
import com.mysql.cj.jdbc.Blob;

public class ImageDao {

	private DbConnection connection;

	public ImageDao() {
		super();
		connection = DbConnection.getInstance();
	}

	// public Image InsertbyPath(String path) throws IOException {
	// Image image=new Image();
	// File file = new File(path);
	// byte[] picInBytes = new byte[(int) file.length()];
	// FileInputStream fileInputStream = new FileInputStream(file);
	// fileInputStream.read(picInBytes);
	// image.setPicture(picInBytes);
	// image.setImage_name(file.getName());
	// fileInputStream.close();
	//
	// EntityManager em = connection.getEntityManager();
	// em.getTransaction().begin();
	// em.persist(image);
	// em.getTransaction().commit();
	// em.close();
	// return image;
	// }

//	public void insert() throws Exception {
//		EntityManager em = connection.getEntityManager();
//		Image image = new Image();
//	      byte[] bigArray = File.;
//
//	}

	// public static byte[] getImage(String p) {
	// Path path = Paths.get("inputProfilePics/gavin.JPG");
	// byte[] data = null;
	// try {
	// data = Files.readAllBytes(path);
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// return data;
	// }
	
	private static byte[] readFileToByteArray(File file){
	    FileInputStream fis = null;
	    // Creating a byte array using the length of the file
	    // file.length returns long which is cast to int
	    byte[] bArray = new byte[(int) file.length()];
	    try{
	      fis = new FileInputStream(file);
	      fis.read(bArray);
	      fis.close();                   
	    }catch(IOException ioExp){
	      ioExp.printStackTrace();
	    }
	    return bArray;
	  }
}
