package com.gx.sc;

import com.gx.sc.model.Book;
import com.gx.sc.service.BookServer;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootElasticsearchApplicationTests {
	@Autowired
	JestClient jestClient;

	@Test
	public void testJest() {
		Book book = new Book(1, "红龙梦", "红龙");
		// 创建一个索引
		Index build = new Index.Builder(book) // 要存入的数据
				.index("myelasticsearch") // 索引的名称（数据库）
				.type("book") // 索引的类型（表）
				.build();
		try {
			jestClient.execute(build);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Autowired
	BookServer bookServer;

	/**
	 *
	 */
	@Test
	public void testSpringbootElasticsearch_find() {
		Optional<Book> byId = bookServer.findById(1L);
		System.out.println(byId.orElse(null));
	}

	/**
	 *
	 */
	@Test
	public void testSpringbootElasticsearch_index() {
		bookServer.index(new Book(2, "好人的成长","好人"));
	}

}
