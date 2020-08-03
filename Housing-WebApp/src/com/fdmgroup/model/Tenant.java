package com.fdmgroup.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue (value = "Tenant")
public class Tenant extends User{
    @Enumerated(EnumType.STRING)
	private Citizenship status;
	public Tenant() {
		super();
	}
	public Tenant(Citizenship status) {
		super();
		this.status = status;
	}
	public Citizenship getStatus() {
		return status;
	}
	public void setStatus(Citizenship status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Tenant ["+ super.toString()+ "status=" + status + "]";
	}
	
	


}
