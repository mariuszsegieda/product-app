package com.segieda.product.service;

import com.segieda.credit.model.CustomerDto;
import com.segieda.credit.model.ProductDto;
import com.segieda.product.model.Product;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class ProductMapperTest {

    ProductMapper productMapper = Mappers.getMapper(ProductMapper.class);

    @Test
    void mapToEntity() {
        // given
        ProductDto productDto = ProductDto.builder()
                .creditId(1L)
                .productName("productName")
                .value(1)
                .build();
        // when
        Product product = productMapper.mapToEntity(productDto);
        // then
        SoftAssertions.assertSoftly(s -> {
            s.assertThat(product.getCreditId()).isEqualTo(productDto.getCreditId());
        });
    }

    @Test
    void mapToDto() {
        // given
        Product product = new Product();
        product.setCreditId(1L);
        product.setProductName("productName");
        product.setValue(1);
        // when
        ProductDto productDto = productMapper.mapToDto(product);
        // then
        SoftAssertions.assertSoftly(s -> {
            s.assertThat(productDto.getCreditId()).isEqualTo(product.getCreditId());
            s.assertThat(productDto.getProductName()).isEqualTo(product.getProductName());
            s.assertThat(productDto.getValue()).isEqualTo(product.getValue());
        });
    }
}