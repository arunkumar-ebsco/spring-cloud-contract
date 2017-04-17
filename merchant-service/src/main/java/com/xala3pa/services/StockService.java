package com.xala3pa.services;

import com.xala3pa.domain.Item;
import com.xala3pa.gateway.Stock;
import com.xala3pa.gateway.StockGateway;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    private final StockGateway stockGateway;

    public StockService(StockGateway stockGateway) {
        this.stockGateway = stockGateway;
    }

    public Stock checkAvailability(Item item) {
        return stockGateway.getStockFor(item);
    }
}
