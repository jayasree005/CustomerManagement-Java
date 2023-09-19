package com.customerManagement.Service;

import java.util.List;

import com.customerManagement.pojo.Customer;

public interface serviceInterface 
{
	void addCustomer(Customer customer);
	List<Customer> getAllCustomers();
	Customer getCustomerById(int id) ;
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);
 
}
