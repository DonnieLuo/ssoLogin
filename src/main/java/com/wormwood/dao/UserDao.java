package com.wormwood.dao;

import com.wormwood.DTO.User;
import com.wormwood.mappers.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Donnie on 2017/4/25.
 */
@Mapper
public interface UserDao {
//    @Autowired
//    private SqlSessionTemplate sqlSessionTemplate;
//    @Select("SELECT * FROM USER WHERE username = #{name}")
//    User findByName(@Param("name") String name);
        User findByName( String name);
}
