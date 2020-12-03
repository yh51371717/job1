package com.icss.dao;

import com.icss.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User SelectUserByNameAndPwd(@Param("name") String name, @Param("pwd")String pwd);

}
