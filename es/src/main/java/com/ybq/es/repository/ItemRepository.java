package com.ybq.es.repository;

import com.ybq.es.entity.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface ItemRepository extends ElasticsearchRepository<Item, Long> {
}
