package com.transaction.pragma.emason.infrastructure.configuration;



import com.transaction.pragma.emason.domain.api.ISupplyService;
import com.transaction.pragma.emason.domain.spi.ISupplyPersistence;
import com.transaction.pragma.emason.domain.usecase.SupplyUseCase;
import com.transaction.pragma.emason.infrastructure.output.adapter.SupplyJpaAdapter;
import com.transaction.pragma.emason.infrastructure.output.mapper.ISupplyEntityMapper;
import com.transaction.pragma.emason.infrastructure.output.repository.ISupplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final ISupplyRepository iSupplyRepository;
    private final ISupplyEntityMapper iSupplyEntityMapper;

    @Bean
    ISupplyPersistence iSupplyPersistence() {
        return new SupplyJpaAdapter(iSupplyRepository, iSupplyEntityMapper);
    }

    @Bean
    public ISupplyService iSupplyService() {
        return new SupplyUseCase(iSupplyPersistence());
    }




}
