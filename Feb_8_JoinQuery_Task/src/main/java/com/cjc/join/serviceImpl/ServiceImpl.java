package com.cjc.join.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.join.RepositoryInter.CustomerRepository;
import com.cjc.join.RepositoryInter.ProductRepository;
import com.cjc.join.dto.OrderResponse;
import com.cjc.join.model.Customer;
import com.cjc.join.serviceInter.ServiceInter;

@Service
public class ServiceImpl implements ServiceInter {

	@Autowired
	ProductRepository pr;
	
	@Autowired
	CustomerRepository cr;

	@Override
	public void saveData(Customer cust) {
		cr.save(cust);
		
	}

	@Override
	public List<Customer> findAll() {
		
		return (List<Customer>) cr.findAll();
	}

	@Override
	public List<OrderResponse> getJoinInfo() {
		
		return cr.getJoinInfo();
	}

	@Override
	public List<OrderResponse> getrightinfo() {
	
		return cr.getRightInfo();
	}

	@Override
	public List<OrderResponse> getleftinfo() {
		
		return cr.getLeftInfo();
	}

	

	
	
}
