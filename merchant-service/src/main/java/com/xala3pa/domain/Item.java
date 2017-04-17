package com.xala3pa.domain;

public class Item {
    private final Integer itemId;
    private final String itemName;
    private Integer itemAmount;

    public Item(Integer itemId, String itemName, Integer itemAmount) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemAmount = itemAmount;
    }

    public Integer getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getItemAmount() {
        return itemAmount;
    }
}