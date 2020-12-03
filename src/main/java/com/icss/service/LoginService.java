package com.icss.service;

import com.icss.model.Result;
import com.icss.model.User;
import org.apache.ibatis.annotations.Param;

public interface LoginService {

    Result SelectUserByNameAndPwd(@Param("name") String name, @Param("pwd")String pwd);

}
