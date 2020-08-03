package com.fdmgroup.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.mysql.cj.jdbc.Blob;

@Entity
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int image_id;
	private String image_name;

//	@ManyToOne	
//	@JoinColumn(name = "FK_Pr_ID")
//	private Property property;

	@Lob
	@Column(length = 100000000)
	private byte[] picture;
	
	public Image() {
		super();
	}

	public Image(int image_id,  byte[] picture, String name) {
		super();
		this.image_id = image_id;

		this.picture = picture;
		this.image_name=name;
	}

//	public Image(Property property, byte[] picture, String name) {
//		super();
//		this.property = property;
//		this.picture = picture;
//		this.image_name=name;
//	}
	public Image( byte[] picture, String name) {
		super();
		
		this.picture = picture;
		this.image_name=name;
	}

	public int getImage_id() {
		return image_id;
	}

	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
//
//	public Property getProperty() {
//		return property;
//	}
//
//	public void setProperty(Property property) {
//		this.property = property;
//	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getImage_name() {
		return image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	
	public static byte[] getImage(String p) {
	Path path = Paths.get(p);
	byte[] data = null;
	try {
		data = Files.readAllBytes(path);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return data;
}

	
}
