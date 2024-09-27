package com.transaction.pragma.emason.application.handler;


import com.transaction.pragma.emason.application.dto.SupplyRequestDTO;
import com.transaction.pragma.emason.application.mapper.ISupplyRequestMapper;
import com.transaction.pragma.emason.domain.api.ISupplyService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplyHandler implements ISupplyHandler {

    private final ISupplyService iSupplyService;
    private final ISupplyRequestMapper iSupplyRequestMapper;



    @Override
    public void increaseSupply(SupplyRequestDTO supplyRequestDTO) {
        iSupplyService.increaseSupply(iSupplyRequestMapper.toSupply(supplyRequestDTO));
    }

}
