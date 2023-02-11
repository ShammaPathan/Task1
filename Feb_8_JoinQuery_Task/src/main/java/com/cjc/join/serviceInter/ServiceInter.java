package com.cjc.join.serviceInter;

import java.util.List;

import com.cjc.join.dto.OrderResponse;
import com.cjc.join.model.Customer;

public interface ServiceInter {

public	void saveData(Customer cust);

public List<Customer> findAll();

public List<OrderResponse> getJoinInfo();

public List<OrderResponse> getrightinfo();

public List<OrderResponse> getleftinfo();




}
