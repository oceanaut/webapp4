package webapp2.persistence;

import java.util.List;

import webapp2.domain.Customer;

public interface ICustomerDao {
	
	void addCustomer(Customer customer);
	 
	List<Customer> findAllCustomer();

}
