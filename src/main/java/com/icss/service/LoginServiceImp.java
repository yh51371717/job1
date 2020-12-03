/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: Test.java
 * 类的详细说明
 *
 * @author 类创建者姓名
 * @Date    创建日期
 * @version 1.00
 */
package com.icss.service;

import com.icss.dao.UserDao;
import com.icss.model.Result;
import com.icss.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService{

    @Autowired
    private UserDao userDao;

    /**
     * 类方法的详细使用说明
     *
     * @param name 用户名  pwd 密码
     * @return 返回结果的说明
     * @throws NullPointerException
     */

    @Override
    public Result SelectUserByNameAndPwd(String name, String pwd) {
        User user= userDao.SelectUserByNameAndPwd(name,pwd);
        Result result=new Result();
        try{
            if (user==null){
                result.setMsg("帐号不存在");
            }else {
                result.setMsg("登陆成功");
            }
        }catch (Exception e){
         e.printStackTrace();
        }
        return  result;
    }
}
