package org.jypj.dev.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @author ChenYu
 */
@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate template;

    /**
     * redis 设置属性值
     *
     * @param key
     * @param value
     */
    public void setKey(String key, String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        //1分钟过期
        ops.set(key, value, 1, TimeUnit.MINUTES);
    }

    /**
     * 获取属性值
     *
     * @param key
     * @return
     */
    public String getValue(String key) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        return ops.get(key);
    }
}