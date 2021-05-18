package com.segieda.product.rest;

import com.segieda.credit.model.ProductDto;
import com.segieda.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
@Slf4j
@RequiredArgsConstructor
public class ProductRest {

    private final ProductService productService;

    @GetMapping(path = "/get")
    public List<ProductDto> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping(path = "/create")
    public void createProduct(@RequestBody ProductDto productDto) {
        productService.createProduct(productDto);
    }
}
