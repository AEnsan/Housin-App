package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

import com.fdmgroup.model.User;
import com.mysql.cj.Query;



public class UserDao {

	private DbConnection connection;

	public UserDao() {
		super();
		connection = DbConnection.getInstance();
	}

	public User create(User user) {
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		return user;
	}

	public void remove(String un) {
		// EntityManager em = connection.getEntityManager();
		// User foundUser = em.find(User.class, user.getId());
		// em.getTransaction().begin();
		// em.remove(foundUser);
		// em.getTransaction().commit();
		// em.close();

		EntityManager em = connection.getEntityManager();
		javax.persistence.Query query = em.createQuery("DELETE FROM User WHERE username =:uname");
		em.getTransaction().begin();
		query.setParameter("uname", un);
		query.executeUpdate();
		em.getTransaction().commit();
		em.close();

	}

	public void update(User user) {
		EntityManager em = connection.getEntityManager();
		User foundUser = em.find(User.class, user.getId());
		em.getTransaction().begin();
		if (user.getPassword() != null && user.getPassword().equals(""))
			foundUser.setPassword(user.getPassword());

		em.getTransaction().commit();
	}

	public User findByUsername(String username) {
		EntityManager em = connection.getEntityManager();
		TypedQuery<User> query = em.createNamedQuery("user.findByUsername", User.class);
		query.setParameter("uname", username);
		List<User> users = query.getResultList();
		em.close();

		if (users != null && users.size() == 1) {
			return users.get(0);
		}
		return null;
	}

	// public List<User> findByType(String type){
	// EntityManager em = connection.getEntityManager();
	// TypedQuery<User> query = em.createNamedQuery("user.findByType",
	// User.class);
	// query.setParameter("type", type);
	// List<User> users = query.getResultList();
	// em.close();
	// return users;
	// }

	public List<User> findAllUser() {
		EntityManager em = connection.getEntityManager();
		TypedQuery<User> query = em.createNamedQuery("user.findAllUser", User.class);
		List<User> users = query.getResultList();
		em.close();
		return users;
	}
	
	
}
