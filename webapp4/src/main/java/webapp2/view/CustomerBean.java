package webapp2.view;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

import webapp2.service.ICustomerService;
import webapp2.domain.Customer;



@ManagedBean(name="customerMB")
@SessionScoped
public class CustomerBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Ddependency Injection via Spring
	 ICustomerService customerService;
			
	 public String name;
	 public String address;
	 
	 
	//get all customer data from database
		public List<Customer> getCustomerList(){
			return customerService.findAllCustomer();
		}
		
		
		//add a new customer data into database
		public String addCustomer(){
	 
			Customer cust = new Customer();
			cust.setName(getName());
			cust.setAddress(getAddress());
	 
			customerService.addCustomer(cust);
	 
			clearForm();
	 
			return "";
		}
		
		
		//clear form values
		private void clearForm(){
			setName("");
			setAddress("");
		}
		
	 
	/*************************** setters getters *****/
	 
	public ICustomerService getCustomerService() {
		return customerService;
	}
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	 
	 

}
