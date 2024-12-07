package com.nimapinfotech.CatProduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimapinfotech.CatProduct.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {}
