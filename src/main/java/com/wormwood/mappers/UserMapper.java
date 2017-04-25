package com.wormwood.mappers;

import com.wormwood.DTO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by kasimodo on 2016-07-22.
 */
@Mapper
public interface UserMapper {

        @Select("SELECT * FROM USER WHERE userName = #{name}")
        User findByName(@Param("name") String name);

}
