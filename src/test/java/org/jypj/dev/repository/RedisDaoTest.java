package org.jypj.dev.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
@Rollback(value = false)
public class RedisDaoTest {

    @Resource
    private RedisDao redisDao;

    @Test
    public void testSetValue() {
        redisDao.setKey("chenyu", "19941128");
        System.out.println(redisDao.getValue("chenyu"));
    }


    @Test
    public void testGetValue() {


    }
}