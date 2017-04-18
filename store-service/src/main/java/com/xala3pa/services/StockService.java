package com.xala3pa.services;

import com.xala3pa.domains.Stock;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    public Stock getById(Integer itemId) {
        return new Stock(100011, 4);
    }
}
