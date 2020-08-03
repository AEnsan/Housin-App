package com.fdmgroup.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.Tenant;
import com.fdmgroup.model.User;
import com.mysql.cj.Query;

public class TenantDao {

	private DbConnection connection;

	public TenantDao() {
		super();
		connection = DbConnection.getInstance();
	}

	public Tenant create(Tenant tenant) {
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(tenant);
		em.getTransaction().commit();
		em.close();
		return tenant;
	}

	public void remove(Tenant tenant) {
		EntityManager em = connection.getEntityManager();
		User foundUser = em.find(User.class, tenant.getId());
		em.getTransaction().begin();
		em.remove(foundUser);
		em.getTransaction().commit();
		em.close();

	}

	public List<User> findAllTenants() {
		EntityManager em = connection.getEntityManager();
		javax.persistence.Query query = em.createQuery("select u from User u where Type(u) = Tenant");
		//query.setParameter("type", "tenant");
		List<User> tenants = query.getResultList();
		em.close();

		return tenants;
	}

}
