package springmvc.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;

@Repository
public class UserDao {
     
	private HibernateTemplate hibernateTemplate;
	public int saveUser(User user) {
		int id=(Integer) this.hibernateTemplate.save(user);
		return id;
	}
}
