package com.fdmgroup.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.Landlord;
import com.fdmgroup.model.Property;
import com.fdmgroup.model.Tenant;
import com.fdmgroup.model.User;
import com.mysql.cj.Query;

public class PropertyDao {

	private DbConnection connection;

	public PropertyDao() {
		super();
		connection = DbConnection.getInstance();
	}

	// // Insert
	// public void insertProperty(String address, double size, double price,
	// Landlord owner, int bed,byte[] picture) {
	// EntityManager em = connection.getEntityManager();
	// Property p1 = new Property(address, size, price, owner, bed,picture);
	// em.getTransaction().begin();
	// em.persist(p1);
	// em.getTransaction().commit();
	// }

	public void insertProperty(Property property) {
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(property);
		em.getTransaction().commit();
	}

	// Retrieve

	public Property findProperty(String address) {
		EntityManager em = connection.getEntityManager();
		javax.persistence.Query q = em.createQuery("select u.propertyId from Property u where  u.address=?1")
				.setParameter(1, address);

		if (q.getResultList().size() == 0) {
			System.out.println("The  address does not exist.");
			return null;
		} else {
			int foundId = (int) q.getResultList().get(0);
			Property p = em.find(Property.class, foundId);
			return p;
		}
	}

//	// Update
//	public void updateProperty(String address, double size, double price, Landlord owner) {
//		EntityManager em = connection.getEntityManager();
//		javax.persistence.Query q = em.createQuery("select u.propertyId from Property u where  u.address=?1")
//				.setParameter(1, address);
//
//		if (q.getResultList().size() == 0) {
//			System.out.println("The address does not exist.");
//		} else {
//			int foundId = (int) q.getResultList().get(0);
//			Property p = em.find(Property.class, foundId);
//
//			em.getTransaction().begin();
//			p.setAddress(address);
//			p.setPrice(price);
//			p.setSize(size);
//			p.setOwner(owner);
//			em.getTransaction().commit();
//		}
//	}

	// Delete
	public void deleteProperty(String address) {
		EntityManager em = connection.getEntityManager();
		javax.persistence.Query q = em.createQuery("select u.propertyId from Property u where  u.address=?1")
				.setParameter(1, address);

		if (q.getResultList().size() == 0) {
			System.out.println("The address does not exist.");

		} else {
			int foundId = (int) q.getResultList().get(0);
			Property p = em.find(Property.class, foundId);
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
		}
	}

	
	
	public List<Property> filterProperty(double priceMin,double priceMax,  int bedroom, String type, String city) {
		EntityManager em = connection.getEntityManager();
		javax.persistence.Query q =
				em.createQuery("select p from Property p where  p.price >= ?1 AND p.price < ?2 AND p.bedroom=?3"
						+ " AND p.type=?4 AND p.city=?5 )");
		q.setParameter(1, priceMin);
		q.setParameter(2, priceMax);
		q.setParameter(3, bedroom);
		q.setParameter(4, type);
		q.setParameter(5, city);
		List<Property> properties=q.getResultList();
			
			return properties;
		}
	
}
