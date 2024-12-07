package com.nimapinfotech.CatProduct.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nimapinfotech.CatProduct.dto.ProductDTO;

public interface ProductService {
	public ProductDTO createProduct(ProductDTO productDTO);
	public ProductDTO updateProduct(Long id, ProductDTO productDTO);
	public void deleteProduct(Long id);
	public ProductDTO getProductById(Long id);
    Page<ProductDTO> getAllProducts(Pageable pageable);
}
