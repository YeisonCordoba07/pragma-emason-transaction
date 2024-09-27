package com.transaction.pragma.emason.infrastructure.input;


import com.transaction.pragma.emason.application.dto.SupplyRequestDTO;
import com.transaction.pragma.emason.application.handler.ISupplyHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supply")
@RequiredArgsConstructor
@Validated
public class SupplyRestController {


    private final ISupplyHandler iSupplyHandler;



    @PostMapping
    public ResponseEntity<Void> increaseSupply(@Valid @RequestBody SupplyRequestDTO supplyRequestDTO) {
        iSupplyHandler.increaseSupply(supplyRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
