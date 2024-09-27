package com.transaction.pragma.emason.domain.spi;


import com.transaction.pragma.emason.domain.model.Supply;

public interface ISupplyPersistence {
    void increaseSupply(Supply supply);

    Supply getLastSupply();
}
