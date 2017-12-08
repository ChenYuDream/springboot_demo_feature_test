package org.jypj.dev;

import org.jypj.dev.config.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Spring Boot 为我们自动配置了 JcacheCacheConfiguration、 EhCacheCacheConfiguration、
 * HazelcastCacheConfiguration、GuavaCacheConfiguration、RedisCacheConfiguration、SimpleCacheConfiguration 等
 *
 * @author ChenYu
 */
@EnableAsync
@EnableCaching
@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class SpringbootDemoFeatureTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoFeatureTestApplication.class, args);
    }


    /*@Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(3);
        executor.setMaxPoolSize(3);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("GithubLookup-");
        executor.initialize();
        return executor;
    }*/
}
