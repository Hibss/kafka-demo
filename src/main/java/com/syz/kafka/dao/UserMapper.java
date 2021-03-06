package com.syz.kafka.dao;

import com.syz.kafka.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select id,mobile from t_user where id in (#{idList})")
    List<User> getList(@Param("idList") List<Integer> idList);

    @Select("select id,mobile from t_user")
    List<User>  getAll();

    @Select("select * from t_user where name like #{name}")
    List<User> getByName(String name);
}