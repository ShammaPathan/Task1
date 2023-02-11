package com.cjc.join.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.join.dto.OrderResponse;
import com.cjc.join.model.Customer;
import com.cjc.join.serviceInter.ServiceInter;

@RestController
public class HomeController {

	@Autowired
	ServiceInter si;
	
	@PostMapping("/savedata")
	public void saveCustomer(@RequestBody Customer cust)
	{
		si.saveData(cust);
	}
	
	@GetMapping("/getData")
	public List<Customer> getData()
	{
		List<Customer>	list=si.findAll();
		
		return list;
	}
	
	@GetMapping("/findOrder")
	public List<OrderResponse> getJoinInfo1()
	{
		return si.getJoinInfo();
	}
	
	@GetMapping("/rightInfo")
	public List<OrderResponse> getJoinInfo2()
	{
		return si.getrightinfo();
	}
	
	@GetMapping("/leftInfo")
	public List<OrderResponse> getJoinInfo3()
	{
		return si.getleftinfo();
	}
}
