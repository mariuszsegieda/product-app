package com.segieda.product.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    private Long creditId;
    @Column
    private String productName;
    @Column
    private int value;
}
