package com.sssoul.dao;

import com.sssoul.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("select * from itcast.tb_user where id = #{id}")
    public User FindById(Integer id);
}
