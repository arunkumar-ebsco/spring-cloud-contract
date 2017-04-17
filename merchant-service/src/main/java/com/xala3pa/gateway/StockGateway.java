package com.xala3pa.gateway;

import com.xala3pa.domain.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class StockGateway {
    private final RestTemplate restTemplate;
    private final String accountUrl;

    public StockGateway(RestTemplateBuilder restTemplateBuilder, @Value("${account.url}") String accountUrl) {
        this.restTemplate = restTemplateBuilder.build();
        this.accountUrl = accountUrl;
    }

    public Stock getStockFor(Item item) {

        URI uri = UriComponentsBuilder.fromUriString(accountUrl)
                .pathSegment("itemId", item.getItemId().toString())
                .build()
                .toUri();

        ResponseEntity<Stock> response = restTemplate.getForEntity(uri, Stock.class);

        return response.getBody();
    }
}
