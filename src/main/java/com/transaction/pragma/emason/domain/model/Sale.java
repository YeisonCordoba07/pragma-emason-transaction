package com.transaction.pragma.emason.domain.model;

public class Sale {

    private Integer id;
    private Integer idSupply;


    public Sale(){}

    public Sale(Integer idSupply) {
        this.idSupply = idSupply;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSupply() {
        return idSupply;
    }

    public void setIdSupply(Integer idSupply) {
        this.idSupply = idSupply;
    }

}
