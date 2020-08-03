package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
// @SequenceGenerator(name="seq", initialValue=10000, allocationSize=20)
public class Property {
	@Id
	// @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyId;

	private String address;
	private double price;
	@Column(name = "bedroom")
	private int bedroom;
	private String type;
	private String city;
	@ManyToOne
	@JoinColumn(name = "FK_Owner")
	private Landlord owner;

	@OneToMany(
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private List<Image> images= new ArrayList<>();

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Property(int propertyId, String address, double price, int bedroom, String type, String city, Landlord owner,
			List<Image> images) {
		super();
		this.propertyId = propertyId;
		this.address = address;
		this.price = price;
		this.bedroom = bedroom;
		this.type = type;
		this.city = city;
		this.owner = owner;
		this.images = images;
	}

	public Property(String address, double price, int bedroom, String type, String city, Landlord owner,
			List<Image> images) {
		super();
		this.address = address;
		this.price = price;
		this.bedroom = bedroom;
		this.type = type;
		this.city = city;
		this.owner = owner;
		this.images = images;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBedroom() {
		return bedroom;
	}

	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Landlord getOwner() {
		return owner;
	}

	public void setOwner(Landlord owner) {
		this.owner = owner;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", address=" + address + ", price=" + price + ", bedroom="
				+ bedroom + ", type=" + type + ", city=" + city +  "]";
	}

	
}
