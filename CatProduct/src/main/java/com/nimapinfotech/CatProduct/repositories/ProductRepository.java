package com.nimapinfotech.CatProduct.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimapinfotech.CatProduct.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}

