package org.jypj.dev.repository;

import org.jypj.dev.entity.Book;


/**
 * @author ChenYu
 */
public interface BookRepository {

    /**
     * aa
     * @param isbn
     * @return
     */
    Book getByIsbn(String isbn);

}