package com.example.redis;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class RedisApplicationTests {

	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Test
	void contextLoads() {

//		stringRedisTemplate.opsForValue().set("name", "1");
		stringRedisTemplate.opsForValue().increment("name");
		String i = stringRedisTemplate.opsForValue().get("name");
		System.out.println(i);
		Assert.assertEquals(i, "6");
	}

}
