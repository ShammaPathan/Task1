package com.cjc.join.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include. )
public class OrderResponse {

	private String name;
	private String productname;
	private double price;
	public OrderResponse(String name, String productname) {
		super();
		this.name = name;
		this.productname = productname;
	}
	public OrderResponse(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	
	
}
//dto classes are used to transfer data only particular fields are taken 