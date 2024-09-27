package com.transaction.pragma.emason.application.mapper;


import com.transaction.pragma.emason.application.dto.SupplyRequestDTO;
import com.transaction.pragma.emason.domain.model.Supply;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;



@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ISupplyRequestMapper {


    Supply toSupply(SupplyRequestDTO supplyRequestDTO);


}
