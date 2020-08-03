package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
//@DiscriminatorColumn(name="owner_type", discriminatorType=DiscriminatorType.STRING, length=20)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value = "Landlord")
public class Landlord extends User {


	private int phoneNumber;
	private String license_id;
	private String companay;
	
//	@Transient

@OneToMany(mappedBy="owner")
List<Property> properties = new ArrayList<Property>();

public Landlord() {
	super();
	// TODO Auto-generated constructor stub
}

public Landlord(int id, String firstName, String lastName, String username, String password, String email) {
	super(id, firstName, lastName, username, password, email);
	// TODO Auto-generated constructor stub
}

public Landlord(String firstName, String lastName, String username, String password, String email) {
	super(firstName, lastName, username, password, email);
	// TODO Auto-generated constructor stub
}

public int getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getLicense_id() {
	return license_id;
}

public void setLicense_id(String license_id) {
	this.license_id = license_id;
}

public String getCompanay() {
	return companay;
}

public void setCompanay(String companay) {
	this.companay = companay;
}

public List<Property> getProperties() {
	return properties;
}

public void setProperties(List<Property> properties) {
	this.properties = properties;
}



}
