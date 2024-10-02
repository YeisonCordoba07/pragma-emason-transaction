package com.transaction.pragma.emason.domain.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaleTest {



    @Test
    void testNoArgsConstructor() {
        // Act
        Sale sale = new Sale();

        // Assert
        assertNull(sale.getId());
        assertNull(sale.getIdSupply());
    }

    @Test
    void testAllArgsConstructor() {
        // Act
        Sale sale = new Sale(100);

        // Assert
        assertNull(sale.getId());
        assertEquals(100, sale.getIdSupply());
    }

    @Test
    void testSetAndGetId() {
        // Arrange
        Sale sale = new Sale();

        // Act
        sale.setId(1);

        // Assert
        assertEquals(1, sale.getId());
    }

    @Test
    void testSetAndGetIdSupply() {
        // Arrange
        Sale sale = new Sale();

        // Act
        sale.setIdSupply(200);

        // Assert
        assertEquals(200, sale.getIdSupply());
    }
}