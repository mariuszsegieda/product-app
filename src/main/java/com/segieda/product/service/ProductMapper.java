package com.segieda.product.service;

import com.segieda.credit.model.ProductDto;
import com.segieda.product.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "creditId", target = "creditId")
    @Mapping(source = "productName", target = "productName")
    @Mapping(source = "value", target = "value")
    Product mapToEntity(ProductDto source);

    @Mapping(source = "creditId", target = "creditId")
    @Mapping(source = "productName", target = "productName")
    @Mapping(source = "value", target = "value")
    ProductDto mapToDto(Product source);
}
