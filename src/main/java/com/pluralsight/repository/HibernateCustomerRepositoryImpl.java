package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll(){
		System.out.println("dbUsername is : " + dbUsername);
		List<Customer> customers = new ArrayList<>();
		Customer one = new Customer();
		one.setFirstname("udit");
		one.setLastname("agrawal");
		Customer two = new Customer();
		two.setFirstname("bryan");
		two.setLastname("hansen");
		customers.add(one);
		customers.add(two);
		return customers;
	}
}
