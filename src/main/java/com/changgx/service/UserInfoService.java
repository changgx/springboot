package com.changgx.service;

import com.changgx.bean.UserInfo;
import com.changgx.mapper.UserInfoMapper;
import com.changgx.util.UserInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 长歌行
 * changgx2014@163.com
 * 2016/12/19 15:13
 */
@Service
public class UserInfoService {
    private static final Logger logger = LoggerFactory
            .getLogger(UserInfoService.class);
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 根据用户名，密码查询
     * @param username
     * @param password
     * @return
     */
    public UserInfo findByUsernameAndPassword(String username,String password){
        return userInfoMapper.findByUsernameAndPassword(username, UserInfoUtil.encrypt(password));
    }

    public int insert(String username,String password){
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(UserInfoUtil.encrypt(password));
        userInfo.setCreateTime(new Date());
        userInfo.setUpdateTime(new Date());
        return userInfoMapper.insert(userInfo);
    }
}
