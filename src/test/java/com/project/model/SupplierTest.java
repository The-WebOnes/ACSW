package com.project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SupplierTest {

    @Test
    void TestModelSupplier() {

        Supplier supplier = new Supplier();

        supplier.setIdSupplier(10);
        supplier.setSupplierName("Eberth");

        long expectedValue = 10;
        String expectedValue2 = "Eberth";

        //Testing #1: null value on idSupplier
        assertNotNull(supplier.getIdSupplier());
        System.out.println("Value set:" + supplier.getIdSupplier());

        //Testing #1.1: null value on supplierName
        assertNotNull(supplier.getSupplierName());
        System.out.println("Value set:" + supplier.getSupplierName());

        //Testing #2: check if returns the value expected on idSupplier
        assertEquals(expectedValue, supplier.getIdSupplier() );
        System.out.println("Value expected:" + expectedValue + "\nValue set: "+ supplier.getIdSupplier() );

        //Testing #2.1: check if returns the value expected on supplierName
        assertEquals(expectedValue2, supplier.getSupplierName() );
        System.out.println("Value expected:" + expectedValue2 + "\nValue set: "+ supplier.getSupplierName() );
    }
}