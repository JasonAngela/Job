package cn.banksteel.service.impl;

import cn.banksteel.service.UserService;
import cn.banksteel.pojo.User;
import cn.banksteel.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by DELL on 2016/7/11.
 */


@Service
public class UserServiceImpl implements UserService {

    //User接口
    @Autowired
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<User> users = userMapper.selectByExample(null);

        return users;
    }
}
