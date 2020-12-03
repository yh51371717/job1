
/**Title: 登陆界面

 * @author 袁昊
 * @version 3.0
 */


package com.icss.controller;

import com.icss.model.Result;
import com.icss.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

    /**
     * 类方法的详细使用说明
     *
     * @param   model,username,pwd Model对象,前台用户名,密码
     * @return 跳转至login.jsp页面
     */

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login.do")
    public String login(Model model,String username,String pwd){

        System.out.println("login.do方法");
        Result result=loginService.SelectUserByNameAndPwd(username,pwd);
        model.addAttribute("result",result);
        return "login";
    }


}
