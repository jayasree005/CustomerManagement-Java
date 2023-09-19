package com.customerManagement.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.customerManagement.pojo.Customer;

@Repository
public class CustomerDaoImp implements CustomerDao
{
	@Autowired
	JdbcTemplate jdbctemp;

	@Override
	public List<Customer> getAllStudents() 
	{
		String Query = "SELECT * FROM CUSTOMER";
	  	List<Customer> cuslist = jdbctemp.query(Query, new DAOHelper());
	  	return cuslist;
	}

	@Override
	public void addCustomer(Customer customer) 
	{
	  	String Query = "insert into customer(name, phonenumber, numberofsarees, givendate, cost, deliverystatus, Cover) values(?,?,?,?,?,?,?)";
	  	Object[] args = {customer.getName(),customer.getPhonenumber(),customer.getNumberofsarees(),customer.getGivendate(),customer.getCost(),customer.getDeliverystatus(),customer.getCover()};
	  	jdbctemp.update(Query, args);
	}

	@Override
	public Customer getCustomerById(int id) 
	{
	  String Query = "Select * from customer where cid=?";
	  Customer c = jdbctemp.queryForObject(Query, new DAOHelper(), id);
	  return c;
	  
	}

	@Override
	public void updateCustomer(Customer customer) 
	{
	  String Query = "UPDATE CUSTOMER SET name=?, phonenumber=?, numberofsarees=?, givendate=?, cost=?, deliverystatus=?, Cover=? WHERE CID=?";
	  Object[] args = {customer.getName(),customer.getPhonenumber(),customer.getNumberofsarees(),customer.getGivendate(),customer.getCost(),customer.getDeliverystatus(),customer.getCover(),customer.getCid()};
	  jdbctemp.update(Query, args);
 	}

	@Override
	public void deleteCustomer(int id)
	{
	  String Query = "DELETE FROM CUSTOMER WHERE CID=?";
	  jdbctemp.update(Query, id);
	}
  
}
