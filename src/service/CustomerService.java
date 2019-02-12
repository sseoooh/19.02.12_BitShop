package service;

import java.util.List;

import domain.CustomerDTO;
import proxy.Pagination;


public interface CustomerService {
	//C
	public void registCustomer(CustomerDTO emp);
	//R
	public List<CustomerDTO> bringCustomerList(Pagination page);
	public List<CustomerDTO> retrieveCustomerByName(String SearchWord);
	public CustomerDTO retrieveCustomer(CustomerDTO cus);
	public int countCustomer();
	public boolean existsCustomer(String searchWord);
	//U
	public void modifyCustomer(CustomerDTO emp);
	//D
	public void removeCustomer(CustomerDTO emp);
}
