package com.transaction.pragma.emason.infrastructure.output.mapper;


import com.transaction.pragma.emason.domain.model.Sale;
import com.transaction.pragma.emason.infrastructure.output.entity.SaleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ISaleEntityMapper {

    @Mapping(target = "id", ignore = true)
    SaleEntity toEntity(Sale sale);
}
