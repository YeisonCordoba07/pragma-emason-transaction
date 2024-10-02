package com.transaction.pragma.emason.application.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SupplyRequestDTO {


    @NotNull
    private Integer idItem;

    @NotNull
    private Integer quantity;

}
