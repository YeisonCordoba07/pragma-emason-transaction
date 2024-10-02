package com.transaction.pragma.emason.infrastructure.output.repository;

import com.transaction.pragma.emason.infrastructure.output.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<SaleEntity, Integer> {
}
