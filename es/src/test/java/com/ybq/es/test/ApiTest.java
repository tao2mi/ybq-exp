package com.ybq.es.test;

import com.ybq.es.EsApplication;
import com.ybq.es.entity.Item;
import com.ybq.es.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EsApplication.class)
public class ApiTest {

    @Autowired
    private ItemRepository repository;
    @Autowired
    private ElasticsearchTemplate esTemplate;

    @Test
    public void createIndex() {
        esTemplate.createIndex(Item.class);
    }

    @Test
    public void deleteIndex() {
        esTemplate.deleteIndex(Item.class);
    }

    @Test
    public void insert() {
        Item item = new Item(2L, "小米手机5s", "手机", "小米", 399.33, "http://dddd");

        Item s = repository.save(item);
        System.out.println(s);
    }
}
