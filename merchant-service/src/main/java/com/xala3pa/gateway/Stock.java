package com.xala3pa.gateway;

public class Stock {

    private Integer itemId;
    private Integer amount;

    public Stock(Integer itemId, Integer amount) {
        this.itemId = itemId;
        this.amount = amount;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Integer getAmount() {
        return amount;
    }
}
