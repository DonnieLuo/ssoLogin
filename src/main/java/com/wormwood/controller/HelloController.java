package com.wormwood.controller;

import com.wormwood.DTO.User;
import com.wormwood.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kasimodo on 2016-07-25.
 */
@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

//    @RequestMapping("/hello")
//    public String index() {
//        User temp = userMapper.findByName("2");
//        stringRedisTemplate.opsForValue().set("aaa", "111");
//        return temp.getUserPassword();
//    }

    @RequestMapping("/testRedis")
    public String bbb() {
       String bb =   stringRedisTemplate.opsForValue().get("aaa");
        return bb;
    }
    @RequestMapping("/test/t")
    public @ResponseBody String b() {
//        DataSourceHelper helper = new DataSourceHelper();
//        return helper.buildDatasource().toString();
        return "";
    }
}
