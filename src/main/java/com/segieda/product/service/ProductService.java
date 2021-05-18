package com.segieda.product.service;

import com.segieda.credit.model.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();

    void createProduct(ProductDto productDto);
}
