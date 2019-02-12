package service;

import java.util.ArrayList;
import java.util.List;

import dao.CustomerDAOImpl;
import domain.CustomerDTO;
import proxy.Pagination;

public class CustomerServiceImpl implements CustomerService{
	
	private static CustomerServiceImpl instance = new CustomerServiceImpl();
	CustomerDAOImpl dao;
	private CustomerServiceImpl() {
		dao = CustomerDAOImpl.getInstance();
	}
	public static CustomerServiceImpl getInstance() {return instance;}

	@Override
	public void registCustomer(CustomerDTO cus) {
		dao.insertCustomer(cus);
	}

	@Override
	public List<CustomerDTO> bringCustomerList(Pagination page) {
		return dao.selectCustomerList(page);
	}

	@Override
	public List<CustomerDTO> retrieveCustomerByName(String SearchWord) {
		List<CustomerDTO> list = new ArrayList<>();
		return list;
	}

	@Override
	public CustomerDTO retrieveCustomer(CustomerDTO cus) {
		
		return dao.selectCustomer(cus);
	}

	@Override
	public int countCustomer() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existsCustomer(String searchWord) {
		boolean ok = false;
		return ok;
	}

	@Override
	public void modifyCustomer(CustomerDTO emp) {
		
	}

	@Override
	public void removeCustomer(CustomerDTO emp) {
		
	}

}
