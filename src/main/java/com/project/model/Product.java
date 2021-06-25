package com.project.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private long idProduct;

    @NotEmpty
    @Column(name = "productname")
    private String productName;

    @NotEmpty
    @Column(name = "productbrand")
    private String productBrand;

    @NotNull
    @Column(name = "price")
    private Float productPrice;

}
