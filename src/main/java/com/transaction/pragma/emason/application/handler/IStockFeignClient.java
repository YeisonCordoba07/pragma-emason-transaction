package com.transaction.pragma.emason.application.handler;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;



@FeignClient(name = "emason", url = "http://localhost:8080")
public interface IStockFeignClient {


    @PutMapping("/item/{idItem}/{increase}")
    void increaseItem(
            @PathVariable Integer idItem,
            @PathVariable Integer increase,
            @RequestHeader("Authorization") String token);


}
