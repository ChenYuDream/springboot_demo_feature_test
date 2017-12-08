package org.jypj.dev.repository;

import org.jypj.dev.entity.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * @author ChenYu
 */
@Repository
public class SimpleBookRepository implements BookRepository {

    /**
     * 这个方法就开启了缓存策略，当缓存有这个数据的时候，会直接返回数据，不会等待去查询数据库。
     * @param isbn
     * @return
     */
    @Override
    @Cacheable("books")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return Book.builder().isbn(isbn).title("Some book").build();
    }

    /**
     * 休眠3秒
     */
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}