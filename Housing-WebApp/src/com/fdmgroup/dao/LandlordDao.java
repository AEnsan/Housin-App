package com.fdmgroup.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.Landlord;
import com.fdmgroup.model.Tenant;
import com.fdmgroup.model.User;
import com.mysql.cj.Query;

public class LandlordDao {

	private DbConnection connection;

	public LandlordDao() {
		super();
		connection = DbConnection.getInstance();
	}

	public Landlord create(Landlord landlord) {
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(landlord);
		em.getTransaction().commit();
		em.close();
		return landlord;
	}

	public void remove(Landlord landlord) {
		EntityManager em = connection.getEntityManager();
		User foundUser = em.find(User.class, landlord.getId());
		em.getTransaction().begin();
		em.remove(foundUser);
		em.getTransaction().commit();
		em.close();

	}

	public List<User> findAllLandlords() {
		EntityManager em = connection.getEntityManager();
		javax.persistence.Query query = em.createQuery("select u from User u where Type(u) = Landlord");
		//query.setParameter("type", "tenant");
		List<User> tenants = query.getResultList();
		em.close();

		return tenants;
	}

}
