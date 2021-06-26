package com.project.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    @Test
    void TestModelClient() {

        Client client = new Client();

        client.setIdClient(10);
        client.setClientName("Victor");

        long expectedValue = 10;
        String expectedValue2 = "Victor";

        //Testing #1: null value on id
        assertNotNull(client.getIdClient());
        System.out.println("Value set:" + client.getIdClient());

        //Testing #1.1: null value on clientName
        assertNotNull(client.getClientName());
        System.out.println("Value set:" + client.getClientName());

        //Testing #2: check if returns the value expected on idClient
        assertEquals(expectedValue, client.getIdClient() );
        System.out.println("Testing #1 Value expected:" + expectedValue + "\nValue set: "+ client.getIdClient() );

        //Testing #2.1: check if returns the value expected on clientName
        assertEquals(expectedValue2, client.getClientName() );
        System.out.println("Testing #1 Value expected:" + expectedValue2 + "\nValue set: "+ client.getClientName() );

    }
}