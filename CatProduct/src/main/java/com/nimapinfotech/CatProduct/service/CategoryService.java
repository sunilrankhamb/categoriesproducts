package com.nimapinfotech.CatProduct.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nimapinfotech.CatProduct.dto.CategoryDTO;

public interface CategoryService {
	public CategoryDTO createCategory(CategoryDTO categoryDTO);
	public CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO);
   public void deleteCategory(Long id);
    public CategoryDTO getCategoryById(Long id);
    Page<CategoryDTO> getAllCategories(Pageable pageable);
    
}