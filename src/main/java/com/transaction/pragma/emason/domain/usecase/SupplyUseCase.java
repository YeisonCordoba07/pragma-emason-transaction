package com.transaction.pragma.emason.domain.usecase;

import com.transaction.pragma.emason.domain.api.ISupplyService;
import com.transaction.pragma.emason.domain.model.Sale;
import com.transaction.pragma.emason.domain.model.Supply;
import com.transaction.pragma.emason.domain.spi.ISalePersistence;
import com.transaction.pragma.emason.domain.spi.ISupplyPersistence;



public class SupplyUseCase implements ISupplyService {
    private final ISupplyPersistence iSupplyPersistence;
    private final ISalePersistence iSalePersistence;



    public SupplyUseCase(ISupplyPersistence iSupplyPersistence, ISalePersistence iSalePersistence) {
        this.iSupplyPersistence = iSupplyPersistence;
        this.iSalePersistence = iSalePersistence;
    }



    @Override
    public void increaseSupply(Supply supply) {

        iSupplyPersistence.increaseSupply(supply);

        Supply supplyDataBase = iSupplyPersistence.getLastSupply();

        if(supplyDataBase != null){
            Sale sale = new Sale();
            sale.setIdSupply(supplyDataBase.getId());

            iSalePersistence.createSale(sale);
        }

    }

}
