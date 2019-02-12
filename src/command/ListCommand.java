package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerDTO;
import proxy.Proxy;
import service.CustomerServiceImpl;

public class ListCommand extends Command{
	
	public ListCommand(HttpServletRequest request,HttpServletResponse response) {
		super(request, response);
		List<CustomerDTO> list = CustomerServiceImpl
								.getInstance()
								.bringCustomerList(new Proxy().getPage());
		System.out.println("리스트커맨더안에 Syso::::::::::::::::"+list);
		request.setAttribute("list", list);
	}
	

}
	
	
	


