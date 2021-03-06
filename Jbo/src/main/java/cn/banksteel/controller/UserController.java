package cn.banksteel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import cn.banksteel.service.UserService;
import org.springframework.web.servlet.ModelAndView;
import cn.banksteel.pojo.User;
import java.util.List;
/**
 * Created by DELL on 2016/7/11.
 */

@Controller
@RequestMapping("/")
public class UserController {
    //service类
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() throws Exception{
        return "index";
    }




    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/findUser")
    public String findUser() throws Exception{
        //ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
        //List<User> users = userService.findUser();
        //将得到的用户列表内容添加到ModelAndView中
       // modelAndView.addObject("users",users);
        //设置响应的jsp视图
       // modelAndView.setViewName("findUser");

        return "findUser";
    }

}
