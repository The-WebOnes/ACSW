package com.project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTest {

    @Test
    void TestModelProduct() {

        Product product = new Product();

        product.setIdProduct(20);
        product.setProductName("Cheetos");

        long expectedValue = 20;
        String expectedValue2 = "Cheetos";

        //Testing #1: null value on idProduct
        assertNotNull(product.getIdProduct());
        System.out.println("Value set:" + product.getIdProduct());

        //Testing #1.1: null value on productName
        assertNotNull(product.getProductName());
        System.out.println("Value set:" + product.getProductName());

        //Testing #2: check if returns the value expected on idProduct
        assertEquals(expectedValue, product.getIdProduct() );
        System.out.println("Value expected:" + expectedValue + "\nValue set: "+ product.getIdProduct() );

        //Testing #2.1: check if returns the value expected on productName
        assertEquals(expectedValue2, product.getProductName() );
        System.out.println("Value expected:" + expectedValue2 + "\nValue set: "+ product.getProductName() );
    }
}