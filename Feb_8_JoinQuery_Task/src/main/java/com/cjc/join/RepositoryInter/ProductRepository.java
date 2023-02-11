package com.cjc.join.RepositoryInter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.join.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
