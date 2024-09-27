package com.transaction.pragma.emason.infrastructure.output.repository;

import com.transaction.pragma.emason.infrastructure.output.entity.SupplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplyRepository extends JpaRepository<SupplyEntity, Integer> {
}
