package cn.banksteel.service;

/**
 * Created by DELL on 2016/7/11.
 */

import cn.banksteel.pojo.User;

import java.util.List;

public interface UserService {


    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;

}
