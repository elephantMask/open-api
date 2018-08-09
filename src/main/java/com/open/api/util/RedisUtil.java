package com.open.api.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
* <p>Title: RedisUtil. </p>
* <p>Description  </p>

* @Author <a href="xmt08sky@126.com"/>mint</a> 2017/5/3 下午4:05
* @CreateDate 2017/5/3 下午4:05
*/

@Component
public class RedisUtil {

    @Autowired
    private StringRedisTemplate rt;

    /**
     * @param
     * @return
     * @Description 通过key获取自增值，不存在时返回1
     * @Author zhangft
     * @CreateDate 2016/12/9 13:45
     */
    public Long getIncreamentSequenceNum(String key) {
        ValueOperations<String, String> ops = rt.opsForValue();
        Long newValue = 1L;
        if (!rt.hasKey(key)) {
            ops.set(key, String.valueOf(1L));
        } else {
            newValue = ops.increment(key, 1L);
        }
        return newValue;
    }

}
