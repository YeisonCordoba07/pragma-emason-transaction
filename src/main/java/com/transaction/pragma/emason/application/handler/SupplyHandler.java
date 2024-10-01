package com.transaction.pragma.emason.application.handler;


import com.transaction.pragma.emason.application.dto.SupplyRequestDTO;
import com.transaction.pragma.emason.application.mapper.ISupplyRequestMapper;
import com.transaction.pragma.emason.domain.api.ISupplyService;
import com.transaction.pragma.emason.domain.model.Supply;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplyHandler implements ISupplyHandler {

    private final ISupplyService iSupplyService;
    private final ISupplyRequestMapper iSupplyRequestMapper;
    private final IStockFeignClient iStockFeignClient;



    @Override
    public void increaseSupply(SupplyRequestDTO supplyRequestDTO) {

        Supply supply = iSupplyRequestMapper.toSupply(supplyRequestDTO);
        iSupplyService.increaseSupply(supply);
        System.out.println("############# Suply: "+ supply.getIdItem() + supply.getQuantity());
        iStockFeignClient.increaseItem(supply.getIdItem(), supply.getQuantity());
    }

}
