package com.jshen.girl.mapper;

import com.jshen.girl.PO.DTO.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 访问数据库的接口
 */
public interface UserMapper {

//    推荐使用#{}，不要使用${}，存在注入风险
    @Insert("INSERT INTO user(name,phone,create_time,age) VALUES(#{name},#{phone},#{createTime},#{age})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")//keyProperty为实体类中名称，keyColumn为数据库中名称
    int insert(User user);

    @Delete("DELETE FROM user WHERE id = #{userId}")
    int delete(Long userId);

    @Update("UPDATE user SET name=#{name} WHERE id = #{id}")
    int update(User user);

    @Select("SELECT * FROM user WHERE id = #{userId}")
    @Results({
            @Result(column = "create_Time",property = "createTime",javaType = java.util.Date.class)
    })
    User findById(Long userId);

    @Select("SELECT * FROM user")
    @Results({
            @Result(column = "create_Time",property = "createTime")
    })
    List<User> findAll();


}
