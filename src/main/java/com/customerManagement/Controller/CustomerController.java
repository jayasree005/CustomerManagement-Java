package com.customerManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.customerManagement.Service.ServiceImplementation;
import com.customerManagement.pojo.Customer;

@Controller
public class CustomerController 
{
	@Autowired
	ServiceImplementation service;
	
	 @GetMapping("/showcustomers")
	 public String ShowCustomers(Model model)
	 {
		 List<Customer> list=service.getAllCustomers();
		 for(Customer c : list)
		 {
			 System.out.println(c);
		 }
		 model.addAttribute("customer", list);
		 return "displayCustomers";
	 }
	 
	 @GetMapping("/showAddCustomer")
	 public String ShowAddCustomer(Model model)
	 {
		 Customer customer = new Customer();
		 model.addAttribute("customer",customer);
		return "AddCustomer"; 
	 }
	 
	 @PostMapping("/addCustomer")
	 public String AddCustomer(Customer customer)
	 {
		 service.addCustomer(customer);
		 return "redirect:/showcustomers";
	 }
	 
	 @GetMapping("/showUpdateCustomer")
	 public String showUpdateCustomer(@RequestParam("userid")int id,Model model)
	 {
		Customer c =  service.getCustomerById(id);
		
		model.addAttribute("customer", c);
		 
		 return "UpdateINFO";
	 }
	 
	 @PostMapping("/updateCustomer")
	 public String updateCustomer(Customer customer)
	 {
		 service.updateCustomer(customer);
		return "redirect:/showcustomers";
	 }
	
	 
	 @GetMapping("/deleteCustomer")
	 public String deleteCustomer(@RequestParam("userid")int id)
	 {
		 service.deleteCustomer(id);
		return "redirect:/showcustomers";
	 }
	
}
