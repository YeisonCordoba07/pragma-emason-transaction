package com.transaction.pragma.emason.domain.usecase;

import com.transaction.pragma.emason.domain.api.ISupplyService;
import com.transaction.pragma.emason.domain.model.Supply;
import com.transaction.pragma.emason.domain.spi.ISupplyPersistence;

public class SupplyUseCase implements ISupplyService {
    private final ISupplyPersistence iSupplyPersistence;



    public SupplyUseCase(ISupplyPersistence iSupplyPersistence) {
        this.iSupplyPersistence = iSupplyPersistence;
    }



    @Override
    public void increaseSupply(Supply supply) {
        iSupplyPersistence.increaseSupply(supply);
    }
}
