package com.ybq.es.test;

import com.ybq.es.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

@SpringBootTest
public class ApiTest {

    @Autowired
    private ElasticsearchTemplate esTemplate;

    @Test
    public void createIndex() {
        esTemplate.createIndex(Item.class);
    }
}
