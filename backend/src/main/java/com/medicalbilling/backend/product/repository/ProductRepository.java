package com.medicalbilling.backend.product.repository;

import com.medicalbilling.backend.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
