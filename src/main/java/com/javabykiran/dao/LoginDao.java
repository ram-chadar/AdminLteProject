package com.javabykiran.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.model.User;

@Repository
public class LoginDao {

	@Autowired
	SessionFactory sessionFactory;

	public User checkUser(User user) {
		Session session = sessionFactory.openSession();
		User dbUser = null;

		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", user.getUsername()));

		List<User> list = criteria.list();
		if (!list.isEmpty()) {
			dbUser = list.get(0);

			if (dbUser.getPassword().equals(user.getPassword())) {
				return dbUser;
			} else {
				return null;
			}

		} else {
			return null;
		}

//		Query q = session.createQuery("FROM User U WHERE U.email = :email and U.password = :password");
//
//		q.setParameter("email", user.getEmail());
//
//		q.setParameter("password", user.getPassword());
//
//		List<User> list = q.list();
//		return user;

	}

	public boolean saveUser(User user) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		int result = (Integer) session.save(user);

		tx.commit();
		if (result > 0)

			return true;

		return false;

	}
}
