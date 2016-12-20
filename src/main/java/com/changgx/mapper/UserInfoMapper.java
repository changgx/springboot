package com.changgx.mapper;

import com.changgx.bean.UserInfo;

/**
 * 长歌行
 * changgx2014@163.com
 * 2016/12/19 15:10
 */
public interface UserInfoMapper {
    /**
     * 根据用户名，密码查询
     * @param username
     * @param password
     * @return
     */
    UserInfo findByUsernameAndPassword(String username, String password);

    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int insert(UserInfo userInfo);
}
