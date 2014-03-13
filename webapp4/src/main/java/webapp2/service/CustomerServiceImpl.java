package webapp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import webapp2.domain.Customer;
import webapp2.persistence.ICustomerDao;

@Service("CustomerService")
@Transactional(readOnly = true)
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDao customerDao;
	
	@Transactional(readOnly = false)
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(customer); 

	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.findAllCustomer();
	}

}
