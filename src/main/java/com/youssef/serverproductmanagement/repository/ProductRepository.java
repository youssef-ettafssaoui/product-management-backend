package com.youssef.serverproductmanagement.repository;

import com.youssef.serverproductmanagement.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
