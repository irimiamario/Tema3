package com.example.demoJPA.repository;

import com.example.demoJPA.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, String> {
    List<Products> findAllByCodeIn(List<String> productCodes);
}
