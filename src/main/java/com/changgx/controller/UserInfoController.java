package com.changgx.controller;

import com.changgx.bean.UserInfo;
import com.changgx.service.UserInfoService;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 长歌行
 * changgx2014@163.com
 * 2016/12/19 16:02
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 注册
     *
     * @return
     * @RequestParam("User") String username, @RequestParam("Password") String password
     */
    @RequestMapping("/regist")
    public JSONObject regist() {
        JSONObject json=new JSONObject();
        try {
            userInfoService.insert("changgx", "123456");
            json.put("code", "0");
            json.put("msg", "注册成功");
        } catch (Exception e) {
            json.put("code", "-1");
            json.put("msg", "账号已存在");
            e.printStackTrace();
        } finally {
            return json;
        }
    }
    /**
     * 登陆
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @PostMapping("/login")
    public JSONObject login(@RequestParam("User") String username, @RequestParam("Password") String password) {
        JSONObject json = new JSONObject();
        UserInfo userInfo = null;
        try {
            userInfo = userInfoService.findByUsernameAndPassword(username, password);
            if (userInfo != null) {
                json.put("code", "0");
                json.put("msg", userInfo.toString());
            } else {
                json.put("code", "1");
                json.put("msg", "账号或者密码错误");
            }

        } catch (Exception e) {
            json.put("code", "-1");
            json.put("msg", e.getMessage());
            e.printStackTrace();
        } finally {
            return json;
        }
    }

    @PostMapping("/editPassword")
    public JSONObject editPassword(@RequestParam String username,@RequestParam String oldPwd,@RequestParam String newPwd){

        return null;
    }




}
