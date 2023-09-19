package com.customerManagement.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.customerManagement.pojo.Customer;

public class DAOHelper implements RowMapper<Customer>
{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Customer customer = new Customer();
		customer.setCid(rs.getInt("cid"));
		customer.setCost(rs.getInt("cost"));
		customer.setCover(rs.getString("Cover"));
		customer.setDeliverystatus(rs.getString("deliverystatus"));
		customer.setGivendate(rs.getString("givendate"));
		customer.setName(rs.getString("name"));
	    customer.setNumberofsarees(rs.getInt("numberofsarees"));
	    customer.setPhonenumber(rs.getLong("phonenumber"));
		return customer;
	}

}
