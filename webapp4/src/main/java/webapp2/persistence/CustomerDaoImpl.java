package webapp2.persistence;



import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import webapp2.domain.Customer;


@Repository
public class CustomerDaoImpl implements ICustomerDao {
	 
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customer.setCreatedDate(new Date());
		sessionFactory.getCurrentSession().save(customer);

	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return  sessionFactory.getCurrentSession().createQuery("from Customer").list();
        
	}

}
