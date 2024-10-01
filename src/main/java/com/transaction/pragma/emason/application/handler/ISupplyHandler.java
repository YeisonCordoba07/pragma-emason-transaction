package com.transaction.pragma.emason.application.handler;

import com.transaction.pragma.emason.application.dto.SupplyRequestDTO;

public interface ISupplyHandler {
    void increaseSupply(SupplyRequestDTO supplyRequestDTO, String token);
}
