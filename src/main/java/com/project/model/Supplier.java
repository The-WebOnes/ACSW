package com.project.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "caterer")
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_caterer")
    private long idSupplier;

    @NotEmpty
    @Column(name = "caterername")
    private String supplierName;

    @NotEmpty
    @Column(name = "catererlastname")
    private String supplierLastName;

    @Column(name = "catererphone")
    private String supplierPhone;

    @NotEmpty
    @Email
    @Column(name = "catereremail")
    private String supplierEmail;

    @NotEmpty
    @Column(name = "catererbussiness")
    private String supplierBusiness;
}
