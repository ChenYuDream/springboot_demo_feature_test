package org.jypj.dev.task;

import lombok.extern.log4j.Log4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

/**
 * @author yu_chen
 * @create 2017-12-08 17:18
 **/
@Component
@Log4j
public class WorkTask {

    @Scheduled(fixedDelay = 5000)
    public void sayHello() {
        log.info("Hello World!");
    }
}
