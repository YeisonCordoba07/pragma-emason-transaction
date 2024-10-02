package com.transaction.pragma.emason.infrastructure.input;


import com.transaction.pragma.emason.application.dto.SupplyRequestDTO;
import com.transaction.pragma.emason.application.handler.ISupplyHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supply")
@RequiredArgsConstructor
@Validated
@CrossOrigin(origins = "*")
public class SupplyRestController {


    private final ISupplyHandler iSupplyHandler;



    @PostMapping
    public ResponseEntity<Void> increaseSupply(
            @Valid @RequestBody SupplyRequestDTO supplyRequestDTO,
            @RequestHeader(value = "Authorization") String token) {

        iSupplyHandler.increaseSupply(supplyRequestDTO, token);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
