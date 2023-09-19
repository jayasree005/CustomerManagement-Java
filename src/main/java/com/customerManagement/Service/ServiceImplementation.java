package com.customerManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerManagement.DAO.CustomerDao;
import com.customerManagement.pojo.Customer;

@Service
public class ServiceImplementation implements serviceInterface
{
	@Autowired
	CustomerDao cusdao;

	@Override
	public void addCustomer(Customer customer)
	{
		cusdao.addCustomer(customer);
		
	}

	@Override
	public List<Customer> getAllCustomers() 
	{
		List<Customer> cuslist = cusdao.getAllStudents();
		return cuslist;
	}

	@Override
	public Customer getCustomerById(int id) 
	{
	  Customer cus = cusdao.getCustomerById(id);
	return cus;	
	}

	@Override
	public void updateCustomer(Customer customer) 
	{
	  cusdao.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(int id) 
	{
	  cusdao.deleteCustomer(id);
	}

}