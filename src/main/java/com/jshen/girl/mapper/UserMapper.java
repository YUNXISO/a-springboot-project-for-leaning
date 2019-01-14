package com.jshen.girl.mapper;

import com.jshen.girl.PO.DTO.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Component;

/**
 * 访问数据库的接口
 */
public interface UserMapper {

//    推荐使用#{}，不要使用${}，存在注入风险
    @Insert("INSERT INTO user(name,phone,createTime,age) VALUES(#{name},#{phone},#{createTime},#{age})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")//keyProperty为实体类中名称，keyColumn为数据库中名称
    int insert(User user);
}
