package com.iuminov.thymeleaf_crud.repository;

import com.iuminov.thymeleaf_crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
