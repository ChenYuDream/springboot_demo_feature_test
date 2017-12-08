package org.jypj.dev.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 * REcevier类，它是一个普通的类，需要注入到springboot中。
 * @author ChenYu
 */
@Slf4j
public class Receiver {

    private CountDownLatch latch;

    @Autowired
    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String message) {
        log.info("Received <" + message + ">");
        latch.countDown();
    }
}