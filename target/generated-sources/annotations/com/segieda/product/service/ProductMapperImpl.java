package com.segieda.product.service;

import com.segieda.credit.model.ProductDto;
import com.segieda.credit.model.ProductDto.ProductDtoBuilder;
import com.segieda.product.model.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-18T10:58:23+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product mapToEntity(ProductDto source) {
        if ( source == null ) {
            return null;
        }

        Product product = new Product();

        product.setCreditId( source.getCreditId() );
        product.setProductName( source.getProductName() );
        product.setValue( source.getValue() );

        return product;
    }

    @Override
    public ProductDto mapToDto(Product source) {
        if ( source == null ) {
            return null;
        }

        ProductDtoBuilder productDto = ProductDto.builder();

        productDto.creditId( source.getCreditId() );
        productDto.productName( source.getProductName() );
        productDto.value( source.getValue() );

        return productDto.build();
    }
}
