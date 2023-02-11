package com.cjc.join.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

	@Id
	private int pid;
	private String productname;
	private int quantity;
	private double price;
	
}
