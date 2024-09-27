package com.transaction.pragma.emason.infrastructure.output.mapper;


import com.transaction.pragma.emason.domain.model.Supply;
import com.transaction.pragma.emason.infrastructure.output.entity.SupplyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ISupplyEntityMapper {


    SupplyEntity toEntity(Supply supply);

}
