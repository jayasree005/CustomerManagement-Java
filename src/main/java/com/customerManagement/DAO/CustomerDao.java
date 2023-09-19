package com.customerManagement.DAO;

import java.util.List;

import com.customerManagement.pojo.Customer;

public interface CustomerDao 
{
   List<Customer> getAllStudents();

   void addCustomer(Customer customer);

   Customer getCustomerById(int id);

   void updateCustomer(Customer customer);

void deleteCustomer(int id);


}
