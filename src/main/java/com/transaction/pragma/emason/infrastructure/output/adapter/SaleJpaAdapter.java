package com.transaction.pragma.emason.infrastructure.output.adapter;

import com.transaction.pragma.emason.domain.model.Sale;
import com.transaction.pragma.emason.domain.spi.ISalePersistence;
import com.transaction.pragma.emason.infrastructure.output.mapper.ISaleEntityMapper;
import com.transaction.pragma.emason.infrastructure.output.repository.ISaleRepository;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class SaleJpaAdapter implements ISalePersistence {

    private final ISaleRepository iSaleRepository;
    private final ISaleEntityMapper iSaleEntityMapper;



    @Override
    public void createSale(Sale sale) {
        iSaleRepository.save(iSaleEntityMapper.toEntity(sale));
    }
}
