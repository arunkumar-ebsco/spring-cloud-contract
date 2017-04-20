package com.xala3pa.domain;

public class Item {
    private final Integer itemId;
    private final String itemName;

    public Item(Integer itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public Integer getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }
}