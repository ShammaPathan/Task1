package com.cjc.join.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {

	@Id
	private int cid;
	private String name;
	private String email;
	private String gender;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> pro;
}
