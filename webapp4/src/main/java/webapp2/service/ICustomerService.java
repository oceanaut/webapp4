package webapp2.service;

import java.util.List;

import webapp2.domain.Customer;

public interface ICustomerService {
	
	void addCustomer(Customer customer);
	 
	List<Customer> findAllCustomer();

}
