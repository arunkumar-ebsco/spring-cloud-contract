package com.xala3pa.controllers;

import com.xala3pa.domains.Stock;
import com.xala3pa.services.StockService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockControlller {

    private final StockService stockService;

    public StockControlller(StockService stockService) {
        this.stockService = stockService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/itemId/{id}")
    public Stock getAccount(@PathVariable String id) {
        return stockService.getById(Integer.valueOf(id));
    }
}
