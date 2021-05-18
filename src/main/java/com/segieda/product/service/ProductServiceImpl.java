package com.segieda.product.service;

import com.segieda.credit.model.ProductDto;
import com.segieda.product.model.Product;
import com.segieda.product.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream().map(productMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public void createProduct(ProductDto productDto) {
        Product product = productMapper.mapToEntity(productDto);
        productRepository.save(product);
    }
}
