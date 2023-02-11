package com.cjc.join.RepositoryInter;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cjc.join.dto.OrderResponse;
import com.cjc.join.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("SELECT new com.cjc.join.dto.OrderResponse(c.name ,p.productname ,p.price)"+" FROM Customer c JOIN c.pro p")//pro is one to many reference
	public List<OrderResponse> getJoinInfo();

	
	@Query("SELECT new com.cjc.join.dto.OrderResponse(c.name ,p.productname ,p.price)"+" FROM Customer c RIGHT JOIN c.pro p")
	public List<OrderResponse> getRightInfo();


	@Query("SELECT new com.cjc.join.dto.OrderResponse(c.name ,p.productname )"+"FROM Customer c LEFT JOIN c.pro p")
	public List<OrderResponse> getLeftInfo();

	

}
