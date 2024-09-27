package com.transaction.pragma.emason.domain.model;

public class Supply {

    private Integer id;
    private Integer idItem;
    private Integer quantity;

    public Supply(Integer idItem, Integer quantity) {
        this.idItem = idItem;
        this.quantity = quantity;
    }

    public Supply(){}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
