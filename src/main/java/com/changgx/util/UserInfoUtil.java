package com.changgx.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 长歌行
 * changgx2014@163.com
 * 2016/12/19 15:59
 */
public class UserInfoUtil {
    /**
     * 使用md5加密密码,32位小写md5
     * 使用 lfds 作为salt
     * @param password  密码
     * @return
     */
    public static String encrypt(String password){
        //
       String  str=password+"lfds";
        String reStr = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bytes){
                int bt = b&0xff;
                if (bt < 16){
                    stringBuffer.append(0);
                }
                stringBuffer.append(Integer.toHexString(bt));
            }
            reStr = stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return reStr;
    }

}
