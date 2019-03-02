package com.gx.sc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Document(indexName = "myelasticsearch", type = "book")
public class Book {
	private long id;
	private String bookName;
	private String authorName;
}
