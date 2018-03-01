package com.japexample.jpadb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class CustController {
	
	
	@RequestMapping(value = "/customers")
	public List<Customer> allCustomers(){
		return GetCustomers();
	}

	@Autowired
	CustomerRepository custRepository;
	
	@RequestMapping(value="/add")
	public void CustController1() {
		custRepository.save(new Customer("Rahul", "Pattar"));
		custRepository.save(new Customer("Shiva", "S"));
		custRepository.save(new Customer("Ajit", "A"));
		custRepository.save(new Customer("Yash", "Y"));
		custRepository.save(new Customer("Prachi", "Pattar"));
	}

	
	public List<Customer> GetCustomers(){
		List<Customer> listCustomer = new ArrayList();
			return (List<Customer>) custRepository.findAll();
	}
}
