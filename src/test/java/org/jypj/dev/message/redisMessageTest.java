package org.jypj.dev.message;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

/**
 * @author yu_chen
 * @create 2017-12-08 15:03
 **/
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class redisMessageTest {

    @Autowired
    private StringRedisTemplate template;

    @Autowired
    private CountDownLatch latch;


    @Test
    public void testSendMessage() throws InterruptedException {
        log.info("Sending message...");

        template.convertAndSend("chat", "Hello from Redis!");

        latch.await();
    }

}
