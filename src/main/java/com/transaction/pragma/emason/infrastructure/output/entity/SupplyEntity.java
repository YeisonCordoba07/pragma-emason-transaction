package com.transaction.pragma.emason.infrastructure.output.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="supply")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer idItem;

    @Column(nullable = false)
    private Integer quantity;
}
