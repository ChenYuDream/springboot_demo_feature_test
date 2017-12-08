package org.jypj.dev.config;

import org.jypj.dev.receiver.Receiver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * 消息接收者配置
 *
 * @author yu_chen
 * @create 2017-12-08 14:59
 **/
@Configuration
public class MessageReceiverConfig {

    @Bean
    Receiver receiver(CountDownLatch latch) {
        return new Receiver(latch);
    }

    @Bean
    CountDownLatch latch() {
        return new CountDownLatch(1);
    }

    @Bean
    StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
        return new StringRedisTemplate(connectionFactory);
    }

}
