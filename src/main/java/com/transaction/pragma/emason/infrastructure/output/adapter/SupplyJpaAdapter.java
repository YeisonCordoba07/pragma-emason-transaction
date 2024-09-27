package com.transaction.pragma.emason.infrastructure.output.adapter;


import com.transaction.pragma.emason.domain.model.Supply;
import com.transaction.pragma.emason.domain.spi.ISupplyPersistence;
import com.transaction.pragma.emason.infrastructure.output.mapper.ISupplyEntityMapper;
import com.transaction.pragma.emason.infrastructure.output.repository.ISupplyRepository;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class SupplyJpaAdapter implements ISupplyPersistence {

    private final ISupplyRepository iSupplyRepository;
    private final ISupplyEntityMapper iSupplyEntityMapper;


    @Override
    public void increaseSupply(Supply supply) {
        iSupplyRepository.save(iSupplyEntityMapper.toEntity(supply));
    }
}
