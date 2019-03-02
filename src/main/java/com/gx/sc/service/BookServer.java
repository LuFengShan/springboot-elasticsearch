package com.gx.sc.service;

import com.gx.sc.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookServer extends ElasticsearchRepository<Book, Long> {
}
