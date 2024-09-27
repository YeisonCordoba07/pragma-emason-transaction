package com.transaction.pragma.emason.infrastructure.configuration;



import com.transaction.pragma.emason.domain.api.ISupplyService;
import com.transaction.pragma.emason.domain.spi.ISalePersistence;
import com.transaction.pragma.emason.domain.spi.ISupplyPersistence;
import com.transaction.pragma.emason.domain.usecase.SupplyUseCase;
import com.transaction.pragma.emason.infrastructure.output.adapter.SaleJpaAdapter;
import com.transaction.pragma.emason.infrastructure.output.adapter.SupplyJpaAdapter;
import com.transaction.pragma.emason.infrastructure.output.mapper.ISaleEntityMapper;
import com.transaction.pragma.emason.infrastructure.output.mapper.ISupplyEntityMapper;
import com.transaction.pragma.emason.infrastructure.output.repository.ISaleRepository;
import com.transaction.pragma.emason.infrastructure.output.repository.ISupplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final ISupplyRepository iSupplyRepository;
    private final ISupplyEntityMapper iSupplyEntityMapper;

    private final ISaleRepository iSaleRepository;
    private final ISaleEntityMapper iSaleEntityMapper;

    @Bean
    ISupplyPersistence iSupplyPersistence() {
        return new SupplyJpaAdapter(iSupplyRepository, iSupplyEntityMapper);
    }

    @Bean
    ISalePersistence iSalePersistence(){
        return new SaleJpaAdapter(iSaleRepository, iSaleEntityMapper);
    }

    @Bean
    public ISupplyService iSupplyService() {
        return new SupplyUseCase(iSupplyPersistence(), iSalePersistence());
    }




}
