package com.liger.service;

import com.liger.model.User;

import java.util.List;

/**
 * Created by roc_peng on 2017/8/14.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */

public interface UserService {

    int insert(User record);

    int insertSelective(User record);

    int deleteById(Integer id);

    int updateUserSelective(User record);

    int updateUser(User record);

    User queryById(Integer id);
    List<User> queryAll();
}
