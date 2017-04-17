package com.xala3pa.services;

import com.xala3pa.domain.Item;
import com.xala3pa.gateway.Stock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockTest {

    @Autowired
    private StockService stockService;
    public static final Integer PURCHASE_ITEMS = 2;

    @Test
    public void should_check_the_availability_for_an_item_by_id() throws Exception {
        Item kindle = new Item(100011, "Kindle", 100);

        Stock stock = stockService.checkAvailability(kindle);

        assertThat(stock.getAmount()).isGreaterThanOrEqualTo(PURCHASE_ITEMS);

    }
}
