package com.transaction.pragma.emason.domain.usecase;

import com.transaction.pragma.emason.domain.model.Sale;
import com.transaction.pragma.emason.domain.spi.ISalePersistence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class SaleUseCaseTest {

    @Mock
    private ISalePersistence iSalePersistence;

    @InjectMocks
    private SaleUseCase saleUseCase;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }



    @Test
    void createSale_callsCreateSaleInPersistence() {
        // Arrange
        Sale sale = new Sale(1);

        // Act
        saleUseCase.createSale(sale);

        // Assert
        verify(iSalePersistence).createSale(sale);
    }
}