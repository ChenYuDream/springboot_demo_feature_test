package org.jypj.dev.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class SimpleBookRepositoryTest {

    @Resource
    private BookRepository bookRepository;

    @Test
    public void getByIsbn() {
        log.info(".... Fetching books");
        log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        log.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
        log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        log.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
        log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));

    }


}