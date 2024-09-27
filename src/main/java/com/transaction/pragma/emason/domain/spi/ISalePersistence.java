package com.transaction.pragma.emason.domain.spi;

import com.transaction.pragma.emason.domain.model.Sale;

public interface ISalePersistence {
    void createSale(Sale sale);
}
