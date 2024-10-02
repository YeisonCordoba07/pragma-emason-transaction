package com.transaction.pragma.emason.domain.usecase;

import com.transaction.pragma.emason.domain.model.Sale;
import com.transaction.pragma.emason.domain.model.Supply;
import com.transaction.pragma.emason.domain.spi.ISalePersistence;
import com.transaction.pragma.emason.domain.spi.ISupplyPersistence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class SupplyUseCaseTest {

    @Mock
    private ISupplyPersistence iSupplyPersistence;

    @Mock
    private ISalePersistence iSalePersistence;

    @InjectMocks
    private SupplyUseCase supplyUseCase;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }




    @Test
    void increaseSupply_WhenIsIncreaseSupplySuccessfully(){
        // Arrange
        Supply supply = new Supply(1, 5);

        when(iSupplyPersistence.getLastSupply()).thenReturn(supply);

        // Act
        supplyUseCase.increaseSupply(supply);

        // Assert
        verify(iSupplyPersistence).increaseSupply(supply);
        verify(iSupplyPersistence).getLastSupply();
        verify(iSalePersistence).createSale(any(Sale.class));

    }



    @Test
    void increaseSupply_WhenSupplyDoNotExist() {
        // Arrange
        Supply supply = new Supply();
        supply.setIdItem(1);
        supply.setQuantity(5);

        when(iSupplyPersistence.getLastSupply()).thenReturn(null);

        // Act
        supplyUseCase.increaseSupply(supply);

        // Assert
        verify(iSupplyPersistence).increaseSupply(supply);
        verify(iSupplyPersistence).getLastSupply();
        verify(iSalePersistence, never()).createSale(any(Sale.class));
    }

}