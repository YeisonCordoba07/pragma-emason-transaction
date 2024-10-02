package com.transaction.pragma.emason.domain.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupplyTest {




    @Test
    void testNoArgsConstructor() {
        // Act
        Supply supply = new Supply();

        // Assert
        assertNull(supply.getId());
        assertNull(supply.getIdItem());
        assertNull(supply.getQuantity());
    }

    @Test
    void testAllArgsConstructor() {
        // Act
        Supply supply = new Supply(101, 50);

        // Assert
        assertNull(supply.getId());
        assertEquals(101, supply.getIdItem());
        assertEquals(50, supply.getQuantity());
    }

    @Test
    void testSetAndGetId() {
        // Arrange
        Supply supply = new Supply();

        // Act
        supply.setId(1);

        // Assert
        assertEquals(1, supply.getId());
    }

    @Test
    void testSetAndGetIdItem() {
        // Arrange
        Supply supply = new Supply();

        // Act
        supply.setIdItem(200);

        // Assert
        assertEquals(200, supply.getIdItem());
    }

    @Test
    void testSetAndGetQuantity() {
        // Arrange
        Supply supply = new Supply();

        // Act
        supply.setQuantity(300);

        // Assert
        assertEquals(300, supply.getQuantity());
    }
}