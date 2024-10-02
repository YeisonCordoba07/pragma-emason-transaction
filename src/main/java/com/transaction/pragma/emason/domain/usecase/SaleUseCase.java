package com.transaction.pragma.emason.domain.usecase;

import com.transaction.pragma.emason.domain.api.ISaleService;
import com.transaction.pragma.emason.domain.model.Sale;
import com.transaction.pragma.emason.domain.spi.ISalePersistence;

public class SaleUseCase implements ISaleService {

    private final ISalePersistence iSalePersistence;

    public SaleUseCase(ISalePersistence iSalePersistence) {
        this.iSalePersistence = iSalePersistence;
    }

    @Override
    public void createSale(Sale sale) {
        iSalePersistence.createSale(sale);
    }
}
